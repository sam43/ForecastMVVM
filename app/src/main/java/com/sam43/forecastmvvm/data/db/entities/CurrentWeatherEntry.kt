package com.sam43.forecastmvvm.data.db.entities


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.sam43.forecastmvvm.interfaces.Consts

// https://www.youtube.com/watch?v=SB0UepZ5lT4&list=PLB6lc7nQ1n4jTLDyU2muTBo8xk0dg0D_w&index=3
@Entity(tableName = Consts.CURRENT_WEATHER_TABLE)
data class CurrentWeatherEntry(
    @SerializedName("cloud")
    val cloud: Int? = 0,
    @Embedded(prefix = "condition_")
    @SerializedName("condition")
    val condition: Condition? = Condition(),
    @SerializedName("feelslike_c")
    val feelslikeC: Double? = 0.0,
    @SerializedName("feelslike_f")
    val feelslikeF: Double? = 0.0,
    @SerializedName("gust_kph")
    val gustKph: Double? = 0.0,
    @SerializedName("gust_mph")
    val gustMph: Double? = 0.0,
    @SerializedName("humidity")
    val humidity: Int? = 0,
    @SerializedName("is_day")
    val isDay: Int? = 0,
    @SerializedName("last_updated")
    val lastUpdated: String? = "",
    @SerializedName("last_updated_epoch")
    val lastUpdatedEpoch: Int? = 0,
    @SerializedName("precip_in")
    val precipIn: Double? = 0.0,
    @SerializedName("precip_mm")
    val precipMm: Double? = 0.0,
    @SerializedName("pressure_in")
    val pressureIn: Double? = 0.0,
    @SerializedName("pressure_mb")
    val pressureMb: Double? = 0.0,
    @SerializedName("temp_c")
    val tempC: Double? = 0.0,
    @SerializedName("temp_f")
    val tempF: Double? = 0.0,
    @SerializedName("uv")
    val uv: Double? = 0.0,
    @SerializedName("vis_km")
    val visKm: Double? = 0.0,
    @SerializedName("vis_miles")
    val visMiles: Double? = 0.0,
    @SerializedName("wind_degree")
    val windDegree: Int? = 0,
    @SerializedName("wind_dir")
    val windDir: String? = "",
    @SerializedName("wind_kph")
    val windKph: Double? = 0.0,
    @SerializedName("wind_mph")
    val windMph: Double? = 0.0
) {
    @PrimaryKey(autoGenerate = false)
    val id: Int = Consts.CURRENT_WEATHER_ID
}