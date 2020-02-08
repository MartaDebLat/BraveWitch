public class Player extends Creature implements AbleToAttack {

    public Player(WeaponType playerWeapon) {
        super(120, 25, true, playerWeapon);

    }

    @Override
    public double attack() {
        return strength + weaponType.getDamage() + 1;

    }

}
