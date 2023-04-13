package com.blogspot.nombre_temp.retrofit.example.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.google.gson.annotations.SerializedName;

public class WeatherData {

  private Main main;
  private Wind wind;
  private String testField = "test";

  public Main getMain() {
    return main;
  }
  public void setMain(Main main) {
    this.main = main;
  }
  public Wind getWind() {
    return wind;
  }
  public void setWind(Wind wind) {
    this.wind = wind;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
  }

  public static class Main {
    private float temp;
    @SerializedName("temp_min")
    private float tempMin;
    @SerializedName("temp_max")
    private float tempMax;
    private float pressure;
    private float humidity;

    public float getTemp() {
      return temp;
    }
    public void setTemp(float temp) {
      this.temp = temp;
    }
    public float getTempMin() {
      return tempMin;
    }
    public void setTempMin(float tempMin) {
      this.tempMin = tempMin;
    }
    public float getTempMax() {
      return tempMax;
    }
    public void setTempMax(float tempMax) {
      this.tempMax = tempMax;
    }
    public float getPressure() {
      return pressure;
    }
    public void setPressure(float pressure) {
      this.pressure = pressure;
    }
    public float getHumidity() {
      return humidity;
    }
    public void setHumidity(float humidity) {
      this.humidity = humidity;
    }
    @Override
    public String toString() {
      return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
  }

  public static class Wind {
    private float speed;
    private float deg;

    public float getSpeed() {
      return speed;
    }
    public void setSpeed(float speed) {
      this.speed = speed;
    }
    public float getDeg() {
      return deg;
    }
    public void setDeg(float deg) {
      this.deg = deg;
    }
    @Override
    public String toString() {
      return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
  }
}
