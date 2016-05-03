
public class WeaponList {
    public static void main(String[] args) {
        
        Weapon weapon1 = new Sword();
        System.out.println(weapon1.getDescription());
        System.out.println(weapon1.getDamage());
        
        weapon1 = new Magical(weapon1);
        weapon1 = new Magical(weapon1);
        System.out.println(weapon1.getDescription());
        System.out.println(weapon1.getDamage());
        
        Weapon weapon2 = new Staff();
        System.out.println(weapon2.getDescription());
        System.out.println(weapon2.getDamage());
        
        weapon2 = new Magical(weapon2);
        weapon2 = new Final(weapon2);
        System.out.println(weapon2.getDescription());
        System.out.println(weapon2.getDamage());
        
    }

}
