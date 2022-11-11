package Mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        People Jim = new Jim(mediator);
        /* so jim knows what its mediator is and will communicate through it */
        People Pam = new Pam(mediator);

        mediator.register(Jim);
        mediator.register(Pam);
        System.out.println("");

        Jim.send(); //message is hardcoded... can also be passed in as a parameter
        System.out.println("");
        Pam.send(); // ^^


    }
}
