package Mediator;

public abstract class People {
    private String name;
    protected Mediator mediator;

    public People(String name, Mediator m) {
        this.mediator = m;
        this.name = name;
    }

    public abstract void send(); //responsible for sending/communicating with the mediator
    public abstract void recieve(String message); //recieves incoming message from a mediator

    public String getName() {
        return this.name;
    }
}
