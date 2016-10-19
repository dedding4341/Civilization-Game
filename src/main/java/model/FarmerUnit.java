package model;

class FarmerUnit extends Unit implements Convertable {

    public FarmerUnit(Civilization owner) {
        super(owner);
    }

    public Building convert() {
        return new Farm(getOwner());
    }

    public boolean canConvert(TileType type) {
        if (type == TileType.PLAINS) {
            convert();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Farmers. " + super.toString();
    }

    @Override
    public char symbol() {
        return 'f';
    }
}