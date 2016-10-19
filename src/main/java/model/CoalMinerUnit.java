package model;

class CoalMinerUnit extends Unit implements Convertable {

    public CoalMinerUnit(Civilization owner) {
        super(owner);
    }

    public Building convert() {
        return new CoalMine(getOwner());
    }

    public boolean canConvert(TileType type) {
        if (type == TileType.HILLS) {
            convert();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Coal Miners. " + super.toString();
    }

    @Override
    public char symbol() {
        return 'c';
    }
}