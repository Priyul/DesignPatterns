package ProxyImproved;

public class Main {
    public static void main(String[] args) {
        String book = "Undertale";

        LazyBookParserProxy proxy = new LazyBookParserProxy(book);
        System.out.println("Number of pages: " + proxy.getNumPages());
    } 
}