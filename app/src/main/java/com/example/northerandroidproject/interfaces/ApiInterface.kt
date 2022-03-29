package com.example.northerandroidproject.interfaces

import com.example.northerandroidproject.Utils.DbConstants
import com.example.northerandroidproject.models.Categories
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiInterface {

    @GET("products/3")
    fun getMovies() : Call<List<Categories>>

    companion object {
        fun create() : ApiInterface {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(DbConstants.BASE_URL)
                .build()
            return retrofit.create(ApiInterface::class.java)

        }
    }
}