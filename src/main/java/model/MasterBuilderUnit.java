package model;

class MasterBuilderUnit extends Unit implements Convertable {

    public MasterBuilderUnit(Civilization owner) {
        super(owner);
    }

    public Building convert() {
        return getOwner().getLandmark();
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
        return "Master Builders. " + super.toString();
    }

    @Override
    public char symbol() {
        return 'm';
    }
}