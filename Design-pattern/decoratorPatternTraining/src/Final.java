
public class Final extends CondimentDecorator{
    
    private float finalDamage = 10.0f;
    Weapon weapon;
    
    public Final(Weapon weapon) {
        this.weapon = weapon;
    }
    
    public String getDescription() {
        return  "Final " + weapon.getDescription()  ;
    }
    
    public float getDamage() {
        return (finalDamage + weapon.getDamage());
    }

}
