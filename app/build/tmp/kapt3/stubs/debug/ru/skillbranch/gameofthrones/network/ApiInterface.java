package ru.skillbranch.gameofthrones.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\r\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lru/skillbranch/gameofthrones/network/ApiInterface;", "", "allHouses", "Lio/reactivex/Observable;", "", "Lru/skillbranch/gameofthrones/data/remote/res/HouseRes;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "needCharacter", "Lru/skillbranch/gameofthrones/data/remote/res/CharacterRes;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "needHouse", "name", "needPage", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiInterface {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "houses")
    public abstract java.lang.Object allHouses(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super io.reactivex.Observable<java.util.List<ru.skillbranch.gameofthrones.data.remote.res.HouseRes>>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "houses")
    public abstract java.lang.Object needPage(@retrofit2.http.Query(value = "page")
    int name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<ru.skillbranch.gameofthrones.data.remote.res.HouseRes>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "houses")
    public abstract java.lang.Object needHouse(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<ru.skillbranch.gameofthrones.data.remote.res.HouseRes>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "characters/{id}")
    public abstract java.lang.Object needCharacter(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ru.skillbranch.gameofthrones.data.remote.res.CharacterRes> p1);
}