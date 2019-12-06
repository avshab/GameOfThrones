package ru.skillbranch.gameofthrones.ui.splash_screen

import android.util.Log
import androidx.constraintlayout.widget.Constraints
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import ru.skillbranch.gameofthrones.common.extensions.getFullName
import ru.skillbranch.gameofthrones.common.extensions.transformToHouse
import ru.skillbranch.gameofthrones.common.model.HousesTabs
import ru.skillbranch.gameofthrones.repositories.RootRepository
import java.util.concurrent.TimeUnit


class SplashScreenViewModel : ViewModel() {
    private var dataCounter = MutableLiveData<Int>()
    private var timeCounter = MutableLiveData<Boolean>()
    private val compositeDisposable = CompositeDisposable()
    private val repository = RootRepository
    init {

        dataCounter.value = 0
        timeCounter.value = false

        compositeDisposable.add(Observable.timer(5, TimeUnit.SECONDS)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe ({
                timeCounter.value = true
            }, {

            }))


        repository.isNeedUpdate { needUpdate ->
            if (needUpdate) {
                repository.getNeedHouses(
                    HousesTabs.STARK.getFullName(),
                    HousesTabs.LANNISTER.getFullName(),
                    HousesTabs.TARGARYEN.getFullName(),
                    HousesTabs.BARATHEON.getFullName(),
                    HousesTabs.GREYJOY.getFullName(),
                    HousesTabs.MARTEL.getFullName(),
                    HousesTabs.TYRELL.getFullName()
                ) { houses ->

                    repository.insertHouses(houses) {}

                    houses.forEach { house ->
                        house.swornMembers.forEach { url ->
                            repository.getCharacter( url.split("/").last() ) {
                                repository.insertCharacters(listOf(it), {
                                    dataCounter.value = dataCounter.value?.plus(1)
                                },  house.transformToHouse().id)
                            }
                        }
                    }
                }
            } else {
                dataCounter.value = HousesTabs.values().size
            }
        }
    }

    fun navigateNext(): LiveData<Boolean> {
        val result = MediatorLiveData<Boolean>()
        val filter = {
            result.value = if(dataCounter.value == HousesTabs.values().size && timeCounter.value == true) true
            else false
        }

        result.addSource(dataCounter) {filter.invoke()}
        result.addSource(timeCounter) {filter.invoke()}

        return result
    }

    fun doneNavigating() {
        dataCounter.value = null
        timeCounter.value = null
    }


    override fun onCleared() {
        super.onCleared()
        repository.clearDisposable()
    }
}
