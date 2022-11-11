package ChainOfResponsibility;

public abstract class AbstractHandler implements Handler {

    protected Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle(String incomingSuspect) {

    }
    
}
