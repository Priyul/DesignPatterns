package Iterator;

public class HandHeldIterator implements InventoryIterator {

    private Inventory inventory;
    int index = 0; //start of at index 0

    public HandHeldIterator(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public boolean isDone() {
        return this.index > 2;
    }

    @Override //if not isDone(), ask for current element
    public Item current() {
        if (index == 0) {
            return this.inventory.getLeft();
        } else if (index == 1) {
            return this.inventory.getCurrent();
        } else if (index == 2) {
            return this.inventory.getRight();
        } else {
            return null;
        }
    }

    @Override
    public void next() {
        this.index += 1;
    }

}
