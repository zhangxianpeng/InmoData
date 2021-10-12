package com.inmo.data.weather;

import com.inmo.data.AbstractInfo;
import com.inmo.data.MessageType;
import com.inmo.data.message.Dispatcher;

@MessageType(type = Dispatcher.NAVI_WEATHER_INFO)
public class WeatherInfo extends AbstractInfo {
    private String type;
    private String weatherCode;
    private String temperature;

    public WeatherInfo() {
        type = getType();
    }

    public String getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(String weatherCode) {
        this.weatherCode = weatherCode;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "WeatherInfo{" +
                "type='" + type + '\'' +
                ", weatherCode='" + weatherCode + '\'' +
                ", temperature='" + temperature + '\'' +
                '}';
    }
}
