package ru.skillbranch.gameofthrones.network

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import ru.skillbranch.gameofthrones.data.remote.res.CharacterRes
import ru.skillbranch.gameofthrones.data.remote.res.HouseRes


interface ApiInterface {

    @GET("houses")
    suspend fun allHouses(): Observable<List<HouseRes>>

    @GET("houses")
    suspend fun needPage(@Query("page") name: Int): List<HouseRes>

    @GET("houses")
    suspend fun needHouse(@Query("name") name: String): List<HouseRes>

    @GET("characters/{id}")
    suspend fun needCharacter(@Path("id") id: String): CharacterRes

}
