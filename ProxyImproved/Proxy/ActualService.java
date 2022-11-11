package Proxy;

public class ActualService implements ServiceInterface {
    @Override
    public void performOperation() {
        System.out.println("Invoking actual operation"); //assume this operation is expensive
    }
}