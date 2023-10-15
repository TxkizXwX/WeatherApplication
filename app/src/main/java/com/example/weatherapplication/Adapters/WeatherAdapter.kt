package com.example.weatherapplication.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapplication.Models.WeatherModel
import com.example.weatherapplication.databinding.ForecastItemBinding

class WeatherAdapter(
    val context: Context,
    var list : ArrayList<WeatherModel>
) : RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder>() {

    private lateinit var weatherModel: WeatherModel

    fun setWeatherModel(videoModel : WeatherModel){
        weatherModel = videoModel
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WeatherAdapter.WeatherViewHolder {
        val binding = ForecastItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return WeatherViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WeatherAdapter.WeatherViewHolder, position: Int) {
        val listModel = list[position]
        holder.weatherTime.text = listModel.getWeatherTime()
        if (listModel.getWeatherRain() == null){
            holder.weatherRain.visibility = View.INVISIBLE
        } else{
            holder.weatherRain.text = listModel.getWeatherRain().toString() + "%"
        }
        holder.weatherDegrees.text = listModel.getWeatherDegrees().toString() + "°"
        listModel.getWeatherImage()?.let { holder.weatherImage.setImageResource(it) }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class WeatherViewHolder(binding: ForecastItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val weatherImage = binding.weatherImage
        val weatherTime = binding.weatherTime
        val weatherRain = binding.weatherRain
        val weatherDegrees = binding.weatherDegrees

    }
}