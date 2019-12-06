package ru.skillbranch.gameofthrones.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0003H\'J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\nH\'J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\bH\'J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\bH\'J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0010\u001a\u00020\bH\'J\n\u0010\u0011\u001a\u0004\u0018\u00010\fH\'J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0006H\'J\u0016\u0010\u0014\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\'J\u0016\u0010\u0015\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\nH\'J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\fH\'\u00a8\u0006\u0018"}, d2 = {"Lru/skillbranch/gameofthrones/database/AppDatabaseDao;", "", "clear", "", "clearCharacters", "get", "Lru/skillbranch/gameofthrones/data/local/entities/House;", "key", "", "getAll", "", "getAllCharacters", "Lru/skillbranch/gameofthrones/data/local/entities/Character;", "getCharacter", "getCharacterByName", "getCharactersFromHouse", "houseId", "getLastCharacter", "insert", "data", "insertAll", "insertAllCharacters", "insertCharacter", "character", "app_debug"})
public abstract interface AppDatabaseDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.gameofthrones.data.local.entities.House data);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.skillbranch.gameofthrones.data.local.entities.House> data);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM house_table WHERE id = :key")
    public abstract ru.skillbranch.gameofthrones.data.local.entities.House get(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @androidx.room.Query(value = "DELETE FROM house_table")
    public abstract void clear();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM house_table")
    public abstract java.util.List<ru.skillbranch.gameofthrones.data.local.entities.House> getAll();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertCharacter(@org.jetbrains.annotations.NotNull()
    ru.skillbranch.gameofthrones.data.local.entities.Character character);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAllCharacters(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.skillbranch.gameofthrones.data.local.entities.Character> data);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM character_table WHERE id = :key")
    public abstract ru.skillbranch.gameofthrones.data.local.entities.Character getCharacter(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @androidx.room.Query(value = "DELETE FROM character_table")
    public abstract void clearCharacters();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM character_table WHERE name = :key")
    public abstract ru.skillbranch.gameofthrones.data.local.entities.Character getCharacterByName(@org.jetbrains.annotations.NotNull()
    java.lang.String key);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM character_table")
    public abstract java.util.List<ru.skillbranch.gameofthrones.data.local.entities.Character> getAllCharacters();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM character_table ORDER BY id DESC LIMIT 1")
    public abstract ru.skillbranch.gameofthrones.data.local.entities.Character getLastCharacter();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM character_table WHERE houseId LIKE :houseId")
    public abstract java.util.List<ru.skillbranch.gameofthrones.data.local.entities.Character> getCharactersFromHouse(@org.jetbrains.annotations.NotNull()
    java.lang.String houseId);
}