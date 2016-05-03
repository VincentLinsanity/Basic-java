
public class Magical extends CondimentDecorator{
    
    private float magicalDamage = 2.0f;
    Weapon weapon;
    
    public Magical(Weapon weapon) {
        this.weapon = weapon;
    }
    
    public String getDescription() {
        return  "Magical " + weapon.getDescription()  ;
    }
    
    public float getDamage() {
        return (magicalDamage + weapon.getDamage());
    }

}
