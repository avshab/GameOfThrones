package ru.skillbranch.gameofthrones.common.extensions

import ru.skillbranch.gameofthrones.data.local.entities.CharacterFull
import ru.skillbranch.gameofthrones.data.local.entities.RelativeCharacter


fun CharacterFull.copy(
    id: String = this.id,
    name: String = this.name,
    words: String = this.words,
    born: String = this.born,
    died: String = this.died,
    titles: List<String> = this.titles,
    aliases: List<String> = this.aliases,
    house: String = this.house,
    father: RelativeCharacter? = this.father,
    mother: RelativeCharacter? = this.mother
) = CharacterFull(
        id,
        name,
        words,
        born,
        died,
        titles,
        aliases,
        house,
        father,
        mother
)