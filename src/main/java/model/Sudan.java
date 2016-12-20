package model;

/**
 */
public class Sudan extends Civilization {
    private Desert desert = new Desert();

    /**
     * Public constructor.
     */
    public Sudan() {
        super("Sudan");
    }

    @Override
    public String explore() {
        int gold = desert.findTreasure();
        getTreasury().earn(gold);
        return "You explore the deserts of Sudan and find " + gold + " gold!";
    }

    /**
     * @return this civilization's Desert.
     */
    public Desert getDesert() {
        return desert;
    }

    @Override
    public RangedUnit getRangedUnit() {
        return new CamelRider(this);
    }

    @Override
    public Landmark getLandmark() {
        return new Pyramid(this);
    }
}
