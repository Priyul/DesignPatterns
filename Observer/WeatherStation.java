package Observer;
import java.util.*;

public class WeatherStation implements IObservable {
    private int temperature;
    List<IObserver> observers = new ArrayList<IObserver>();

    @Override
    public void add(IObserver o) {
        this.observers.add(o); //add observers to list
    }

    @Override
    public void remove(IObserver o) {
        this.observers.remove(o);
        
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < this.observers.size(); i++) {
            this.observers.get(i).update();
        }
    }

    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int t) {
        this.temperature = t;
    }
    
}
