package com.example.data.response

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("token") val token: String,

    @SerializedName("Brand") val brand: Boolean
)
