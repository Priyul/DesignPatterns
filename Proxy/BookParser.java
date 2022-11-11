package Proxy;

public class BookParser implements IBookParser {
    public BookParser(String book) {
        //assume expensive parsing
        this.book = book;
    }

    private String book = null;

    public int getNumPages() {
        return book.length();
    }


}
