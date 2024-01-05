package builtInObserverPatternWeather;

import ObserverPatternWeather.Observer;

import java.util.Observable;

public class WeatherDataBuiltInObserver extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public void measureMentsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measureMentsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
