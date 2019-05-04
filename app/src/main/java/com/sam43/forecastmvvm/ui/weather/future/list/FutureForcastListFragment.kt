package com.sam43.forecastmvvm.ui.weather.future.list

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.sam43.forecastmvvm.R

class FutureForcastListFragment : Fragment() {

    companion object {
        fun newInstance() = FutureForcastListFragment()
    }

    private lateinit var viewModel: FutureForcastListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.future_forcast_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FutureForcastListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
