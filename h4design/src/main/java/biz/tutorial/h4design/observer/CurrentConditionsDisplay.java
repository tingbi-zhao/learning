package java.biz.tutorial.h4design.observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Observable weather;

    private float temperature;
    private float pressure;


    public CurrentConditionsDisplay(Observable weatherData) {
        weather = weatherData;
        weather.addObserver(this);
    }

    @Override
    public void display() {

    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData wd = (WeatherData) o;
            temperature = wd.getTemperature();
            pressure = wd.getPressure();

            display();
        }
    }
}
