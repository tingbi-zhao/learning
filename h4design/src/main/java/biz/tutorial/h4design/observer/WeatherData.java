package java.biz.tutorial.h4design.observer;

import java.util.*;

public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public void setMeasurements(float temp, float humid, float press) {
        this.temperature = temperature;
        humidity = humid;
        pressure = press;
        setChanged();
        notifyObservers();
    }


    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
