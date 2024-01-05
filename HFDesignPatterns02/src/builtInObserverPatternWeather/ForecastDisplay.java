package builtInObserverPatternWeather;

import ObserverPatternWeather.DisplayElement;
import ObserverPatternWeather.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        WeatherDataBuiltInObserver weatherDataBuiltInObserver =  (WeatherDataBuiltInObserver) observable;
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherDataBuiltInObserver) {
            WeatherDataBuiltInObserver weatherDataBuiltInObserver =  (WeatherDataBuiltInObserver) observable; // wasn't here in solution
            lastPressure = currentPressure;
            currentPressure = weatherDataBuiltInObserver.getPressure();
            display();
        }
    }

    public void display() {
        System.out.println("last conditions: " + lastPressure + "current pressure is " + currentPressure );
    }
}
