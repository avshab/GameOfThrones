package ru.skillbranch.gameofthrones.repositories

import android.util.Log
import androidx.annotation.VisibleForTesting
import androidx.constraintlayout.widget.Constraints.TAG
import kotlinx.coroutines.*
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
    private val coroutineJob = Job()
    private val localScope = CoroutineScope(Dispatchers.Main + coroutineJob)


    /**
     * Получение данных о всех домах
     * @param result - колбек содержащий в себе список данных о домах
     */
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    fun getAllHouses(result: (houses: List<HouseRes>) -> Unit) {
        val fullList = mutableListOf<HouseRes>()
        localScope.launch {
            var pageNumber = 1
            while (true) {

                try {
                    val data = apiInterface.needPage(pageNumber++)
                    if (data.isNullOrEmpty()) {
                        break
                    }
                    fullList.addAll(apiInterface.needPage(pageNumber++))
                } catch (error: Exception) {
                    Log.i(TAG, error.toString())
                    break
                }
            }

        }.invokeOnCompletion { result(fullList) }
    }

    /**
     * Получение данных о требуемых домах по их полным именам (например фильтрация всех домов)
     * @param houseNames - массив полных названий домов (смотри AppConfig)
     * @param result - колбек содержащий в себе список данных о домах
     */
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    fun getNeedHouses(vararg houseNames: String, result: (houses: List<HouseRes>) -> Unit) {

        val currentList = mutableListOf<HouseRes>()

        localScope.launch {
            houseNames.forEach { houseName ->
                try {
                    currentList.addAll(apiInterface.needHouse(houseName))
                } catch (error: Exception) {
                    Log.i(TAG, error.toString())
                }
            }
        }.invokeOnCompletion { result(currentList) }
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
        localScope.launch {
            houseNames.forEach { houseName ->
                try {
                    val houses = apiInterface.needHouse(houseName)
                    houses.forEach { house ->
                        val characters = house.swornMembers.map { url ->
                            getCharactersByUrl(url)
                        }.filterNotNull()
                        finalList.add(house to characters)
                    }

                } catch (error: Exception) {
                    Log.i(TAG, error.toString())
                }
            }
        }.invokeOnCompletion { result(finalList) }
    }

    suspend fun getCharactersByUrl(url: String) = try {
        apiInterface.needCharacter(url.split("/").last())
    } catch (error: Exception) {
        Log.i(TAG, error.toString())
        null
    }

    /**
     * Запись данных о домах в DB
     * @param houses - Список персонажей (модель HouseRes - модель ответа из сети)
     * необходимо произвести трансформацию данных
     * @param complete - колбек о завершении вставки записей db
     */
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    fun insertHouses(houses: List<HouseRes>, complete: () -> Unit) {

        localScope.launch {
            try {
                val task = async(Dispatchers.IO) {
                    appDatabaseDao.insertAll(houses.map { it.transformToHouse() })
                    return@async true
                }
                task.await()
                complete?.invoke()
            } catch (error: Exception) {
                Log.i(TAG, error.toString())
            }
        }
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
        complete: (() -> Unit)? = null
    ) {
        localScope.launch {
            try {
                val task = async(Dispatchers.IO) {
                    appDatabaseDao.insertAllCharacters(characters.map { it.transformToCharacter() })
                    return@async true
                }
                task.await()
                complete?.invoke()
            } catch (error: Exception) {
                Log.i(TAG, error.toString())
            }
        }
    }

    /**
     * При вызове данного метода необходимо выполнить удаление всех записей в db
     * @param complete - колбек о завершении очистки db
     */
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    fun dropDb(complete: () -> Unit) {
        localScope.launch {
            try {
                val task = async(Dispatchers.IO) {
                    appDatabaseDao.clear()
                    appDatabaseDao.clearCharacters()
                    return@async true
                }
                task.await()
                complete()
            } catch (error: Exception) {
                Log.i(TAG, error.toString())
            }
        }
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
        result: (characters: List<CharacterItem>) -> Unit
    ) {
        localScope.launch {
            try {
                val task = async(Dispatchers.IO) {
                    return@async appDatabaseDao.getCharactersFromHouse(name).map {
                        it.transformToCharacterItem()
                    }
                }
                val taskResult = task.await()
                taskResult?.let {
                    result(it)
                }
            } catch (error: Exception) {
                Log.i(TAG, error.toString())
            }
        }
    }

    /**
     * Поиск персонажа по его идентификатору, должен вернуть полную информацию о персонаже
     * и его родственных отношения - смотри модель CharacterFull.kt
     * @param id - идентификатор персонажа
     * @param result - колбек содержащий в себе полную информацию о персонаже
     */
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    fun findCharacterFullById(id: String, result: (Character: CharacterFull) -> Unit) {

        localScope.launch {
            try {
                val task = async(Dispatchers.IO) {
                    appDatabaseDao.getCharacter(id)?.let { character ->
                        return@async character.transformToCharacterFull().copy(
                            father = appDatabaseDao.getCharacter(character.father.split("/").last())?.transformToRelativeCharacter(),
                            mother = appDatabaseDao.getCharacter(character.mother.split("/").last())?.transformToRelativeCharacter()
                        )
                    }
                    return@async null
                }
                val taskResult = task.await()
                taskResult?.let {
                    result(it)
                }

            } catch (error: Exception) {
                Log.i(TAG, error.toString())
            }
        }
    }

    /**
     * Метод возвращет true если в базе нет ни одной записи, иначе false
     * @param result - колбек о завершении очистки dbt
     */
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    fun isNeedUpdate(result: (isNeed: Boolean) -> Unit) {

        localScope.launch {
            try {
                val task = async(Dispatchers.IO) {
                    return@async appDatabaseDao.getAll().size == 0
                }
                val taskResult = task.await()
                result(taskResult)
            } catch (error: Exception) {
                Log.i(TAG, error.toString())
            }
        }
    }
}
