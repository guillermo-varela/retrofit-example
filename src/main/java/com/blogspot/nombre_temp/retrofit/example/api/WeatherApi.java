package com.blogspot.nombre_temp.retrofit.example.api;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

import com.blogspot.nombre_temp.retrofit.example.model.WeatherData;

public interface WeatherApi {

  @GET("/weather")
  WeatherData getWeather(@Query("id") long cityId);

  @GET("/weather")
  void getWeatherAsync(@Query("id") long cityId, Callback<WeatherData> callback);
}
