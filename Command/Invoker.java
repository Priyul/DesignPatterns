package Command;

public class Invoker {
    ICommand on;
    ICommand off;

    public Invoker(ICommand on, ICommand off) {
        this.on = on;
        this.off = off;
    }

    public void clickOn() {
        this.on.execute(); //does execute() of the command.java
    }

    public void clickOff() {
        this.off.unexecute(); //does execute() of the command.java
    }
}
