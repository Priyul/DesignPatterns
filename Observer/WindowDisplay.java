package Observer;

public class WindowDisplay implements IObserver {
    WeatherStation station = null;

    public WindowDisplay(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        System.out.println("Window displays new weather: " + station.getTemperature());
    }
    
}
