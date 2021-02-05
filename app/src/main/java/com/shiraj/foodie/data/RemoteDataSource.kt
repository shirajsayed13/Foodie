package com.shiraj.foodie.data

import com.shiraj.foodie.data.network.FoodRecipeAPI
import com.shiraj.foodie.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipeAPI: FoodRecipeAPI
){

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipeAPI.getRecipes(queries)
    }
}