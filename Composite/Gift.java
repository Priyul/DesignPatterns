package Composite;

public class Gift implements SurpriseBox { //leaf class
    private String giftName;
    
    public Gift(String name) {
        this.giftName = name;
    }

    @Override
    public void unWrap() {
        System.out.println("Unwrapping gift: " + this.giftName);
    } 
    
}
