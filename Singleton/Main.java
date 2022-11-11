package Singleton;

public class Main {
    public static void main(String[] args) {

        Singleton.getInstance(); //how you access the singleton

        System.out.println("Singleton message: " + Singleton.getInstance().getMessage()); //example of accessing a singleton function using a singleton instance
    }
}
