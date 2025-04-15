package com.ericek.myrecipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


private val retrofit =  Retrofit.Builder()
    .baseUrl("https://www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

    val recipeService = retrofit.create(ApiService::class.java)

interface ApiService{

    // Suspend is used for coroutines that are not blocking the main thread.
    // Coroutines are a way to write asynchronous code in a sequential manner.
    @GET("categories.php")
    suspend fun getCategories(): CategoriesResponse

}