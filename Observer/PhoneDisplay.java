package Observer;

public class PhoneDisplay implements IObserver {
    WeatherStation station = null;

    public PhoneDisplay(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        System.out.println("Phone displays new weather: " + station.getTemperature());
    }
    
}
