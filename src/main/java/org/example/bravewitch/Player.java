package org.example.bravewitch;

public class Player extends Creature implements AbleToAttack {

    public Player(WeaponType playerWeapon) {
        super(80, 25, true, playerWeapon);

    }

    @Override
    public int attack() {
        return strength + weaponType.getDamage() + 1;

    }

}
