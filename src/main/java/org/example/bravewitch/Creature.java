package org.example.bravewitch;

public class Creature {

    int hp, strength;
    boolean alive;
    WeaponType weaponType;

    public Creature(int hp, int strength, boolean alive, WeaponType weaponType) {
        this.hp = hp;
        this.strength = strength;
        this.alive = alive;
        this.weaponType = weaponType;
    }

    public void receiveDamage(int dmg) {
        hp = hp - dmg;
        if (hp <= 0) {
            boolean alive = false;
        }
        System.out.println("Received " + dmg + " dmg points!");
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }
}
