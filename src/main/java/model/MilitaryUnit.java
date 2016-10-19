package model;

abstract class MilitaryUnit extends Unit {
    private int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public MilitaryUnit(int health, Civilization owner, int baseEndurance,
        int pay, int initialGoldCost, int initialFoodCost,
        int initialResourceCost, int damage) {
        super(health, owner, baseEndurance, pay,
        initialGoldCost, initialFoodCost, initialResourceCost, 10);
        this.damage = damage;
    }

    @Override
    public void tick() {
        consumeResources();
        regenerateEndurance();
        setCanAttack(true);
    }

    public abstract void battle(MapObject map);

    public void attack(MapObject map) {
        //Come back to this

        this.battle(map);
        getOwner().getStrategy().battle();
        setCanAttack(false);
    }

    @Override
    public String toString() {
        return "Military Unit. " + super.toString();
    }

}