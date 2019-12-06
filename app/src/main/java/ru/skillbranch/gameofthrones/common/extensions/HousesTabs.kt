package ru.skillbranch.gameofthrones.common.extensions

import android.graphics.drawable.Drawable
import ru.skillbranch.gameofthrones.AppConfig
import ru.skillbranch.gameofthrones.R
import ru.skillbranch.gameofthrones.common.model.HousesTabs

fun initHousesTabs(name: String) : HousesTabs? = when (name) {
    HousesTabs.STARK.tabName -> HousesTabs.STARK
    HousesTabs.LANNISTER.tabName -> HousesTabs.LANNISTER
    HousesTabs.TARGARYEN.tabName -> HousesTabs.TARGARYEN
    HousesTabs.BARATHEON.tabName -> HousesTabs.BARATHEON
    HousesTabs.GREYJOY.tabName -> HousesTabs.GREYJOY
    HousesTabs.MARTEL.tabName -> HousesTabs.MARTEL
    HousesTabs.TYRELL.tabName -> HousesTabs.TYRELL
    else -> null
}

fun initHousesTabsByFullName(name: String) : HousesTabs? = when (name) {
    HousesTabs.STARK.getFullName() -> HousesTabs.STARK
    HousesTabs.LANNISTER.getFullName() -> HousesTabs.LANNISTER
    HousesTabs.TARGARYEN.getFullName() -> HousesTabs.TARGARYEN
    HousesTabs.BARATHEON.getFullName() -> HousesTabs.BARATHEON
    HousesTabs.GREYJOY.getFullName() -> HousesTabs.GREYJOY
    HousesTabs.MARTEL.getFullName() -> HousesTabs.MARTEL
    HousesTabs.TYRELL.getFullName() -> HousesTabs.TYRELL
    else -> null
}

fun HousesTabs.getFullName() = when (this) {
    HousesTabs.STARK -> AppConfig.NEED_HOUSES[0]
    HousesTabs.LANNISTER -> AppConfig.NEED_HOUSES[1]
    HousesTabs.TARGARYEN -> AppConfig.NEED_HOUSES[2]
    HousesTabs.BARATHEON -> AppConfig.NEED_HOUSES[3]
    HousesTabs.GREYJOY -> AppConfig.NEED_HOUSES[4]
    HousesTabs.MARTEL -> AppConfig.NEED_HOUSES[5]
    HousesTabs.TYRELL -> AppConfig.NEED_HOUSES[6]
}

fun HousesTabs.getPosition() = when (this) {
    HousesTabs.STARK -> 0
    HousesTabs.LANNISTER -> 1
    HousesTabs.TARGARYEN -> 2
    HousesTabs.BARATHEON -> 3
    HousesTabs.GREYJOY -> 4
    HousesTabs.MARTEL -> 5
    HousesTabs.TYRELL -> 6
}

fun findTab(position: Int) = when (position) {
    0 -> HousesTabs.STARK
    1 -> HousesTabs.LANNISTER
    2 -> HousesTabs.TARGARYEN
    3 -> HousesTabs.BARATHEON
    4 -> HousesTabs.GREYJOY
    5 -> HousesTabs.MARTEL
    6 -> HousesTabs.TYRELL
    else -> null
}

fun HousesTabs.getIcon() = when (this) {
    HousesTabs.STARK -> R.drawable.stark_icon
    HousesTabs.LANNISTER -> R.drawable.lanister_icon
    HousesTabs.TARGARYEN -> R.drawable.targaryen_icon
    HousesTabs.BARATHEON -> R.drawable.baratheon_icon
    HousesTabs.GREYJOY -> R.drawable.greyjoy_icon
    HousesTabs.MARTEL -> R.drawable.martel_icon
    HousesTabs.TYRELL -> R.drawable.tyrel_icon
}

fun HousesTabs.getHerb() = when (this) {
    HousesTabs.STARK -> R.drawable.stark_coast_of_arms
    HousesTabs.LANNISTER -> R.drawable.lannister__coast_of_arms
    HousesTabs.TARGARYEN -> R.drawable.targaryen_coast_of_arms
    HousesTabs.BARATHEON -> R.drawable.baratheon
    HousesTabs.GREYJOY -> R.drawable.greyjoy_coast_of_arms
    HousesTabs.MARTEL -> R.drawable.martel_coast_of_arms
    HousesTabs.TYRELL -> R.drawable.tyrel_coast_of_arms
}

fun HousesTabs.getPrimaryColor() = when (this) {
    HousesTabs.STARK -> R.color.stark_primary
    HousesTabs.LANNISTER -> R.color.lannister_primary
    HousesTabs.TARGARYEN -> R.color.targaryen_primary
    HousesTabs.BARATHEON -> R.color.baratheon_primary
    HousesTabs.GREYJOY -> R.color.greyjoy_primary
    HousesTabs.MARTEL -> R.color.martel_primary
    HousesTabs.TYRELL -> R.color.tyrel_primary
}

fun HousesTabs.getDarkColor() = when (this) {
    HousesTabs.STARK -> R.color.stark_dark
    HousesTabs.LANNISTER -> R.color.lannister_dark
    HousesTabs.TARGARYEN -> R.color.targaryen_dark
    HousesTabs.BARATHEON -> R.color.baratheon_dark
    HousesTabs.GREYJOY -> R.color.greyjoy_dark
    HousesTabs.MARTEL -> R.color.martel_dark
    HousesTabs.TYRELL -> R.color.tyrel_dark
}

fun HousesTabs.getAccentColor() = when (this) {
    HousesTabs.STARK -> R.color.stark_accent
    HousesTabs.LANNISTER -> R.color.lannister_accent
    HousesTabs.TARGARYEN -> R.color.targaryen_accent
    HousesTabs.BARATHEON -> R.color.baratheon_accent
    HousesTabs.GREYJOY -> R.color.greyjoy_accent
    HousesTabs.MARTEL -> R.color.martel_accent
    HousesTabs.TYRELL -> R.color.tyrel_accent
}