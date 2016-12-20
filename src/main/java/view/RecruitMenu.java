package view;

import controller.GameController;
import model.Civilization;
import model.Unit;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
//import java.util.List;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
//import controller.GameController;
//import javafx.scene.Node;
import javafx.scene.control.Alert;
//import javafx.scene.control.Button;
//import javafx.scene.layout.VBox;
//import javafx.scene.text.Text;


/**
 * Created by RuYiMarone on 11/11/2016.
 */
public class RecruitMenu extends AbstractMenu {
    public static final int PREFWIDTH = 140;
    /**
    * recuit menu should have a list of worker/units
    * to choose from. There should also be a select button
    * and the function of the button should be implemented
    *here
    */
    public RecruitMenu() {
        ObservableList<String> preRecruit =
            FXCollections.observableArrayList("Melee Unit", "Range Unit",
            "Hybrid Unit", "Siege Unit", "Settlers", "Farmers",
            "Coal Miners", "Anglers", "Master Builders");
        ListView<String> recruit = new ListView<String>();
        Button btn = new Button("Select");
        addMenuItem(btn);
        recruit.setItems(preRecruit);
        addMenuItem(recruit);
        btn.setOnAction(e -> {
                Civilization currentCiv = GameController.getCivilization();
                String selected = recruit.getSelectionModel().getSelectedItem();
                switch (selected) {
                case "Melee Unit":
                    if (((Unit) currentCiv.getMeleeUnit()).isAffordable()) {
                        ((Unit) currentCiv.getMeleeUnit()).applyInitialCosts();
                        GameController.getLastClicked().getTile()
                            .setOccupant(currentCiv.getMeleeUnit());
                        GameController.getLastClicked().updateTileView();
                    } else {
                        Alert newAlert =
                            new Alert(Alert.AlertType.CONFIRMATION);
                        newAlert.setHeaderText("You do not have enough funds!");
                        newAlert.setTitle("ALERT");
                        newAlert.showAndWait();
                    }
                    break;
                case "Range Unit":
                    if (((Unit) currentCiv.getRangedUnit()).isAffordable()) {
                        ((Unit) currentCiv.getRangedUnit()).applyInitialCosts();
                        GameController.getLastClicked().getTile()
                            .setOccupant(currentCiv.getRangedUnit());
                        GameController.getLastClicked().updateTileView();
                    } else {
                        Alert newAlert =
                            new Alert(Alert.AlertType.CONFIRMATION);
                        newAlert.setHeaderText("You do not have enough funds!");
                        newAlert.setTitle("ALERT");
                        newAlert.showAndWait();
                    }
                    break;
                case "Hybrid Unit":
                    if (((Unit) currentCiv.getHybridUnit()).isAffordable()) {
                        ((Unit) currentCiv.getHybridUnit()).applyInitialCosts();
                        GameController.getLastClicked().getTile()
                            .setOccupant(currentCiv.getHybridUnit());
                        GameController.getLastClicked().updateTileView();
                    } else {
                        Alert newAlert =
                            new Alert(Alert.AlertType.CONFIRMATION);
                        newAlert.setHeaderText("You do not have enough funds!");
                        newAlert.setTitle("ALERT");
                        newAlert.showAndWait();
                    }
                    break;
                case "Siege Unit":
                    if ((
                        (Unit) currentCiv.getSiegeUnit()).isAffordable()) {
                        ((Unit) currentCiv.getSiegeUnit()).applyInitialCosts();
                        GameController.getLastClicked().getTile()
                            .setOccupant(currentCiv.getSiegeUnit());
                        GameController.getLastClicked().updateTileView();
                    } else {
                        Alert newAlert =
                            new Alert(Alert.AlertType.CONFIRMATION);
                        newAlert.setHeaderText("You do not have enough funds!");
                        newAlert.setTitle("Alert");
                        newAlert.showAndWait();
                    }
                    break;
                case "Settlers":
                    if (true/*((Unit) currentCiv.getSettlerUnit())
                        .isAffordable()*/) {
                        GameController.getLastClicked().getTile()
                            .setOccupant(currentCiv.getSettlerUnit(""));
                        GameController.getLastClicked().updateTileView();
                    } else {
                        Alert newAlert =
                            new Alert(Alert.AlertType.CONFIRMATION);
                        newAlert.setHeaderText("You do not have enough funds!");
                        newAlert.setTitle("Alert");
                        newAlert.showAndWait();
                    }
                    break;
                case "Farmers":
                    if (((Unit) currentCiv.getFarmerUnit()).isAffordable()) {
                        ((Unit) currentCiv.getFarmerUnit()).applyInitialCosts();
                        GameController.getLastClicked().getTile()
                            .setOccupant(currentCiv.getFarmerUnit());
                        GameController.getLastClicked().updateTileView();
                    } else {
                        Alert newAlert =
                            new Alert(Alert.AlertType.CONFIRMATION);
                        newAlert.setHeaderText("You do not have enough funds!");
                        newAlert.setTitle("Alert");
                        newAlert.showAndWait();
                    }
                    break;
                case "Coal Miners":
                    if (((Unit) currentCiv.getCoalMinerUnit()).isAffordable()) {
                        ((Unit) currentCiv.getCoalMinerUnit())
                            .applyInitialCosts();
                        GameController.getLastClicked().getTile()
                            .setOccupant(currentCiv.getCoalMinerUnit());
                        GameController.getLastClicked().updateTileView();
                    } else {
                        Alert newAlert =
                            new Alert(Alert.AlertType.CONFIRMATION);
                        newAlert.setHeaderText("You do not have enough funds!");
                        newAlert.setTitle("Alert");
                        newAlert.showAndWait();
                    }
                    break;
                case "Anglers":
                    if (((Unit) currentCiv.getAnglerUnit()).isAffordable()) {
                        ((Unit) currentCiv.getAnglerUnit()).applyInitialCosts();
                        GameController.getLastClicked().getTile()
                            .setOccupant(currentCiv.getAnglerUnit());
                        GameController.getLastClicked().updateTileView();
                    } else {
                        Alert newAlert =
                            new Alert(Alert.AlertType.CONFIRMATION);
                        newAlert.setHeaderText("You do not have enough funds!");
                        newAlert.setTitle("Alert");
                        newAlert.showAndWait();
                    }
                    break;
                case "Master Builders":
                    if (((Unit) currentCiv
                            .getMasterBuilderUnit()).isAffordable()) {
                        ((Unit) currentCiv
                            .getMasterBuilderUnit()).applyInitialCosts();
                        GameController.getLastClicked().getTile()
                            .setOccupant(currentCiv.getMasterBuilderUnit());
                        GameController.getLastClicked().updateTileView();
                    } else {
                        Alert newAlert =
                            new Alert(Alert.AlertType.CONFIRMATION);
                        newAlert.setHeaderText("You do not have enough funds!");
                        newAlert.setTitle("Alert");
                        newAlert.showAndWait();
                    }
                    break;
                default:
                    break;
                }
            }
        );
    }
}
