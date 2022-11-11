package Iterator;

import java.util.List;
import java.util.ArrayList;
public class CustomIterableCollection implements IterableCollection {
    
    List<String> internalList = new ArrayList<>();

    public Iterator createIterator() {
        return new CustomIterableCollectionIterator(this);
    }

    public CustomIterableCollection() {
        internalList.add("I");
        internalList.add("Love");
        internalList.add("Binary");
    }
    public int size() {
        return this.internalList.size();
    }
    
    public String getStringAtIndex(int i) {
        return internalList.get(i);
    }

}
