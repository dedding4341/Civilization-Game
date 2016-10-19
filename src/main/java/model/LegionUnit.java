package model;

class LegionUnit extends MeleeUnit {

    @Override
    public void battle(MapObject map) {
        map.damage((int) (this.getDamage()));
        if ((!(map.isDestroyed()))
            && ((map instanceof MeleeUnit))) {
            this.damage(((MilitaryUnit) map).getDamage());
        }
    }

    public LegionUnit(Civilization owner) {
        super(owner);
        this.setDamage(45);
    }

    @Override
    public char symbol() {
        return 'L';
    }

    @Override
    public String toString() {
        return "Legion Unit. " + super.toString();
    }
}