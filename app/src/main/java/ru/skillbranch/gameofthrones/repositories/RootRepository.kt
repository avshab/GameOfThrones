package ru.skillbranch.gameofthrones.repositories

import android.util.Log
import androidx.annotation.VisibleForTesting
import androidx.constraintlayout.widget.Constraints.TAG
import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import ru.skillbranch.gameofthrones.common.extensions.*
import ru.skillbranch.gameofthrones.data.local.entities.*
import ru.skillbranch.gameofthrones.data.remote.res.CharacterRes
import ru.skillbranch.gameofthrones.network.ApiInterface
import ru.skillbranch.gameofthrones.data.remote.res.HouseRes
import ru.skillbranch.gameofthrones.database.AppDatabaseDao
import ru.skillbranch.gameofthrones.database.DatabaseModule
import ru.skillbranch.gameofthrones.network.NetworkModule


object RootRepository {

    private val apiInterface: ApiInterface = NetworkModule.INSTANSE
    private val appDatabaseDao: AppDatabaseDao = DatabaseModule.getInstanse()

    private val compositeDisposable = CompositeDisposable()
    /**
     * Получение данных о всех домах
     * @param result - колбек содержащий в себе список данных о домах
     */
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    fun getAllHouses(result: (houses: List<HouseRes>) -> Unit) {
        val finalList = mutableListOf<HouseRes>()
        for (page in 0..45) {
            compositeDisposable.add(
                apiInterface.needPage(page)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                        {
                            finalList.addAll(it)
                            result(finalList)
                        },
                        { error -> Log.i(TAG, error.toString()) }
                    ))
        }
    }

    /**
     * Получение данных о требуемых домах по их полным именам (например фильтрация всех домов)
     * @param houseNames - массив полных названий домов (смотри AppConfig)
     * @param result - колбек содержащий в себе список данных о домах
     */
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    fun getNeedHouses(vararg houseNames: String, result: (houses: List<HouseRes>) -> Unit) {

        val currentList = mutableListOf<HouseRes>()
        houseNames.forEach { houseName ->
            apiInterface.needHouse(houseName)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    {
                        currentList.addAll(it)
                        result(currentList)
                    },
                    { error -> Log.i(TAG, error.toString()) }
                )
        }
    }

    /**
     * Получение данных о требуемых домах по их полным именам и персонажах в каждом из домов
     * @param houseNames - массив полных названий домов (смотри AppConfig)
     * @param result - колбек содержащий в себе список данных о доме и персонажей в нем (Дом - Список Персонажей в нем)
     */
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    fun getNeedHouseWithCharacters(
        vararg houseNames: String,
        result: (houses: List<Pair<HouseRes, List<CharacterRes>>>) -> Unit
    ) {
        val finalList = mutableListOf<Pair<HouseRes, List<CharacterRes>>>()
        houseNames.forEach { houseName ->
            apiInterface.needHouse(houseName)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .map { houses ->
                    houses.forEach { house ->
                        val characters = mutableListOf<CharacterRes>()
                        house.swornMembers.forEach { url ->
                            this.getCharacter(url.split("/").last()) { ch ->
                                characters.add(ch)
                            }
                        }
                        finalList.add(house to characters)
                    }
                    finalList
                }
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    {
                        result(finalList)
                    },
                    { error -> Log.i(TAG, error.toString()) }
                )
        }
    }

    /**
     * Запись данных о домах в DB
     * @param houses - Список персонажей (модель HouseRes - модель ответа из сети)
     * необходимо произвести трансформацию данных
     * @param complete - колбек о завершении вставки записей db
     */
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    fun insertHouses(houses: List<HouseRes>, complete: () -> Unit) {

        compositeDisposable.add(Maybe.fromCallable { appDatabaseDao.insertAll(houses.map { it.transformToHouse() }) }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    complete()
                },
                { error -> Log.i(TAG, error.toString()) }
            ))
    }

    /**
     * Запись данных о пересонажах в DB
     * @param Characters - Список персонажей (модель CharacterRes - модель ответа из сети)
     * необходимо произвести трансформацию данных
     * @param complete - колбек о завершении вставки записей db
     */
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    fun insertCharacters(
        characters: List<CharacterRes>,
        complete: (() -> Unit)? = null,
        houseId: String = ""
    ) {
        compositeDisposable.add(Maybe.fromCallable {
            appDatabaseDao.insertCharacters(characters.map {
                it.transformToCharacter(houseId)
            })
        }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    complete?.invoke()
                },
                { error -> Log.i(TAG, error.toString()) }
            ))
    }

    /**
     * При вызове данного метода необходимо выполнить удаление всех записей в db
     * @param complete - колбек о завершении очистки db
     */
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    fun dropDb(complete: () -> Unit) {

        compositeDisposable.add(Maybe.fromCallable { appDatabaseDao.clear() }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    complete()
                },
                { error -> Log.i(TAG, error.toString()) }
            ))
    }

    /**
     * Поиск всех персонажей по имени дома, должен вернуть список краткой информации о персонажах
     * дома - смотри модель CharacterItem
     * @param name - краткое имя дома (его первычный ключ)
     * @param result - колбек содержащий в себе список краткой информации о персонажах дома
     */
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    fun findCharactersByHouseName(
        name: String,
        result: (Characters: List<CharacterItem>) -> Unit
    ) {

        compositeDisposable.add(Maybe.fromCallable { appDatabaseDao.getCharactersFromHouse(name) }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { data ->
                    result(data.map { it.transformToCharacterItem() })
                },
                { error ->
                    Log.i(TAG, error.toString())
                }
            ))
    }

    /**
     * Поиск персонажа по его идентификатору, должен вернуть полную информацию о персонаже
     * и его родственных отношения - смотри модель CharacterFull.kt
     * @param id - идентификатор персонажа
     * @param result - колбек содержащий в себе полную информацию о персонаже
     */
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    fun findCharacterFullById(id: String, result: (Character: CharacterFull) -> Unit) {

        compositeDisposable.add(Maybe.fromCallable { appDatabaseDao.getCharacter(id) }
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.io())
            .flatMap { character ->
                Maybe.fromCallable { getCharacterObservable(character.mother) }
                    .map { mother ->
                        character to mother
                    }
            }
            .observeOn(Schedulers.io())
            .concatMap {
                Maybe.fromCallable { getCharacterObservable(it.first.father) }
                    .map { father ->
                        Triple(it.first, it.second, father)
                    }
            }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                result(
                    it.first.transformToCharacterFull()
                )
                it.second.subscribe({ mother ->
                    mother?.let { motherNotNull ->
                        it.first.transformToCharacterFull()
                            .copy(mother = motherNotNull.transformToRelativeCharacter())
                    }
                }, {

                })

                it.third.subscribe({ father ->
                    father?.let { fatherNotNull ->
                        it.first.transformToCharacterFull()
                            .copy(mother = fatherNotNull.transformToRelativeCharacter())
                    }
                }, {

                })
            },
                { error ->
                    Log.i(TAG, error.toString())
                })
        )
    }

    /**
     * Метод возвращет true если в базе нет ни одной записи, иначе false
     * @param result - колбек о завершении очистки dbt
     */
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    fun isNeedUpdate(result: (isNeed: Boolean) -> Unit) {

        compositeDisposable.add(Maybe.fromCallable { appDatabaseDao.getAll() }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { data ->
                    result(data.isNullOrEmpty())
                },
                { error ->
                    Log.i(TAG, error.toString())
                }
            ))
    }

    fun getAllHousesFromDB(result: (list: List<House>) -> Unit) {

        compositeDisposable.add(Maybe.fromCallable { appDatabaseDao.getAll() }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { data ->
                    data?.let {
                        result(it)
                    }
                },
                { error ->
                    Log.i(TAG, error.toString())
                }
            ))
    }

    fun getCharacter(id: String, result: (character: CharacterRes) -> Unit) {
        compositeDisposable.add(apiInterface.needCharacter(id)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { result(it) },
                { error -> Log.i(TAG, error.toString()) }
            ))
    }

    fun getRelative(id: String, result: (relative: RelativeCharacter) -> Unit) {

        compositeDisposable.add(Maybe.fromCallable { appDatabaseDao.getCharacter(id) }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { character ->
                    character?.let {
                        result(it.transformToRelativeCharacter())
                    }
                },
                { error ->
                    Log.i(TAG, error.toString())
                }
            ))
    }

    private fun getCharacterObservable(id: String): Observable<Character?> {
        return Observable.fromCallable {
            val data = appDatabaseDao.getCharacter(id)
            if (data == null) {
                data
            } else initEmptyCharacter()
        }.doOnError { error -> Log.i(TAG, error.toString()) }

    }

    fun clearDisposable() {
        compositeDisposable.clear()
    }
}
