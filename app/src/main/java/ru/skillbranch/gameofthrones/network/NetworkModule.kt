package ru.skillbranch.gameofthrones.network

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import ru.skillbranch.gameofthrones.AppConfig

object NetworkModule {

    val INSTANSE : ApiInterface = provideApiInterface(provideOkHttpClient(provideInterceptor()))

    fun provideApiInterface(okHttpClient: OkHttpClient): ApiInterface =
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
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
        .addInterceptor(httpLoggingInterceptor)
        .build()
}