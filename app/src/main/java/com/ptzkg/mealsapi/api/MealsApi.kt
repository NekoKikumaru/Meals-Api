package com.ptzkg.mealsapi.api

import com.ptzkg.mealsapi.model.Meals
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MealsApi {
    private val mealsApiInterface: MealsApiInterface

    companion object {
        const val BASE_URL = "https://www.themealdb.com/api/json/v1/1/"
    }

    init {
        val retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
        mealsApiInterface = retrofit.create(MealsApiInterface::class.java)
    }

    fun searchByName(s: String): Call<Meals> {
        return mealsApiInterface.searchByName(s)
    }

    fun searchByFirstLetter(f: String): Call<Meals> {
        return mealsApiInterface.searchByFirstLetter(f)
    }

    fun lookupById(i: String): Call<Meals> {
        return mealsApiInterface.lookupById(i)
    }

    fun getRandom(): Call<Meals> {
        return mealsApiInterface.getRandom()
    }
}