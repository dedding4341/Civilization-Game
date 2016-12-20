package model;

/**
 * Represents the Hun Dynasty Civiization.
 */
public class HunDynasty extends Civilization {
    private Hills hills = new Hills();

    /**
     * Public constructor.
     */
    public HunDynasty() {
        super("Hun Dynasty");
    }

    @Override
    public String explore() {
        int food = hills.hunt().getHealth();
        hills.replenishGame();
        makeFood(food);
        return "You go hunting and get " + food + " food!";
    }

    /**
     * @return the Hills for this Civilization.
     */
    public Hills getHills() {
        return hills;
    }

    @Override
    public SiegeUnit getSiegeUnit() {
        return new HunBlackPowderUnit(this);
    }

    @Override
    public Landmark getLandmark() {
        return new GreatWall(this);
    }
}
