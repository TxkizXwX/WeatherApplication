package com.example.weatherapplication.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.weatherapplication.R
import com.example.weatherapplication.databinding.FragmentWeatherDetailsBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class WeatherDetailsFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentWeatherDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWeatherDetailsBinding.inflate(inflater, container, false)



        return binding.root
    }
}