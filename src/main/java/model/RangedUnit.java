package model;

class RangedUnit extends MilitaryUnit {

    public RangedUnit(Civilization owner) {
        super(100, owner, 10, 10, 14, 5, 0, 30);
    }

    @Override
    public String toString() {
        return "Ranged Unit. " + super.toString();
    }

    public void battle(MapObject map) {
        map.damage(this.getDamage());
        if ((!(map.isDestroyed()))
            && ((map instanceof HybridUnit) || (map instanceof RangedUnit))) {
            this.damage(((MilitaryUnit) map).getDamage());
        }
    }

    public char symbol() {
        return 'R';
    }
}