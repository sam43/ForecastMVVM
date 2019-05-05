package com.sam43.forecastmvvm.data.db

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.sam43.forecastmvvm.data.db.entities.CurrentWeatherEntry
import com.sam43.forecastmvvm.data.db.unitlocalize.MetricCurrentWeatherEntry

interface CurrentWeatherDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(weatherEntry: CurrentWeatherEntry)

    @Query("select * from current_weather")
    fun getWeatherMetric(): LiveData<MetricCurrentWeatherEntry>
}