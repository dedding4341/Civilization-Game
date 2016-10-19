package model;

class QinDynasty extends Civilization {


    public QinDynasty() {
        setName("Qin Dynasty");
    }

    @Override
    public String explore() {
        getHills().replenishGame();
        Game resourceFound = getHills().hunt();
        setFood(resourceFound.getHealth() + getFood());
        return "You explore your surroundings and acquire "
            + resourceFound.getHealth() + " food!";
    }

    @Override
    public SiegeUnit getSiegeUnit() {
        return new BlackPowderUnit(this);
    }

    @Override
    public Landmark getLandmark() {
        return new GreatWall(this);
    }
}
