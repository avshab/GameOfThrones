package ru.skillbranch.gameofthrones.data.local.entities;

import java.lang.System;

@androidx.room.Entity(tableName = "house_table")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\u00a7\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u000206H\u00d6\u0001J\t\u00107\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016\u00a8\u00068"}, d2 = {"Lru/skillbranch/gameofthrones/data/local/entities/House;", "", "id", "", "name", "region", "coatOfArms", "words", "titles", "", "seats", "currentLord", "heir", "overlord", "founded", "founder", "diedOut", "ancestralWeapons", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAncestralWeapons", "()Ljava/util/List;", "getCoatOfArms", "()Ljava/lang/String;", "getCurrentLord", "getDiedOut", "getFounded", "getFounder", "getHeir", "getId", "getName", "getOverlord", "getRegion", "getSeats", "getTitles", "getWords", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class House {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey(autoGenerate = false)
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "region")
    private final java.lang.String region = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "coatOfArms")
    private final java.lang.String coatOfArms = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "words")
    private final java.lang.String words = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "seats")
    private final java.util.List<java.lang.String> titles = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "titles")
    private final java.util.List<java.lang.String> seats = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "currentLord")
    private final java.lang.String currentLord = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "heir")
    private final java.lang.String heir = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "overlord")
    private final java.lang.String overlord = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "founded")
    private final java.lang.String founded = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "founder")
    private final java.lang.String founder = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "diedOut")
    private final java.lang.String diedOut = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "ancestralWeapons")
    private final java.util.List<java.lang.String> ancestralWeapons = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRegion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoatOfArms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWords() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTitles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getSeats() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentLord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHeir() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOverlord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFounded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFounder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDiedOut() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getAncestralWeapons() {
        return null;
    }
    
    public House(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String region, @org.jetbrains.annotations.NotNull()
    java.lang.String coatOfArms, @org.jetbrains.annotations.NotNull()
    java.lang.String words, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> titles, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> seats, @org.jetbrains.annotations.NotNull()
    java.lang.String currentLord, @org.jetbrains.annotations.NotNull()
    java.lang.String heir, @org.jetbrains.annotations.NotNull()
    java.lang.String overlord, @org.jetbrains.annotations.NotNull()
    java.lang.String founded, @org.jetbrains.annotations.NotNull()
    java.lang.String founder, @org.jetbrains.annotations.NotNull()
    java.lang.String diedOut, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> ancestralWeapons) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.gameofthrones.data.local.entities.House copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String region, @org.jetbrains.annotations.NotNull()
    java.lang.String coatOfArms, @org.jetbrains.annotations.NotNull()
    java.lang.String words, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> titles, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> seats, @org.jetbrains.annotations.NotNull()
    java.lang.String currentLord, @org.jetbrains.annotations.NotNull()
    java.lang.String heir, @org.jetbrains.annotations.NotNull()
    java.lang.String overlord, @org.jetbrains.annotations.NotNull()
    java.lang.String founded, @org.jetbrains.annotations.NotNull()
    java.lang.String founder, @org.jetbrains.annotations.NotNull()
    java.lang.String diedOut, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> ancestralWeapons) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}