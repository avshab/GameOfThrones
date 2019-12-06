package ru.skillbranch.gameofthrones.common.extensions

import ru.skillbranch.gameofthrones.AppConfig
import ru.skillbranch.gameofthrones.common.model.HousesTabs
import ru.skillbranch.gameofthrones.data.local.entities.House
import ru.skillbranch.gameofthrones.data.remote.res.HouseRes

fun HouseRes.transformToHouse() = House(
    id = this.getShortName(),
    name = this.name,
    region = this.region,
    coatOfArms = this.coatOfArms,
    words = this.words,
    titles = this.titles,
    seats = this.seats,
    currentLord = this.currentLord,
    heir = this.heir,
    overlord = this.overlord,
    founded = this.founded,
    founder = this.founder,
    diedOut = this.diedOut,
    ancestralWeapons = this.ancestralWeapons
)

fun HouseRes.getShortName() = when (AppConfig.NEED_HOUSES.indexOf(name)) {
    0 -> HousesTabs.STARK.tabName
    1 -> HousesTabs.LANNISTER.tabName
    2 -> HousesTabs.TARGARYEN.tabName
    3 -> HousesTabs.BARATHEON.tabName
    4 -> HousesTabs.GREYJOY.tabName
    5 -> HousesTabs.MARTEL.tabName
    6 -> HousesTabs.TYRELL.tabName
    else -> ""
}
