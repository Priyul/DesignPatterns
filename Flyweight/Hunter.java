package Flyweight;

public class Hunter {
    public static void main(String[] args) {
        System.out.println("Shooting with cached bullets");

        Gun shotGun = new ShotGun(8, BulletType.SHOTGUN_BULLET);
        shotGun.loadBullets();
        shotGun.shoot();
        /* each bullet shot is the same  */

        System.out.println("Shooting with uncached bullets");

        Gun shotGunUncached = new ShotGun(8, BulletType.SHOTGUN_BULLET);
        shotGunUncached.loadUncachedBullets();
        shotGunUncached.shoot();
        /* each bullet shot is different */
        /* therefore uncached shotgun consumes 8x more memory than cached shotgun bullets */
    
    }
}
