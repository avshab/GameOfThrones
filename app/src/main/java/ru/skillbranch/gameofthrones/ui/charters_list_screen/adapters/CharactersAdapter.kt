package ru.skillbranch.gameofthrones.ui.charters_list_screen.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import ru.skillbranch.gameofthrones.R
import ru.skillbranch.gameofthrones.common.extensions.getIcon
import ru.skillbranch.gameofthrones.common.model.HousesTabs
import ru.skillbranch.gameofthrones.data.local.entities.CharacterItem
import ru.skillbranch.gameofthrones.databinding.ItemCharacterBinding


class CharactersAdapter(
    private val tabName: HousesTabs,
    private val clickListener: (CharacterItem, HousesTabs) -> Unit
) : ListAdapter<CharacterItem, CharactersAdapter.ViewHolder>(
    CharacterDiffCallback()
) {

    var characters: List<CharacterItem> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = DataBindingUtil.inflate<ItemCharacterBinding>(
            LayoutInflater.from(parent.context), R.layout.item_character, parent, false
        )
        return ViewHolder(
            binding
        )
    }

    override fun getItemCount(): Int = characters.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) =
        holder.bind(
            tabName,
            characters[position],
            clickListener
        )

    class ViewHolder(private val binding: ItemCharacterBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(
            tabName: HousesTabs,
            character: CharacterItem,
            clickListener: (CharacterItem, HousesTabs) -> Unit
        ) {
            binding.ivItemCharacterIcon.load(tabName.getIcon())
            binding.listItemCharacterName = if (character.name.isEmpty()) "Information is unknown"
            else character.name


            var info = character.titles.joinToString(" • ")
            if (info.isNotEmpty() && character.aliases.isNotEmpty()) {
                info += " - " + character.aliases.joinToString(" • ")
            }

            binding.listItemCharacterInfo = if(info.isEmpty()) "Information is unknown"
            else info

            binding.root.setOnClickListener{ clickListener.invoke(character, tabName) }
        }
    }
}

class CharacterDiffCallback : DiffUtil.ItemCallback<CharacterItem>() {

    override fun areItemsTheSame(oldItem: CharacterItem, newItem: CharacterItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: CharacterItem, newItem: CharacterItem): Boolean {
        return oldItem.id == newItem.id
    }
}
