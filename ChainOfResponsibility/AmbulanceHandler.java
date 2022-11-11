package ChainOfResponsibility;

public class AmbulanceHandler extends AbstractHandler {
    @Override
    public void handle(String incomingSuspect) {
        if ("AMBULANCE".equals(incomingSuspect)) {
            System.out.println("Validate ID for: " + incomingSuspect);
            return;
        }
        System.out.println("currently at AmbulanceHandler, going to next handler...");
        this.nextHandler.handle(incomingSuspect); //if its not ambulance, go to next handler;
    }
}