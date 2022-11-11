package Flyweight;



public enum BulletType {
    
    PISTOL_BULLET("Pistol Bullet"),
    SHOTGUN_BULLET("Shotgun bullet"),
    SNIPER_BULLET("Sniper bullet");

    private String name;

    BulletType(String name) {
        this.name = name;
    }


}
