package com.sam43.forecastmvvm.data.network.response


import com.google.gson.annotations.SerializedName
import com.sam43.forecastmvvm.data.db.entities.CurrentWeatherEntry
import com.sam43.forecastmvvm.data.db.entities.Location

data class CurrentWeatherResponse(
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry? = CurrentWeatherEntry(),
    @SerializedName("location")
    val location: Location? = Location()
)