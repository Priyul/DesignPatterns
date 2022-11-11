package ChainOfResponsibility;

public class Main {
    public static void main(String [] args) {
        
        Handler vehicleHandler = Main.getValidationHandlers();
        String vehicleType = "x";

        vehicleHandler.handle(vehicleType);
        
    }


    public static Handler getValidationHandlers() {
        Handler civilianHandler = new CivilianVehicleHandler();
        Handler fireTruckHandler = new FireTruckHandler();
        Handler ambulanceHandler = new AmbulanceHandler();
        Handler policeSUVHandler = new PoliceSUVHandler();

        civilianHandler.setNextHandler(fireTruckHandler);
        fireTruckHandler.setNextHandler(ambulanceHandler);
        ambulanceHandler.setNextHandler(policeSUVHandler);
        return civilianHandler;
        //initializing chain of handlers
    }
}