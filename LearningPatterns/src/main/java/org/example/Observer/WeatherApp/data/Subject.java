package org.example.Observer.WeatherApp.data;

import org.example.Observer.WeatherApp.displays.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
