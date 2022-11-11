package Mediator;

public interface Mediator {
    public void notify(People sender, String message);
    public void register(People component); //all components need to register with a mediator to use it
}
