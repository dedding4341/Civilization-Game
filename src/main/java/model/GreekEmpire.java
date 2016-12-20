package model;

/**
 * Represents the Greek Empire civilization.
 *
 */
public class GreekEmpire extends Civilization {
    private Hills hills = new Hills();

    /**
     * Public constructor.
     */
    public GreekEmpire() {
        super("Greek Empire");
    }

    @Override
    public String explore() {
        int resources = hills.mineCoal();
        produceResources(resources);
        return "You go mining and get " + resources + " resources!";
    }

    /**
     * @return the Hills for this Civilization.
     */
    public Hills getHills() {
        return hills;
    }

    @Override
    public MeleeUnit getMeleeUnit() {
        return new GreekLegionUnit(this);
    }

    @Override
    public Landmark getLandmark() {
        return new Coliseum(this);
    }

}
