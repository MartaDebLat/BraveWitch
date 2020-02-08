public class Player extends Creature implements AbleToAttack {

    public Player(WeaponType playerWeapon) {
        super(120, 25, true, WeaponType.SWORD);

    }

    @Override
    public Integer attack() {
        return strength + weaponType.getDamage() + 1;

    }

}
