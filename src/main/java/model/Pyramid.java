package model;

class Pyramid extends Landmark {

    public Pyramid(Civilization owner) {
        super(owner);
    }

    @Override
    public void invest() {
        this.setTechPointGeneration(this.getTechPointGeneration() + 5);
        if (!getOwner().getBeenBoosted()) {
            getOwner().setBeenBoosted(true);
            getOwner().getTechnology().philosophize();
        }
    }



    @Override
    public String toString() {
        return "Pyramid. " + super.toString();
    }
}