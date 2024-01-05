package ObserverPatternWeather;

import builtInObserverPatternWeather.ConditionDisplay;
import builtInObserverPatternWeather.ForecastDisplay;
import builtInObserverPatternWeather.WeatherDataBuiltInObserver;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        WeatherDataBuiltInObserver weatherDataBuiltInObserver = new WeatherDataBuiltInObserver();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        SmartDeviceWeatherDisplay smartDeviceWeatherDisplay = new SmartDeviceWeatherDisplay(weatherData);

//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        System.out.println("-----Built in observers-----");
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherDataBuiltInObserver);
        ConditionDisplay conditionDisplay = new ConditionDisplay(weatherDataBuiltInObserver);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        weatherDataBuiltInObserver.setMeasurements(13, 16, 19.05f);



    }
}
