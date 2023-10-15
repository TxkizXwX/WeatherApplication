package com.example.weatherapplication.Models

class WidgetModel {
    private var widgetImage : Int? = null
    private var widgetCountry : String
    private var widgetWeather : String
    private var widgetDegrees: Int = 0
    private var widgetH: Int? = null
    private var widgetL: Int? = null

    constructor(widgetImage : Int?, widgetCountry : String, widgetWeather : String, widgetDegrees: Int,widgetH: Int?, widgetL: Int?){
        this.widgetImage = widgetImage
        this.widgetCountry = widgetCountry
        this.widgetWeather = widgetWeather
        this.widgetDegrees = widgetDegrees
        this.widgetH = widgetH
        this.widgetL = widgetL
    }

    fun getWidgetImage() : Int? {
        return widgetImage
    }
    fun getWidgetCountry() : String {
        return widgetCountry
    }
    fun getWidgetWeather() : String {
        return widgetWeather
    }
    fun getWidgetDegrees() : Int {
        return widgetDegrees
    }
    fun getWidgetH() : Int? {
        return widgetH
    }
    fun getWidgetL() : Int? {
        return widgetL
    }
    fun setWidgetImage(widgetImage : Int?){
        this.widgetImage = widgetImage
    }
    fun setWidgetCountry(widgetCountry : String){
        this.widgetCountry = widgetCountry
    }
    fun setWidgetWeather(widgetWeather : String){
        this.widgetWeather = widgetWeather
    }
    fun setWidgetDegrees(widgetDegrees : Int){
        this.widgetDegrees = widgetDegrees
    }
    fun setWidgetH(widgetH : Int?){
        this.widgetH = widgetH
    }
    fun setWidgetL(widgetL : Int?){
        this.widgetL = widgetL
    }

}