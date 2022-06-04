package behavularpatterns.observer;

public class ForecastWeatherCenter extends Subject{


    public void setTemperature(int x){
        pushData(x);
    }
}