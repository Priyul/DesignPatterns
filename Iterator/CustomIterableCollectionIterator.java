package Iterator;

public class CustomIterableCollectionIterator implements Iterator {

    private CustomIterableCollection collection;
    private int collectionSize;
    private int currentIndex = -1;

    public CustomIterableCollectionIterator(CustomIterableCollection collection) {
        this.collection = collection;
        this.collectionSize = collection.size();
    }

    @Override
    public String getNext() {
        currentIndex ++;
        return this.collection.getStringAtIndex(currentIndex);
    }

    @Override
    public boolean hasMore() {
        return currentIndex + 1 < collectionSize;
    }
}