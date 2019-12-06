package ru.skillbranch.gameofthrones.network

import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import ru.skillbranch.gameofthrones.AppConfig
import java.util.concurrent.TimeUnit

object NetworkModule {

    val INSTANSE : ApiInterface = provideApiInterface(provideOkHttpClient(provideInterceptor()))

    fun provideApiInterface(okHttpClient: OkHttpClient): ApiInterface =
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .client(okHttpClient)
            .baseUrl(AppConfig.BASE_URL)
            .build()
            .create(ApiInterface::class.java)

    fun provideInterceptor() = HttpLoggingInterceptor()
        .apply { level = HttpLoggingInterceptor.Level.BODY }

    fun provideOkHttpClient(
        httpLoggingInterceptor: HttpLoggingInterceptor
    ) = OkHttpClient
        .Builder()
        .readTimeout(7, TimeUnit.SECONDS)
        .addInterceptor(httpLoggingInterceptor)
        .build()
}