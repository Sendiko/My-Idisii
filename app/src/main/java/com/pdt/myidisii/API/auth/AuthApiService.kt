package com.pdt.myidisii.API.auth
import com.pdt.myidisii.API.ResponseData
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface AuthApiService {

    @POST("signup")
    suspend fun signUp(
        @Body request: AuthRequest
    )

    @POST("signin")
    suspend fun signIn(
        @Body request: AuthRequest
    ): ResponseData

    @GET("authenticate")
    suspend fun authenticate(
        @Header("Authorization") token: String
    )
}