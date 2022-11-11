package Mediator;

public class Jim extends People {

    public Jim(Mediator m) {
        super("Jim", m);
    }

    @Override
    public void send() {
        String message = "Howzit Pam";
        System.out.println("Jim is sending a message: " + message);
        this.mediator.notify(this, message);
    }

    @Override
    public void recieve(String message) {
        System.out.println("Jim recieved a message: " + message);
    }
    
}
