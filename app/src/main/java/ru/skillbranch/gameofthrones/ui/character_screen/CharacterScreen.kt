package ru.skillbranch.gameofthrones.ui.character_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.character_screen.view.*
import kotlinx.android.synthetic.main.main_activity.*
import ru.skillbranch.gameofthrones.R
import ru.skillbranch.gameofthrones.databinding.CharacterScreenBinding
import org.koin.android.viewmodel.ext.android.viewModel
import ru.skillbranch.gameofthrones.common.extensions.getAccentColor
import ru.skillbranch.gameofthrones.common.extensions.getDarkColor
import ru.skillbranch.gameofthrones.common.extensions.getHerb
import ru.skillbranch.gameofthrones.common.extensions.getPrimaryColor
import ru.skillbranch.gameofthrones.common.model.HousesTabs

class CharacterScreen : Fragment() {

    private lateinit var binding: CharacterScreenBinding

    private val viewModel: CharacterScreenViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        setHasOptionsMenu(true)

        requireActivity().appbar.visibility = View.GONE

        binding = DataBindingUtil.inflate(
            inflater, R.layout.character_screen, container, false
        )
        binding.lifecycleOwner = this


        val args by navArgs<CharacterScreenArgs>()
        val character = args.relativeCharacter
        viewModel.setData(character)

        binding.characterViewModel = viewModel

        viewModel.isDied().observe(this, Observer {
            if (!it.isNullOrEmpty()) {
                Snackbar.make(
                    binding.root,
                    "${character.name} - ${it}", Snackbar.LENGTH_INDEFINITE
                )
            }
        })

        viewModel.getHouseTab().observe(this, Observer {
            it?.let { tab ->
                configureView(tab)
            }
        })

        return binding.root
    }

    fun configureView(houseTab: HousesTabs) {
        binding.characterHouseIcon.background =
            resources.getDrawable(houseTab.getHerb(), requireActivity().theme)


        with(binding.fatherActionButton) {
            setBackgroundColor(
                resources.getColor(
                    houseTab.getPrimaryColor(),
                    requireActivity().theme
                )
            )

            setTextColor(
                resources.getColor(
                    houseTab.getAccentColor(),
                    requireActivity().theme
                )
            )
        }

        with(binding.motherActionButton) {
            setBackgroundColor(
                resources.getColor(
                    houseTab.getPrimaryColor(),
                    requireActivity().theme
                )
            )

            setTextColor(
                resources.getColor(
                    houseTab.getAccentColor(),
                    requireActivity().theme
                )
            )
        }

        requireActivity().window.statusBarColor = ContextCompat.getColor(
            requireContext(),
            houseTab.getDarkColor()
        )

        requireActivity().toolbar.setBackgroundColor( ContextCompat.getColor(
            requireContext(),
            houseTab.getPrimaryColor()
        ))

        binding.characterNameTextView.setTextColor(resources.getColor(
            houseTab.getAccentColor(),
            requireActivity().theme
        ))
    }


}
