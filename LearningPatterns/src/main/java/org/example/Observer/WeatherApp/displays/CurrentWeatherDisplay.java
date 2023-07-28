package org.example.Observer.WeatherApp.displays;

import org.example.Observer.WeatherApp.data.WeatherData;

public class CurrentWeatherDisplay implements Observer{
    @Override
    public void update() {
            //some code
    }
    public void registerAsObserver(WeatherData weatherData){
        weatherData.registerObserver(this);
    }
    public void unregisterAsObserver(WeatherData weatherData){
        weatherData.removeObserver(this);
    }
}
