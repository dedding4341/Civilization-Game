package model;

class SettlerUnit extends Unit implements Convertable {

    private String townName;

    public SettlerUnit(Civilization owner, String townName) {
        super(owner);
        this.townName = townName;
    }

    public Building convert() {
        getOwner().incrementNumSettlements();
        return new Settlement(getOwner(), townName);
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
        return "Settlers of " + townName + ". " + super.toString();
    }

    @Override
    public char symbol() {
        return 's';
    }
}