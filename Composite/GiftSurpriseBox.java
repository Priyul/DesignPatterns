package Composite;
import java.util.ArrayList;

public class GiftSurpriseBox implements SurpriseBox { //composite class
    private ArrayList<SurpriseBox> surpriseBoxes;

    public GiftSurpriseBox() {
        this.surpriseBoxes = new ArrayList<>();
    }

    public void add(SurpriseBox box) {
        this.surpriseBoxes.add(box);
    }

    public void remove(SurpriseBox box) {
        this.surpriseBoxes.remove(box);
    }

    @Override
    public void unWrap() {
        //for each of the surprise boxes, unwrap them
        for (int i = 0; i < surpriseBoxes.size(); i++) {
            surpriseBoxes.get(i).unWrap();
        }
    }
}
