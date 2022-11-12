package Iterator;

public class Main {
    public static void main(String[] args) {
        Item banana = new Item("Banana");
        Item apple = new Item("Apple");
        Item orange = new Item("Orange");

        Inventory inventory = new HandHeldInventory(banana, apple, orange);
        InventoryIterator iter = new HandHeldIterator(inventory);

        while (!iter.isDone()) {
            System.out.println(iter.current().getName());
                //do something
            iter.next();
        }

    }
}
