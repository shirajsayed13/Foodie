package com.shiraj.foodie.data.network

import com.shiraj.foodie.models.FoodRecipe
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface FoodRecipeAPI {

    @GET("recipes/complexSearch")
    suspend fun getRecipes(
        @QueryMap queryMap: Map<String, String>
    ) : Response<FoodRecipe>
}