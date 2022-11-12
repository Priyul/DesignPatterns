package Iterator;

public interface Inventory {
    InventoryIterator getIterator();
    public Item getLeft();
    public Item getCurrent();
    public Item getRight();
}
