package ru.skillbranch.gameofthrones.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {ru.skillbranch.gameofthrones.data.local.entities.ListConverter.class})
@androidx.room.Database(entities = {ru.skillbranch.gameofthrones.data.local.entities.House.class, ru.skillbranch.gameofthrones.data.local.entities.Character.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lru/skillbranch/gameofthrones/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "appDatabaseDao", "Lru/skillbranch/gameofthrones/database/AppDatabaseDao;", "getAppDatabaseDao", "()Lru/skillbranch/gameofthrones/database/AppDatabaseDao;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.skillbranch.gameofthrones.database.AppDatabaseDao getAppDatabaseDao();
    
    public AppDatabase() {
        super();
    }
}