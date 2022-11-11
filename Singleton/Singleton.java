package Singleton;

public class Singleton {
    static private Singleton instance; //instance of this singleton
    private String message;

    private Singleton(String message) { //private constructor ensures we cnt instatntiate this class from the outside
        this.message = message;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton("Helloooo");
            return instance;
        }
        return instance;

    } //returns a singleton instance and ensures we only get the same instance with each call

    public String getMessage() {
        return this.message;
    }
}
