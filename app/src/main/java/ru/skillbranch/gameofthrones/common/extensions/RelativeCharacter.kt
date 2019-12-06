package ru.skillbranch.gameofthrones.common.extensions

import ru.skillbranch.gameofthrones.data.local.entities.RelativeCharacter

fun RelativeCharacter.copy(
    id: String = this.id,
    name: String = this.name,
    house: String = this.house
) = RelativeCharacter(
    id,
    name,
    house
)