package ChainOfResponsibility;

public interface Handler {
    public void setNextHandler(Handler handler);
    public void handle(String incomingSuspect);
}
