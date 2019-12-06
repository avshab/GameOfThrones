package ru.skillbranch.gameofthrones.ui.charters_list_screen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.material.tabs.TabLayout
import ru.skillbranch.gameofthrones.common.model.HousesTabs
import ru.skillbranch.gameofthrones.data.local.entities.CharacterItem
import ru.skillbranch.gameofthrones.repositories.RootRepository

class ChartersListScreenViewModel(private val repository: RootRepository) : ViewModel() {

    private var data = MutableLiveData<Map<String, List<CharacterItem>>>()

    private val query = MutableLiveData<String>("")

    init {
        data.value = mapOf()
        HousesTabs.values().forEach { houseTab ->
            repository.findCharactersByHouseName(houseTab.tabName) { characters ->
                data.value = data.value?.plus(houseTab.tabName to characters)
            }
        }
    }

    fun getData() : LiveData<Map<String, List<CharacterItem>>> {
        val result = MediatorLiveData<Map<String, List<CharacterItem>>>()
        val filterF = {
            result.value = if (query.value.isNullOrEmpty()) data.value ?: mapOf()
            else data.value!!.map { list ->
                list.key to list.value.filter { items ->
                    items.name.contains(query.value!!, true)

                }
            }.toMap()
        }
        result.addSource(data) { filterF.invoke() }
        result.addSource(query) { filterF.invoke() }
        return result
    }


    fun handleSearchQuery(queryStr: String?) {
        query.value = queryStr.orEmpty()
    }
}