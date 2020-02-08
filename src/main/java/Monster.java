public abstract class Monster extends Creature implements AbleToAttack {

    public Monster(int hp, int strength, boolean alive, WeaponType weaponType) {
        super(hp, strength, alive, weaponType);
    }
}

