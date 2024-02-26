package builtInObserverPatternWeather;


import ObserverPatternWeather.DisplayElement;
import ObserverPatternWeather.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class ConditionDisplay implements Observer, DisplayElement {
    Observable observable;
    float temperature;
    float humidity;

    public ConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherDataBuiltInObserver) {
            WeatherDataBuiltInObserver weatherDataBuiltInObserver = (WeatherDataBuiltInObserver) obs;
            this.temperature = weatherDataBuiltInObserver.getTemperature();
            this.humidity = weatherDataBuiltInObserver.getHumidity();
            display();
        }
    }

    @Override
    public void display() {

        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }



}
