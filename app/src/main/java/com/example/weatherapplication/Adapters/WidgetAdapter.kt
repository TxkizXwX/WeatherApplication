package com.example.weatherapplication.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapplication.Models.WidgetModel
import com.example.weatherapplication.databinding.WidgetBinding

class WidgetAdapter(
    val context: Context,
    var list : ArrayList<WidgetModel>
) : RecyclerView.Adapter<WidgetAdapter.WidgetViewHolder>() {

    private lateinit var widgetModel: WidgetModel

    fun setWeatherModel(videoModel : WidgetModel){
        widgetModel = videoModel
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WidgetAdapter.WidgetViewHolder {
        val binding = WidgetBinding.inflate(LayoutInflater.from(context), parent, false)
        return WidgetViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WidgetAdapter.WidgetViewHolder, position: Int) {
        val listModel = list[position]
        holder.widgetCountry.text = listModel.getWidgetCountry().toString()
        holder.widgetWeather.text = listModel.getWidgetWeather().toString()
        holder.widgetDegrees.text = listModel.getWidgetDegrees().toString() + "°"
        listModel.getWidgetImage()?.let { holder.widgetImage.setImageResource(it) }
        holder.widgetH.text = "H:" + listModel.getWidgetH().toString() + "°"
        holder.widgetL.text = "L:" + listModel.getWidgetL().toString() + "°"
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class WidgetViewHolder(binding: WidgetBinding) : RecyclerView.ViewHolder(binding.root) {
        val widgetImage = binding.widgetImage
        val widgetCountry = binding.widgetCountry
        val widgetWeather = binding.widgetWeather
        val widgetDegrees = binding.widgetDegrees
        val widgetH = binding.widgetH
        val widgetL = binding.widgetL

    }
}