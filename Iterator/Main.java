package Iterator;

public class Main {
    public static void main(String[] args) {
        IterableCollection collection = new CustomIterableCollection();
        Iterator iter = collection.createIterator();

        int i = 0;
        while (iter.hasMore()) {
            String result = iter.getNext();
            System.out.println(++i + "> " + result);
        }
    }
}
