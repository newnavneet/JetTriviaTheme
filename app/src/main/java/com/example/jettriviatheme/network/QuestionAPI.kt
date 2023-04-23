package com.example.jettriviatheme.network

import com.example.jettriviatheme.model.Question
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionAPI {
    @GET("world.json")
    suspend fun getAllQuestions(): Question
}