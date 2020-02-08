import java.util.Random;

public class Ghul extends Monster {
    public Ghul() {
        super(70, 12, true, WeaponType.UNARMED);

        double ghulAttack = new Random().nextDouble();

    }

    @Override
    public int attack() {
        return (int) (strength + weaponType.getDamage() + getGhulAttack());

    }

    public double getGhulAttack() {
        double ghulAttack;
        return ghulAttack = new Random().nextDouble();
    }

}
