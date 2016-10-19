package model;

class BlackPowderUnit extends SiegeUnit {
    @Override
    public void battle(MapObject map) {
        map.damage(((MilitaryUnit) this).getDamage());
    }

    public BlackPowderUnit(Civilization owner) {
        super(owner);
    }

    @Override
    public char symbol() {
        return 'B';
    }

    @Override
    public String toString() {
        return "Black Powder Unit. " + super.toString();
    }
}