package org.example.Observer.WeatherApp.data;

import org.example.Observer.WeatherApp.displays.Observer;

import java.util.LinkedList;
import java.util.List;
/*
* Generally we have an Interface Subject (Observable if we use
* inbuilt pattern realization), that specifies general observed object behaviour
* implementing it we have some base of observers, add new to it and remove form it.
* also we have some inner state of Subject and when it is changed, we invoke the update for all
* Observers. Every observer can have its own behaviour, everything we need to know about them
* is that they implement this update() method. */
public class WeatherData implements Subject{
    private float temperature;
    private float humidity;

    private List<Observer> observers;

    WeatherData(){
        observers = new LinkedList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.removeIf(observer -> observer.equals(o));
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        measurementsChanged();
    }
}
