package com.pdt.myidisii.API

import com.google.gson.annotations.SerializedName

data class LoginRequest(
    @field:SerializedName("username")
    val username: String? = null,
    @field:SerializedName("pin")
    val pin: String? = null,
)

data class RegisterRequest(
    @field:SerializedName("username")
    val username: String? = null,
    @field:SerializedName("email")
    val email: String? = null,
    @field:SerializedName("pin")
    val pin: String? = null,
)

data class AuthResponse(
    @field:SerializedName("status")
    val success: String? = null,
    @field:SerializedName("message")
    val message: String? = null,
    @field:SerializedName("token")
    val token: String?
)
