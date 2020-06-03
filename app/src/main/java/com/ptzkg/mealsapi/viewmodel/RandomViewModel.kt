package com.ptzkg.mealsapi.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ptzkg.mealsapi.api.MealsApi
import com.ptzkg.mealsapi.model.Meal
import com.ptzkg.mealsapi.model.Meals
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RandomViewModel: ViewModel() {

    val result: MutableLiveData<Meal> = MutableLiveData()
    private val mealsApi: MealsApi = MealsApi()

    fun getResult(): LiveData<Meal> = result

    fun loadResult() {

        val call = mealsApi.getRandom()
        call.enqueue(object: Callback<Meals> {

            override fun onFailure(call: Call<Meals>, t: Throwable) {
                Log.d("RandomViewModel >>> ", t.toString())
            }

            override fun onResponse(call: Call<Meals>, response: Response<Meals>) {
                response.isSuccessful.let {
                    result.value = response.body()?.meals?.get(0)
                }
            }
        })
    }
}