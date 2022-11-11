package Command;

public class Command implements ICommand {
    Light light;
    public Command(Light l) {
        this.light = l;
    }

    @Override
    public void execute() {
        //acts upon the light (reciever)
        this.light.on();
    }

    @Override
    public void unexecute() {
        //acts upon the light (reciever)
        this.light.off();
    }

    /* difference to strategy: intent */
    
}
