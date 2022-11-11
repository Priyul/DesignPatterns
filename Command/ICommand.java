package Command;

public interface ICommand {
    public void execute();
    public void unexecute(); //importantly: they take no parameters
    /* there is an action encapsulated in the function */
}
