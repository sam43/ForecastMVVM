package com.sam43.forecastmvvm.data.db.entities


import com.google.gson.annotations.SerializedName

data class Condition(
    @SerializedName("code")
    val code: Int? = 0,
    @SerializedName("icon")
    val icon: String? = "",
    @SerializedName("text")
    val text: String? = ""
)