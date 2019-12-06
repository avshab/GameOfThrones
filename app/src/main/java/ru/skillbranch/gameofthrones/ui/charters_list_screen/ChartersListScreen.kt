package ru.skillbranch.gameofthrones.ui.charters_list_screen

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.core.math.MathUtils
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.main_activity.*
import kotlinx.android.synthetic.main.main_activity.view.*
import ru.skillbranch.gameofthrones.R
import ru.skillbranch.gameofthrones.databinding.ChartersListFragmentBinding
import org.koin.android.viewmodel.ext.android.viewModel
import ru.skillbranch.gameofthrones.common.extensions.*
import ru.skillbranch.gameofthrones.common.model.HousesTabs
import ru.skillbranch.gameofthrones.data.local.entities.RelativeCharacter
import ru.skillbranch.gameofthrones.ui.charters_list_screen.adapters.HousesAdapter
import kotlin.math.abs

class ChartersListScreen : Fragment() {

    private lateinit var binding: ChartersListFragmentBinding

    private val viewModel: ChartersListScreenViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        requireActivity().appbar.visibility = View.VISIBLE

        binding = DataBindingUtil.inflate(
            inflater, R.layout.charters_list_fragment, container, false
        )
        binding.lifecycleOwner = this
        binding.charactersListViewModel = viewModel

        val adapter = HousesAdapter { item, tab ->
            val arg = RelativeCharacter(item.id, item.name, tab.tabName)

            findNavController().navigate(
                ChartersListScreenDirections.actionChartersListScreenToCharacterScreen(arg)
            )
        }

        viewModel.getData().observe(this, Observer {
            it?.let {
                adapter.housesCharacters = it
                adapter.notifyDataSetChanged()
            }
        })

        binding.housesViewPager.run {

            this.adapter = adapter
            orientation = ViewPager2.ORIENTATION_HORIZONTAL

            clipToPadding = false
            clipChildren = false
            setPageTransformer { page, position ->
                page.alpha = 1 - abs(position)
                page.rotationY = position * -30
                page.scaleX = MathUtils.clamp(1.5f - abs(position), 0f, 1f)
                page.scaleY = MathUtils.clamp(1.5f - abs(position), 0f, 1f)
            }
        }

        binding.housesTabLayout.setupWithViewPager2(
            binding.housesViewPager,
            listOf(
                HousesTabs.STARK.tabName,
                HousesTabs.LANNISTER.tabName,
                HousesTabs.TARGARYEN.tabName,
                HousesTabs.BARATHEON.tabName,
                HousesTabs.GREYJOY.tabName,
                HousesTabs.MARTEL.tabName,
                HousesTabs.TYRELL.tabName
            )
        )

        binding.housesTabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {

                findTab(tab?.position ?: -1)?.let { tab ->

                    binding.housesTabLayout.setBackgroundColor(
                        ContextCompat.getColor(
                            requireContext(),
                            tab.getPrimaryColor()
                        )
                    )

                    binding.root.setBackgroundColor(
                        ContextCompat.getColor(
                            requireContext(),
                            tab.getPrimaryColor()
                        )
                    )

                    requireActivity().window.statusBarColor = ContextCompat.getColor(
                        requireContext(),
                        tab.getDarkColor()
                    )

                    requireActivity().toolbar.setBackgroundColor( ContextCompat.getColor(
                        requireContext(),
                        tab.getPrimaryColor()
                    ))
                }
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {}

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
        })


        return binding.root
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {

        inflater.inflate(R.menu.menu_search, menu)

        val searchView = menu.findItem(R.id.menu_action_search)?.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                viewModel.handleSearchQuery(query)
                return true
            }

            override fun onQueryTextChange(query: String?): Boolean {
                viewModel.handleSearchQuery(query)
                return true
            }
        })

        super.onCreateOptionsMenu(menu, inflater)
    }
}