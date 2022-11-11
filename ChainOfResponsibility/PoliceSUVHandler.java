package ChainOfResponsibility;

public class PoliceSUVHandler extends AbstractHandler {
    @Override
    public void handle(String incomingSuspect) {
        if ("POLICE_SUV".equals(incomingSuspect)) {
            System.out.println("Validate ID for: " + incomingSuspect);
            return;
        }
        System.out.println("currently at PoliceSUVHandler, going to next handler...");
        System.out.println("Vehicle of type: " + incomingSuspect + " could not be found :(");
        return;
    }
}