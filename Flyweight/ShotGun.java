package Flyweight;

public class ShotGun extends Gun {
    public ShotGun(int capacity, BulletType type) {
        super(capacity,type);
    }

    @Override
    public void shoot() {
        //hydrate over bullets array from gun class
        for (int i = 0; i < this.capacity; i++) {
            System.out.println(this.bullets[i].toString());
            //visualize how flyweight saves memory
        }
    }
}
