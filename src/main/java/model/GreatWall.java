package model;

class GreatWall extends Landmark {

    public GreatWall(Civilization owner) {
        super(owner);
    }



    @Override
    public void invest() {
        this.setTechPointGeneration(this.getTechPointGeneration() + 5);
        if (!getOwner().getBeenBoosted()) {
            getOwner().setBeenBoosted(true);
            getOwner().getStrategy().setStrategyLevel(
                getOwner().getStrategy().getStrategyLevel() + 10);
        }
    }


    @Override
    public String toString() {
        return "Great Wall. " + super.toString();
    }
}