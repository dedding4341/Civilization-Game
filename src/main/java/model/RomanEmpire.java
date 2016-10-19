package model;

class RomanEmpire extends Civilization {



    public RomanEmpire() {
        setName("Roman Empire");
    }

    @Override
    public String explore() {
        int resourceFound = getHills().mineCoal();
        setResources(resourceFound + getResources());

        return "You explore your surroundings and acquire " + resourceFound
            + " resources!";
    }

    @Override
    public MeleeUnit getMeleeUnit() {
        return new LegionUnit(this);
    }

    @Override
    public Landmark getLandmark() {
        return new Coliseum(this);
    }
}
