package ChainOfResponsibility;

public class FireTruckHandler extends AbstractHandler {
    @Override
    public void handle(String incomingSuspect) {
        if ("FIRETRUCK".equals(incomingSuspect)) {
            System.out.println("Validate ID for: " + incomingSuspect);
            return;
        }
        System.out.println("currently at FiretruckHandler, going to next handler...");
        this.nextHandler.handle(incomingSuspect); //if its not firetruck, go to next handler;
    }
}