public class Player extends Creature implements AbleToAttack {
    @Override
    public Integer attack() {
        return strength + weaponType.getDamage() + 1;
    }

    public Player() {
        weaponType =WeaponType.SWORD;
        strength = 60;
        hp = 1200;

    }
}
