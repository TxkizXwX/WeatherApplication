package com.example.weatherapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapplication.Adapters.WeatherAdapter
import com.example.weatherapplication.Fragments.WeatherDetailsFragment
import com.example.weatherapplication.Models.WeatherModel
import com.example.weatherapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var weatherList: ArrayList<WeatherModel>
    private lateinit var adapter : WeatherAdapter
    private lateinit var mainRv : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        weatherList = ArrayList()
        weatherList.add(WeatherModel(R.drawable.ic_moon_cloud_mid_rain, "12 AM", 30, 12))
        weatherList.add(WeatherModel(R.drawable.ic_sun_cloud_angled_rain, "Now", 10, 15))
        weatherList.add(WeatherModel(R.drawable.ic_moon_cloud_fast_wind, "1 AM", null, 13))
        weatherList.add(WeatherModel(R.drawable.ic_tornado, "2 AM", null, 12))
        weatherList.add(WeatherModel(R.drawable.ic_sun_cloud_mid_rain, "3 AM", 10, 16))
        weatherList.add(WeatherModel(R.drawable.ic_sun_cloud_angled_rain, "4 AM", 30, 14))
        weatherList.add(WeatherModel(R.drawable.ic_sun_cloud_angled_rain, "5 AM", 50, 13))
        weatherList.add(WeatherModel(R.drawable.ic_sun_cloud_angled_rain, "6 AM", 70, 12))

        adapter = WeatherAdapter(getApplicationContext(), weatherList)

        val layoutManager =
            LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false)

        mainRv = binding.mainRv
        mainRv.layoutManager = layoutManager
        mainRv.adapter = adapter

        binding.weeklyBtn.setOnClickListener {
            weatherList.clear()
            weatherList.add(WeatherModel(R.drawable.ic_sun_cloud_angled_rain, "MON", 0, 18))
            weatherList.add(WeatherModel(R.drawable.ic_sun_cloud_angled_rain, "TUE", 100, 24))
            weatherList.add(WeatherModel(R.drawable.ic_sun_cloud_angled_rain, "WEBS", null, 19))
            weatherList.add(WeatherModel(R.drawable.ic_tornado, "THU", null, 22))
            weatherList.add(WeatherModel(R.drawable.ic_sun_cloud_mid_rain, "FRI", 100, 23))
            weatherList.add(WeatherModel(R.drawable.ic_sun_cloud_mid_rain, "SAT", 30, 21))
            weatherList.add(WeatherModel(R.drawable.ic_sun_cloud_mid_rain, "SUN", 50, 20))
            adapter = WeatherAdapter(getApplicationContext(), weatherList)
            mainRv = binding.mainRv
            mainRv.layoutManager = layoutManager
            mainRv.adapter = adapter
            binding.underlineHourly.visibility = View.INVISIBLE
            binding.underlineWeekly.visibility = View.VISIBLE
        }
        binding.hourlyBtn.setOnClickListener {
            weatherList.clear()
            weatherList.add(WeatherModel(R.drawable.ic_moon_cloud_mid_rain, "12 AM", 30, 12))
            weatherList.add(WeatherModel(R.drawable.ic_sun_cloud_angled_rain, "Now", 10, 15))
            weatherList.add(WeatherModel(R.drawable.ic_moon_cloud_fast_wind, "1 AM", null, 13))
            weatherList.add(WeatherModel(R.drawable.ic_tornado, "2 AM", null, 12))
            weatherList.add(WeatherModel(R.drawable.ic_sun_cloud_mid_rain, "3 AM", 10, 16))
            weatherList.add(WeatherModel(R.drawable.ic_sun_cloud_angled_rain, "4 AM", 30, 14))
            weatherList.add(WeatherModel(R.drawable.ic_sun_cloud_angled_rain, "5 AM", 50, 13))
            weatherList.add(WeatherModel(R.drawable.ic_sun_cloud_angled_rain, "6 AM", 70, 12))
            adapter = WeatherAdapter(getApplicationContext(), weatherList)
            mainRv = binding.mainRv
            mainRv.layoutManager = layoutManager
            mainRv.adapter = adapter
            binding.underlineHourly.visibility = View.VISIBLE
            binding.underlineWeekly.visibility = View.INVISIBLE
        }

        binding.rightBtn.setOnClickListener {
            val intent = Intent(this, WidgetsActivity::class.java)
            startActivity(intent)
        }

        binding.detailsBtn.setOnClickListener {
            val weatherDetailsFragment = WeatherDetailsFragment()
            weatherDetailsFragment.show(supportFragmentManager, "Test")
        }
    }
}