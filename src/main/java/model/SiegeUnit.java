package model;

class SiegeUnit extends MilitaryUnit {

    @Override
    public String toString() {
        return "Siege Unit. " + super.toString();
    }

    public SiegeUnit(Civilization owner) {
        super(200, owner, 5, 10, 14, 5, 10, 60);
    }

    public void battle(MapObject map) {
        if (map instanceof Building) {
            map.damage(((MilitaryUnit) this).getDamage());
        }
    }

    public char symbol() {
        return 'S';
    }

    @Override
    public void attack(MapObject map) {
        //Come back to this

        getOwner().getStrategy().siege();
        battle(map);
        setCanAttack(false);
    }
}