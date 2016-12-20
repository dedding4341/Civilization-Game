package view;

import controller.GameController;
import model.Building;
import model.Settlement;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;


/**
 * This class should represents the bulding menu
 */
public class BuildingMenu extends AbstractMenu {
    /**
    * there should be an invest and demolish button for this menu
    * as well as functions associated with the buttons
    */

    private Button investButton = new Button("Invest");
    private Button demolishButton = new Button("Demolish"); //import

    public BuildingMenu() {
        this.addMenuItem(investButton);
        this.addMenuItem(demolishButton);

        investButton.setOnAction(e -> {
                TerrainTileFX lastClicked = GameController.getLastClicked();
                if (lastClicked.getTile().getOccupant().getOwner()
                    .getTreasury().getCoins() >= 25) {
                    ((Building) lastClicked.getTile().getOccupant()).invest();
                    lastClicked.updateTileView();
                    GameController.updateResourcesBar();
                } else {
                    Alert newAler = new Alert(Alert.AlertType.CONFIRMATION);
                    newAler.setHeaderText("You can't do that!");
                    newAler.setTitle("You cannot invest");
                    newAler.showAndWait();
                }
            });

        demolishButton.setOnAction(e -> {
                TerrainTileFX lastClicked = GameController.getLastClicked();
                if (lastClicked.getTile().getOccupant().getOwner()
                    .getNumSettlements() > 1
                    && lastClicked.getTile()
                    .getOccupant() instanceof Settlement) {
                    lastClicked.getTile().setOccupant(null);
                    ((Building) lastClicked.getTile().getOccupant()).demolish();
                    lastClicked.updateTileView();
                    GameController.updateResourcesBar();
                } else {
                    Alert newAler = new Alert(Alert.AlertType.CONFIRMATION);
                    newAler.setHeaderText("You can't do that!");
                    newAler.setTitle("You cannot Demolish");
                    newAler.showAndWait();
                }
            });

    }
}
