package ru.skillbranch.gameofthrones.common.extensions

import ru.skillbranch.gameofthrones.data.local.entities.Character
import ru.skillbranch.gameofthrones.data.remote.res.CharacterRes

fun CharacterRes.transformToCharacter(houseId: String) = Character(
    id = this.url.split("/").last(),
    name = this.name,
    gender = this.gender,
    culture = this.culture,
    born = this.born,
    died = this.died,
    titles = this.titles,
    aliases = this.aliases,
    father = this.father.split("/").last(),
    mother = this.mother.split("/").last(),
    spouse = this.spouse,
    houseId = houseId
)