import java.util.Random;

public class Goblin extends Monster {


    private double goblinAttack;

    public Goblin() {
        super(50, 8, true, WeaponType.MACE);


    }

    @Override
    public double attack() {
        return strength + weaponType.getDamage() + getGoblinAttack();

    }

    public double getGoblinAttack() {
        return goblinAttack = new Random().nextDouble();
    }

}
