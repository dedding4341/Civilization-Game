package model;

class Farm extends Building {

    public Farm(Civilization owner) {
        super(200, owner, 0, 0, 10, 0, 0, 10);
    }

    public char symbol() {
        return '+';
    }

    public void invest() {
        this.setFoodGeneration(this.getFoodGeneration() + 2);
    }

    @Override
    public String toString() {
        return "Farm. " + super.toString();
    }
}