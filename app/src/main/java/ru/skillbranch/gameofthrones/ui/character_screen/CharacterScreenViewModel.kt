package ru.skillbranch.gameofthrones.ui.character_screen

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import ru.skillbranch.gameofthrones.common.extensions.initHousesTabs
import ru.skillbranch.gameofthrones.common.model.HousesTabs
import ru.skillbranch.gameofthrones.data.local.entities.CharacterFull
import ru.skillbranch.gameofthrones.data.local.entities.RelativeCharacter
import ru.skillbranch.gameofthrones.repositories.RootRepository

class CharacterScreenViewModel(private val repository: RootRepository) : ViewModel() {

    var characterFull = MutableLiveData<CharacterFull>()

    var titles = Transformations.map(characterFull) {
        it.titles.joinToString("\n")
    }

    var aliases = Transformations.map(characterFull) {
        it.aliases.joinToString("\n")
    }

    private var houseTab = MutableLiveData<HousesTabs>()

    fun setData(data: RelativeCharacter) {
        houseTab.value = initHousesTabs(data.house)

        repository.findCharacterFullById(data.id) { currentData ->
            characterFull.value = currentData.copy(house = data.house)
        }
    }

    fun isDied() = Transformations.map(characterFull) {
        return@map it.died
    }

    fun getHouseTab() = houseTab


    fun navigateToRelative(id: String) {

    }

    override fun onCleared() {
        super.onCleared()
        repository.clearDisposable()
    }
}