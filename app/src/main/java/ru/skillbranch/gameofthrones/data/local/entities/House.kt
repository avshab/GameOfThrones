package ru.skillbranch.gameofthrones.data.local.entities

import androidx.room.*


@Entity(tableName = "house_table")
data class House(

    @PrimaryKey(autoGenerate = false)
    val id: String,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "region")
    val region: String,

    @ColumnInfo(name = "coatOfArms")
    val coatOfArms: String,

    @ColumnInfo(name = "words")
    val words: String,

    @ColumnInfo(name = "seats")
    val titles: List<String>,

    @ColumnInfo(name = "titles")
    val seats: List<String>,

    @ColumnInfo(name = "currentLord")
    val currentLord: String, //rel

    @ColumnInfo(name = "heir")
    val heir: String, //rel

    @ColumnInfo(name = "overlord")
    val overlord: String,

    @ColumnInfo(name = "founded")
    val founded: String,

    @ColumnInfo(name = "founder")
    val founder: String, //rel

    @ColumnInfo(name = "diedOut")
    val diedOut: String,

    @ColumnInfo(name = "ancestralWeapons")
    val ancestralWeapons: List<String>
)


class ListConverter {
    @TypeConverter
    fun fromString(value: String): List<String> = value.split(";")

    @TypeConverter
    fun fromArrayList(list: List<String>) = list.joinToString(";")
}