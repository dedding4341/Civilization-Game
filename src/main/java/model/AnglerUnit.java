package model;

class AnglerUnit extends Unit implements Convertable {

    public AnglerUnit(Civilization owner) {
        super(owner);
    }

    public Building convert() {
        return new FishingShack(getOwner());
    }

    public boolean canConvert(TileType type) {
        if (type == TileType.WATER) {
            convert();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Anglers. " + super.toString();
    }

    @Override
    public char symbol() {
        return 'a';
    }
}