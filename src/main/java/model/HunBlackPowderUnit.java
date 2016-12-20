package model;

import javafx.scene.image.Image;

/**
 */
class HunBlackPowderUnit extends SiegeUnit {

    /**
     * Public constructor
     *
     * @param owner The owner of this unit.
     */
    HunBlackPowderUnit(Civilization owner) {
        super(owner);
    }

    @Override
    public void battle(MapObject o) {
        o.damage(this.getDamage());
    }

    @Override
    public char symbol() {
        return 'B';
    }


    @Override
    public String toString() {
        return "Black Powder Unit. " + super.toString();
    }
    @Override
    public Image getImage() {
        return new Image("File:./src/main/java/view/Civ_Icon/"
                + "black_powder_unit_icon.PNG");
    }
}
