package Mediator;

public class Pam extends People {

    public Pam(Mediator m) {
        super("Pam", m);
    }

    @Override
    public void send() {
        String message = "Helloooo Jim";
        System.out.println("Pam is sending a message: " + message);
        this.mediator.notify(this, message);
    }

    @Override
    public void recieve(String message) {
        System.out.println("Pam recieved a message: " + message);
    }
}
    