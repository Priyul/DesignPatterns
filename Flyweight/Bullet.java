package Flyweight;
public final class Bullet {
    //since object is shared, unique state is a read-only state
    private final String bulletSize;
    private final String bulletWeight;

    public Bullet(String size, String weight) {
        this.bulletSize = size;
        this.bulletWeight = weight;
    }

    public String getBulletSize() {
        return this.bulletSize;
    }

    public String getBulletWeight() {
        return this.bulletWeight;
    }
}