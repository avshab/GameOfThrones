package ru.skillbranch.gameofthrones.common.extensions

import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

fun TabLayout.setupWithViewPager2(viewPager: ViewPager2, labels: List<String>) {
//
//    if (labels.size != viewPager.adapter?.itemCount)
//        throw Exception("The size of list and the tab count should be equal!")

    TabLayoutMediator(this, viewPager,
        TabLayoutMediator.TabConfigurationStrategy { tab, position ->
            tab.text = labels[position]
        }).attach()
}