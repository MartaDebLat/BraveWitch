public enum WeaponType {

    SWORD(10), MACE(6), UNARMED(0);

    private final int damage;

    WeaponType(int damage) {

        this.damage = damage;
    }

    public int getDamage() {

        return damage;
    }
}
