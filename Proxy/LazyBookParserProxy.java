package Proxy;

class LazyBookParserProxy implements IBookParser {

    //only instantiate realsubject when we need to
    private String book = null;
    private BookParser parser = null; //dont initiate expensive computation yet

    public LazyBookParserProxy(String book) {
        this.book = book;
    }

    public int getNumPages() {
        //delegate too a bookparser but parser == null, so:
        if (this.parser == null) { //ie) if we dont have one
            this.parser = new BookParser(this.book);
            return this.parser.getNumPages();
        }
        return this.parser.getNumPages(); 

    //whenever we want to use bookparser, proxy is provided to reduce computation time
    //therefore if getnumpages is never called, BookParser is never initialized and therefore there is no expensive computation.
    }
}
