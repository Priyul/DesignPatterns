package ChainOfResponsibility;

public class CivilianVehicleHandler extends AbstractHandler {
    @Override
    public void handle(String incomingSuspect) {
        if ("CIVILIAN_SUV".equals(incomingSuspect)) {
            System.out.println("Validate ID for: " + incomingSuspect);
            return;
        }
        System.out.println("currently at CivilianHandler, going to next handler...");
        this.nextHandler.handle(incomingSuspect); //if its not civilian suv, go to next handler;
    }
}
