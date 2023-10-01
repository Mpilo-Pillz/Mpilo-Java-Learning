package ObserverPatternWeather;

public class SmartDeviceWeatherDisplay implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public SmartDeviceWeatherDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Shows the weather on a Smart Watch, Smart TV or Smart Fridge");
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
//        System.out.printf("Current conditions:  %d F degrees and %d  humidity",  temperature, humidity);
//        Current conditions: " + + "F degrees and " + humidity + "% humidity
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
