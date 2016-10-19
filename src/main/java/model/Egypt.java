package model;


class Egypt extends Civilization {

    public Egypt() {
        setName("Egypt");
    }


    @Override
    public String explore() {
        int resourceFound = getDesert().findTreasure();
        getTreasury().earn(resourceFound);

        return "You explore your surroundings and acquire "
            + resourceFound + " resources!";
    }

    @Override
    public RangedUnit getRangedUnit() {
        return new WarChariot(this);
    }



    @Override
    public Landmark getLandmark() {
        return new Pyramid(this);
    }
}
