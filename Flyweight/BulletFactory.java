package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class BulletFactory {
    private static Map<BulletType, Bullet> bulletCache = new HashMap<>();

    public static Bullet getBulletByType(BulletType type) {
        switch (type) {
            case PISTOL_BULLET:
                return new Bullet( "S", "50mg") ;
            case SHOTGUN_BULLET:
                return new Bullet( "M", "80mg");
            case SNIPER_BULLET:
                return new Bullet( "L", "100mg") ;
            default:
                throw new IllegalArgumentException("Invalid Bullet Type" );
            } 
    }

    public static Bullet getBulletFromCache(BulletType type) {
        if (bulletCache.containsKey(type)) {
            return bulletCache.get(type);
        } else {
            Bullet bullet = getBulletByType(type);
            bulletCache.put(type, bullet);
            // System.out.println(bulletCache.get(type));
            return bulletCache.get(type);
        }
        
    }
}
