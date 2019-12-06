package ru.skillbranch.gameofthrones.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0007J3\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\f0\u0013H\u0007J9\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00112\'\u0010\u0012\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\f0\u0013H\u0007J1\u0010\u001c\u001a\u00020\f2\'\u0010\u0012\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001d0\u0019\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\f0\u0013H\u0007J\u001b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\\\u0010#\u001a\u00020\f2\u0012\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110%\"\u00020\u001129\u0010\u0012\u001a5\u0012+\u0012)\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00190&0\u0019\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\f0\u0013H\u0007\u00a2\u0006\u0002\u0010\'JJ\u0010(\u001a\u00020\f2\u0012\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110%\"\u00020\u00112\'\u0010\u0012\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001d0\u0019\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\f0\u0013H\u0007\u00a2\u0006\u0002\u0010\'J(\u0010)\u001a\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020 0\u00192\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eH\u0007J$\u0010*\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00192\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0007J+\u0010+\u001a\u00020\f2!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110,\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\f0\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006."}, d2 = {"Lru/skillbranch/gameofthrones/repositories/RootRepository;", "", "()V", "apiInterface", "Lru/skillbranch/gameofthrones/network/ApiInterface;", "appDatabaseDao", "Lru/skillbranch/gameofthrones/database/AppDatabaseDao;", "coroutineJob", "Lkotlinx/coroutines/CompletableJob;", "localScope", "Lkotlinx/coroutines/CoroutineScope;", "dropDb", "", "complete", "Lkotlin/Function0;", "findCharacterFullById", "id", "", "result", "Lkotlin/Function1;", "Lru/skillbranch/gameofthrones/data/local/entities/CharacterFull;", "Lkotlin/ParameterName;", "name", "Character", "findCharactersByHouseName", "", "Lru/skillbranch/gameofthrones/data/local/entities/CharacterItem;", "characters", "getAllHouses", "Lru/skillbranch/gameofthrones/data/remote/res/HouseRes;", "houses", "getCharactersByUrl", "Lru/skillbranch/gameofthrones/data/remote/res/CharacterRes;", "url", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNeedHouseWithCharacters", "houseNames", "", "Lkotlin/Pair;", "([Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getNeedHouses", "insertCharacters", "insertHouses", "isNeedUpdate", "", "isNeed", "app_debug"})
public final class RootRepository {
    private static final ru.skillbranch.gameofthrones.network.ApiInterface apiInterface = null;
    private static final ru.skillbranch.gameofthrones.database.AppDatabaseDao appDatabaseDao = null;
    private static final kotlinx.coroutines.CompletableJob coroutineJob = null;
    private static final kotlinx.coroutines.CoroutineScope localScope = null;
    public static final ru.skillbranch.gameofthrones.repositories.RootRepository INSTANCE = null;
    
    /**
     * Получение данных о всех домах
     * @param result - колбек содержащий в себе список данных о домах
     */
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    public final void getAllHouses(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<ru.skillbranch.gameofthrones.data.remote.res.HouseRes>, kotlin.Unit> result) {
    }
    
    /**
     * Получение данных о требуемых домах по их полным именам (например фильтрация всех домов)
     * @param houseNames - массив полных названий домов (смотри AppConfig)
     * @param result - колбек содержащий в себе список данных о домах
     */
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    public final void getNeedHouses(@org.jetbrains.annotations.NotNull()
    java.lang.String[] houseNames, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<ru.skillbranch.gameofthrones.data.remote.res.HouseRes>, kotlin.Unit> result) {
    }
    
    /**
     * Получение данных о требуемых домах по их полным именам и персонажах в каждом из домов
     * @param houseNames - массив полных названий домов (смотри AppConfig)
     * @param result - колбек содержащий в себе список данных о доме и персонажей в нем (Дом - Список Персонажей в нем)
     */
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    public final void getNeedHouseWithCharacters(@org.jetbrains.annotations.NotNull()
    java.lang.String[] houseNames, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<? extends kotlin.Pair<ru.skillbranch.gameofthrones.data.remote.res.HouseRes, ? extends java.util.List<ru.skillbranch.gameofthrones.data.remote.res.CharacterRes>>>, kotlin.Unit> result) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCharactersByUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.skillbranch.gameofthrones.data.remote.res.CharacterRes> p1) {
        return null;
    }
    
    /**
     * Запись данных о домах в DB
     * @param houses - Список персонажей (модель HouseRes - модель ответа из сети)
     * необходимо произвести трансформацию данных
     * @param complete - колбек о завершении вставки записей db
     */
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    public final void insertHouses(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.skillbranch.gameofthrones.data.remote.res.HouseRes> houses, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> complete) {
    }
    
    /**
     * Запись данных о пересонажах в DB
     * @param Characters - Список персонажей (модель CharacterRes - модель ответа из сети)
     * необходимо произвести трансформацию данных
     * @param complete - колбек о завершении вставки записей db
     */
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    public final void insertCharacters(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.skillbranch.gameofthrones.data.remote.res.CharacterRes> characters, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> complete) {
    }
    
    /**
     * При вызове данного метода необходимо выполнить удаление всех записей в db
     * @param complete - колбек о завершении очистки db
     */
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    public final void dropDb(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> complete) {
    }
    
    /**
     * Поиск всех персонажей по имени дома, должен вернуть список краткой информации о персонажах
     * дома - смотри модель CharacterItem
     * @param name - краткое имя дома (его первычный ключ)
     * @param result - колбек содержащий в себе список краткой информации о персонажах дома
     */
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    public final void findCharactersByHouseName(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<ru.skillbranch.gameofthrones.data.local.entities.CharacterItem>, kotlin.Unit> result) {
    }
    
    /**
     * Поиск персонажа по его идентификатору, должен вернуть полную информацию о персонаже
     * и его родственных отношения - смотри модель CharacterFull.kt
     * @param id - идентификатор персонажа
     * @param result - колбек содержащий в себе полную информацию о персонаже
     */
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    public final void findCharacterFullById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super ru.skillbranch.gameofthrones.data.local.entities.CharacterFull, kotlin.Unit> result) {
    }
    
    /**
     * Метод возвращет true если в базе нет ни одной записи, иначе false
     * @param result - колбек о завершении очистки dbt
     */
    @androidx.annotation.VisibleForTesting(otherwise = androidx.annotation.VisibleForTesting.PRIVATE)
    public final void isNeedUpdate(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> result) {
    }
    
    private RootRepository() {
        super();
    }
}