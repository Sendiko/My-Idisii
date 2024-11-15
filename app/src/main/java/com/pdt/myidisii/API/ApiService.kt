package com.pdt.myidisii.API

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST


interface AuthService {

    @POST("login")
    suspend fun login(@Body loginRequest: LoginRequest): Response<AuthResponse>

    @POST("register")
    suspend fun register(@Body registerRequest: RegisterRequest): Response<AuthResponse>
}