package com.example.prototypea

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {
    @FormUrlEncoded
    @POST("register")
    fun register(
        @Field("username") name: String,
        @Field("email") email: String,
        @Field("password") password: String,
    )

    @FormUrlEncoded
    @POST("login")
    fun login(
        @Field("email") email: String,
        @Field("password") password: String,
    )
}