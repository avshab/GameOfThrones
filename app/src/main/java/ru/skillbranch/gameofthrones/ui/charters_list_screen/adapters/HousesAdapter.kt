package ru.skillbranch.gameofthrones.ui.charters_list_screen.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import ru.skillbranch.gameofthrones.R
import ru.skillbranch.gameofthrones.common.extensions.findTab
import ru.skillbranch.gameofthrones.common.extensions.verticalDividerDecoration
import ru.skillbranch.gameofthrones.common.model.HousesTabs
import ru.skillbranch.gameofthrones.data.local.entities.CharacterItem
import ru.skillbranch.gameofthrones.databinding.ItemViewPageBinding

class HousesAdapter(private val clickListener: (CharacterItem, HousesTabs) -> Unit) :
    ListAdapter<Pair<String, List<CharacterItem>>, HousesAdapter.ViewHolder>(
        ChartersViewPagerDiffCallback()
    ) {

    var housesCharacters: Map<String, List<CharacterItem>> = mapOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemViewPageBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(
            binding
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tab = requireNotNull(findTab(position))
        val list = housesCharacters.get(tab.tabName) ?: listOf()

        return holder.bind(list, tab, clickListener)
    }

    override fun getItemCount(): Int = housesCharacters.size


    inner class ViewHolder(
        private val binding: ItemViewPageBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(
            housesCharacters: List<CharacterItem>,
            houseTab: HousesTabs,
            clickListener: (CharacterItem, HousesTabs) -> Unit
        ) {
            val adapter = CharactersAdapter(houseTab, clickListener)
            adapter.characters = housesCharacters

            binding.houseCharactersRecyclerView?.adapter = adapter
            binding.houseCharactersRecyclerView?.adapter?.notifyDataSetChanged()


            binding.houseCharactersRecyclerView.apply {
                this?.verticalDividerDecoration(
                    R.drawable.line_divider,
                    R.dimen.divider_margin
                )
            }
        }
    }
}

//TODO
class ChartersViewPagerDiffCallback : DiffUtil.ItemCallback<Pair<String, List<CharacterItem>>>() {

    override fun areItemsTheSame(
        oldItem: Pair<String, List<CharacterItem>>,
        newItem: Pair<String, List<CharacterItem>>
    ): Boolean {
        return oldItem.first == newItem.first
    }

    override fun areContentsTheSame(
        oldItem: Pair<String, List<CharacterItem>>,
        newItem: Pair<String, List<CharacterItem>>
    ): Boolean {
        return oldItem.first == newItem.first
    }
}