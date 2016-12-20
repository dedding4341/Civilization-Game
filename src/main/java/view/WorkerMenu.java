package view;

//import controller.GameController;
import model.Convertable;
//import model.MapObject;
//import model.TerrainTile;
import model.Building;
import javafx.scene.control.Alert.AlertType;
import controller.GameController;
//import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
//import javafx.scene.layout.VBox;
//import javafx.scene.text.Text;

/**
 * Created by RuYiMarone on 11/11/2016.
 */
public class WorkerMenu extends AbstractMenu {
    /**
    * There should be a convert and move button
    * as well as the functions associated with those
    * buttons
    */
    public WorkerMenu() {

        Button getGoin = new Button("Move");
        getGoin.setOnAction(e -> {
                GameController.moving();
            });
        addMenuItem(getGoin);
        Button convert = new Button("Convert");
        convert.setOnAction(e -> {
                if (((Convertable) GameController.getLastClicked().getTile()
                    .getOccupant())
                    .canConvert(GameController.getLastClicked().getTile()
                        .getType())) {
                    Building b =
                        ((Convertable) GameController.getLastClicked().getTile()
                        .getOccupant()).convert();
                    GameController.getLastClicked().getTile().setOccupant(b);
                    GameController.getLastClicked().updateTileView();
                    GameController.updateResourcesBar();
                } else {
                    Alert aL = new Alert(AlertType.INFORMATION);
                    aL.setTitle("Didn't Convert");
                    aL.setHeaderText("Tile selected can not be converted");
                    aL.showAndWait();
                }

            });
        addMenuItem(convert);
    }
}
