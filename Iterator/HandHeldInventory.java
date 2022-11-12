package Iterator;

public class HandHeldInventory implements Inventory {

    public Item left;
    public Item current;
    public Item right;

    public HandHeldInventory(Item left, Item current, Item right) {
        this.left = left;
        this.current = current;
        this.right = right;
    }

    @Override
    public InventoryIterator getIterator() {
        return new HandHeldIterator(this);
    }

    public Item getLeft() {
        return this.left;
    }

    public void setLeft(Item left) {
        this.left = left;
    }

    public Item getCurrent() {
        return this.current;
    }

    public void setCurrent(Item current) {
        this.current = current;
    }

    public Item getRight() {
        return this.right;
    }

    public void setRight(Item right) {
        this.right = right;
    }    
}
