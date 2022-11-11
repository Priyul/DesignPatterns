package Command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        Invoker invoker = new Invoker(new Command(light), new Command(light));

        invoker.clickOn();
        invoker.clickOff();

    }
}
