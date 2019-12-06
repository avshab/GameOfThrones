package ru.skillbranch.gameofthrones.network

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import ru.skillbranch.gameofthrones.data.remote.res.CharacterRes
import ru.skillbranch.gameofthrones.data.remote.res.HouseRes


interface ApiInterface {

    @GET("houses")
    fun allHouses(): Observable<List<HouseRes>>

    @GET("houses")
    fun needPage(@Query("page") name: Int): Observable<List<HouseRes>>

    @GET("houses")
    fun needHouse(@Query("name") name: String): Observable<List<HouseRes>>

    @GET("characters/{id}")
    fun needCharacter(@Path("id") id: String): Observable<CharacterRes>

}
