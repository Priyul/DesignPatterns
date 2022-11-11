package Composite;

public class Client {
    public static void main(String[] args) {
        GiftSurpriseBox giftBox = new GiftSurpriseBox();
        GiftSurpriseBox subGiftBox = new GiftSurpriseBox();

        Gift gift = new Gift("Toy car"); //root gift box
        Gift gift2 = new Gift("Toy plane"); //sub gift box

        giftBox.add(gift);
        subGiftBox.add(gift2);

        giftBox.add(subGiftBox); //composite is built

        /* to unwrap all, call unwrap on root gift box and it'll unwrap all gift boxes */
        giftBox.unWrap(); //should unwrap toy car and toy plane
    }
}
