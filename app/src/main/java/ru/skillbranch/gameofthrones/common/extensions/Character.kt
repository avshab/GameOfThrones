package ru.skillbranch.gameofthrones.common.extensions

import ru.skillbranch.gameofthrones.data.local.entities.Character
import ru.skillbranch.gameofthrones.data.local.entities.CharacterItem
import ru.skillbranch.gameofthrones.data.local.entities.CharacterFull
import ru.skillbranch.gameofthrones.data.local.entities.RelativeCharacter

fun Character.transformToCharacterItem() = CharacterItem (
    id = this.id,
    name = this.name,
    titles = this.titles,
    aliases = this.aliases,
    house = this.houseId
)


fun Character.transformToCharacterFull() = CharacterFull (
    id = this.id,
    name = this.name,
    words = "",
    born = this.born,
    died = this.died,
    titles = this.titles,
    aliases = this.aliases,
    house = this.houseId,
    father = null,
    mother = null
)


fun Character.transformToRelativeCharacter() = RelativeCharacter (
    id = this.id,
    name = this.name,
    house = this.houseId
)
