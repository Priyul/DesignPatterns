package Observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        PhoneDisplay phone = new PhoneDisplay(station);
        WindowDisplay window = new WindowDisplay(station);

        station.add(phone); //phone is now observing the weather station, will update whenever temp is changed
        station.setTemperature(29);
        station.notifyObserver();

        station.add(window); //phone is now observing the weather station, will update whenever temp is changed
        station.setTemperature(13);
        station.notifyObserver();

        station.remove(phone);
        System.out.println("Phone is no longer observing weather station");
        station.setTemperature(-8);
        station.notifyObserver();

    }
}
