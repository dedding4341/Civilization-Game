package model;

import javafx.scene.image.Image;

/**
 */
class CamelRider extends RangedUnit {

    /**
     * Public constructor.
     *
     * @param owner the owner of this unit.
     */
    public CamelRider(Civilization owner) {
        super(owner);
        this.setBaseEndurance(this.getBaseEndurance() * 3);
        this.regenerateEndurance();
    }

    @Override
    public char symbol() {
        return 'W';
    }


    @Override
    public String toString() {
        return "Camel Rider Unit. " + super.toString();
    }

    @Override
    public Image getImage() {
        return new Image(
                "File:./src/main/java/view/Civ_Icon/war_chariot_unit.PNG");
    }
}
