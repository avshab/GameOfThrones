package ru.skillbranch.gameofthrones.data.local.entities

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "character_table")
data class Character(

    @PrimaryKey(autoGenerate = false)
    val id: String,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "gender")
    val gender: String,

    @ColumnInfo(name = "culture")
    val culture: String,

    @ColumnInfo(name = "born")
    val born: String,

    @ColumnInfo(name = "died")
    val died: String,

    @ColumnInfo(name = "titles")
    val titles: List<String> = listOf(),

    @ColumnInfo(name = "aliases")
    val aliases: List<String> = listOf(),

    @ColumnInfo(name = "father")
    val father: String, //rel

    @ColumnInfo(name = "mother")
    val mother: String, //rel

    @ColumnInfo(name = "spouse")
    val spouse: String,

    @ColumnInfo(name = "houseId")
    val houseId: String//rel
) : Parcelable

@Parcelize
data class CharacterItem(
    val id: String,
    val house: String, //rel
    val name: String,
    val titles: List<String>,
    val aliases: List<String>
) : Parcelable

@Parcelize
data class CharacterFull(
    val id: String,
    val name: String,
    val words: String,
    val born: String,
    val died: String,
    val titles: List<String>,
    val aliases: List<String>,
    val house: String, //rel
    val father: RelativeCharacter?,
    val mother: RelativeCharacter?
) : Parcelable

@Parcelize
data class RelativeCharacter(
    val id: String,
    val name: String,
    val house: String //rel
) : Parcelable

fun initEmptyCharacter() = Character(
    id = "",
    name = "",
    gender = "",
    culture = "",
    born = "",
    died = "",
    titles = listOf(),
    aliases = listOf(),
    father = "",
    mother = "",
    spouse = "",
    houseId = ""
)