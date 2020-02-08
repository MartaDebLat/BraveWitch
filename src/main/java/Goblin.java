import java.util.Random;

public class Goblin extends Monster {


    private double goblinAttack;

    public Goblin() {
        super(50, 8, true, WeaponType.MACE);


    }

    @Override
    public int attack() {
        return (int) (strength + weaponType.getDamage() + getGoblinAttack());

    }

    public double getGoblinAttack() {
        return goblinAttack = new Random().nextDouble();
    }

}
