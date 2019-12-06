package ru.skillbranch.gameofthrones.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lru/skillbranch/gameofthrones/network/NetworkModule;", "", "()V", "INSTANSE", "Lru/skillbranch/gameofthrones/network/ApiInterface;", "getINSTANSE", "()Lru/skillbranch/gameofthrones/network/ApiInterface;", "provideApiInterface", "okHttpClient", "Lokhttp3/OkHttpClient;", "provideInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideOkHttpClient", "httpLoggingInterceptor", "app_debug"})
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull()
    private static final ru.skillbranch.gameofthrones.network.ApiInterface INSTANSE = null;
    public static final ru.skillbranch.gameofthrones.network.NetworkModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.gameofthrones.network.ApiInterface getINSTANSE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.skillbranch.gameofthrones.network.ApiInterface provideApiInterface(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.logging.HttpLoggingInterceptor provideInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor) {
        return null;
    }
    
    private NetworkModule() {
        super();
    }
}