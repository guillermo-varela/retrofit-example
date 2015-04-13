package com.blogspot.nombre_temp.retrofit.example;

import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RestAdapter.LogLevel;
import retrofit.RetrofitError;
import retrofit.client.Response;

import com.blogspot.nombre_temp.retrofit.example.api.WeatherApi;
import com.blogspot.nombre_temp.retrofit.example.model.WeatherData;

public class Example {

  private static final RestAdapter restAdapter = new RestAdapter.Builder()
    .setEndpoint("http://api.openweathermap.org/data/2.5")
    .setLogLevel(LogLevel.FULL)
    .build();

  private static final WeatherApi weatherService = restAdapter.create(WeatherApi.class);

  private static void print(String message) {
    System.out.println(message + ": " + DateFormatUtils.format(new Date(), "yyyy-MM-dd'T'HH:mm:ss.sss"));
  }

  public static void main(String[] args) {
    print("Starting main method");
    long londonId = 2643743L;

    WeatherData weatherData = weatherService.getWeather(londonId);
    print(String.format("Sync response [%s]", weatherData));

    weatherService.getWeatherAsync(londonId, new Callback<WeatherData>() {
      @Override
      public void success(WeatherData weatherData, Response response) {
        print(String.format("Async response [%s]", weatherData));
      }
      @Override
      public void failure(RetrofitError error) {
        error.printStackTrace();
      }
    });

    print("Ending main method");
  }
}
