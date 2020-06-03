package com.ptzkg.mealsapi.api

import com.ptzkg.mealsapi.model.Meals
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MealsApiInterface {

    @GET("search.php")
    fun searchByName(
        @Query("s") s: String
    ): Call<Meals>

    @GET("search.php")
    fun searchByFirstLetter(
        @Query("f") f: String
    ): Call<Meals>

    @GET("lookup.php")
    fun lookupById(
        @Query("i") i: String
    ): Call<Meals>

    @GET("random.php")
    fun getRandom(): Call<Meals>
}