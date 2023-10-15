package com.example.weatherapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapplication.Adapters.WeatherAdapter
import com.example.weatherapplication.Adapters.WidgetAdapter
import com.example.weatherapplication.Models.WeatherModel
import com.example.weatherapplication.Models.WidgetModel
import com.example.weatherapplication.databinding.ActivityWidgetsBinding

class WidgetsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWidgetsBinding

    private lateinit var widgetList: ArrayList<WidgetModel>
    private lateinit var adapter : WidgetAdapter
    private lateinit var widgetRv : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWidgetsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener {
            val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
        }
        widgetList = ArrayList()
        widgetList.add(WidgetModel(R.drawable.ic_moon_cloud_mid_rain, "Montreal, Canada", "Mid Rain", 19, 24, 18))
        widgetList.add(WidgetModel(R.drawable.ic_moon_cloud_fast_wind, "Toronto, Canada", "Fast Wind", 20, 21, -19))
        widgetList.add(WidgetModel(R.drawable.ic_sun_cloud_angled_rain, "Tokyo, Japon", "Showers", 13, 16, 8))
        widgetList.add(WidgetModel(R.drawable.ic_tornado, "Tennessee, United States", "Tornado", 23, 26, 16))
        widgetList.add(WidgetModel(R.drawable.ic_moon_cloud_fast_wind, "Montreal, Canada", "Partly Cloudy", 19, 24, 18))
        widgetList.add(WidgetModel(R.drawable.ic_moon_cloud_fast_wind, "Montreal, Canada", "Partly Cloudy", 19, 24, 18))

        adapter = WidgetAdapter(getApplicationContext(), widgetList)
        widgetRv = binding.widgetRv
        widgetRv.layoutManager = LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false)
        widgetRv.adapter = adapter

    }
}