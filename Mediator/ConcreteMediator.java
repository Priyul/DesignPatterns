package Mediator;
import java.util.*;

public class ConcreteMediator implements Mediator {

    private final String JIM = "Jim";
    private final String PAM = "Pam";

    private Map<String, People> regPeopleMap = new HashMap<>();

    @Override
    public void notify(People sender, String message) {
        String senderName = sender.getName();
        if (JIM.equals(senderName)) {
            reactOnPam(message);
        } else if (PAM.equals(senderName)) {
            reactOnJim(message);
        }
    }   

    @Override
    public void register(People person) {
        this.regPeopleMap.put(person.getName(), person);
        System.out.println(person.getName() + " has registered with mediator.");
    }

    private void reactOnJim(String message) {
        System.out.println("Mediator is in action...");
        /* when there is a notification from Jim, it is designed to send to Pam */
        regPeopleMap.get(JIM).recieve(message);
    }

    private void reactOnPam(String message) {
        System.out.println("Mediator is in action...");
        /* when there is a notification from Pam, it is designed to send to Jim */
        regPeopleMap.get(PAM).recieve(message);
    }
    
}
