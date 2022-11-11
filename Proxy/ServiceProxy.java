package Proxy;

public class ServiceProxy implements ServiceInterface {
    ServiceInterface actualService;

    public ServiceProxy() {
        this.actualService = new ActualService(); //proxy holds a reference to the actual service.
    }

    @Override
    public void performOperation() {
        System.out.println("Going via proxy...");
        //whateber checks you wanna make

        //is data valid
        System.out.println("Proceed invocation, data processing completed");

        //at te end, call the actual service
        actualService.performOperation();
    }
}
