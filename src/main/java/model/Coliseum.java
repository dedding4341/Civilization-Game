package model;

class Coliseum extends Landmark {


    public Coliseum(Civilization owner) {
        super(owner);
    }


    @Override
    public void invest() {
        this.setTechPointGeneration(this.getTechPointGeneration() + 5);
        if (!getOwner().getBeenBoosted()) {
            getOwner().setBeenBoosted(true);
            getOwner().increaseHappiness(50);
        }
    }



    @Override
    public String toString() {
        return "Coliseum. " + super.toString();
    }
}