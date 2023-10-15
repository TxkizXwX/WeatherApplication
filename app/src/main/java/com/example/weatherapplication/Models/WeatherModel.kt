package com.example.weatherapplication.Models

class WeatherModel {
    private var weatherImage : Int? = null
    private var weatherTime : String
    private var weatherRain : Int? = null
    private var weatherDegrees: Int = 0

    constructor(weatherImage : Int?, weatherTime : String, weatherRain : Int?, weatherDegrees: Int){
        this.weatherImage = weatherImage
        this.weatherTime = weatherTime
        this.weatherRain = weatherRain
        this.weatherDegrees = weatherDegrees
    }

    fun getWeatherImage() : Int? {
        return weatherImage
    }
    fun getWeatherTime() : String {
        return weatherTime
    }
    fun getWeatherRain() : Int? {
        return weatherRain
    }
    fun getWeatherDegrees() : Int {
        return weatherDegrees
    }
    fun setWeatherImage(weatherImage : Int?){
        this.weatherImage = weatherImage
    }
    fun setWeatherTime(weatherTime : String){
        this.weatherTime = weatherTime
    }
    fun setWeatherRain(weatherRain : Int?){
        this.weatherRain = weatherRain
    }
    fun setWeatherDegrees(weatherDegrees : Int){
        this.weatherDegrees = weatherDegrees
    }

}