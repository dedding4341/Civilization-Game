package view;

import controller.GameController;
//import javafx.scene.Node;
//import javafx.scene.control.Alert;
import javafx.scene.control.Button;
//import javafx.scene.layout.VBox;
//import javafx.scene.text.Text;

/**
 * Created by William on 11/11/2016.
 */

public class MilitaryMenu extends AbstractMenu {



    /**
    * Implement the buttons and actions associated with
    * the buttons for the military menu
    */
    public MilitaryMenu() {
        Button move = new Button("Move");
        Button atk = new Button("Attack");
        move.setOnAction(e -> {
                GameController.moving();
            });
        atk.setOnAction(e -> {
                GameController.attacking();
            });
        addMenuItem(move);
        addMenuItem(atk);
        GameController.updateResourcesBar();

    }
/*
    @Override
    public VBox getRootNode() {
        updateItems();
        return menu;
    }

    private void updateItems() {
        unitStatus.setText("");
        if (GameController.getLastClicked() != null) {
            terrain.setText(GameController.getLastClicked()
                    .getTile().getType().toString());
            if (!GameController.getLastClicked().getTile().isEmpty()) {
                unitStatus.setText(GameController.getLastClicked()
                        .getTile().getOccupant().getStatusString());
            }
        }
    }*/
}
