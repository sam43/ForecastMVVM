package com.sam43.forecastmvvm.ui.weather.future.details

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.sam43.forecastmvvm.R

class FutureForecastDetailFragment : Fragment() {

    companion object {
        fun newInstance() = FutureForecastDetailFragment()
    }

    private lateinit var viewModel: FutureForecastDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.future_weather_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FutureForecastDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
