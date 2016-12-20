package view;

//import model.Civilization;
//import javafx.application.;
//import javafx.stage.;
//import javafx.scene.;
import javafx.scene.layout.VBox;
import javafx.scene.control.ListView;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
//import java.util.List;
import javafx.scene.image.Image;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
//import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
/**
 * Created by Tian-Yo Yang on 11/11/2016.
 * This class represents the Start Screen for the Civ applicatios. This is the
 * layout that should be displayed upon running the Civ application.
 *
 * This class should have and display
 * 1. a background
 * 2. a list of Civilizations
 * 3. a Start button
 */
public class StartScreen extends StackPane {
    private Button btn;
    private ListView<CivEnum> civs;

    /**
    * constuctor of the start screen. Should set the background
    * image and display a list of civilizations and a start button
    */
    public StartScreen() {
        ImageView iv1 =
            new ImageView(
                new Image("File:./src/main/java/view/civ_background.png"));
        VBox content = new VBox();
        btn = new Button("START");


        ObservableList<CivEnum> precivs = FXCollections.observableArrayList();
        civs = new ListView<CivEnum>(precivs);

        for (CivEnum lookAt:CivEnum.values()) {
            precivs.add(lookAt);
        }
        civs.setItems(precivs);
        civs.setMaxWidth(200);
        civs.setMaxHeight(200);
        Label label = new Label("Select Your Civilization!");

        content.setAlignment(Pos.BOTTOM_CENTER); // this alligns it
        content.getChildren().addAll(label, getCivList(), getStartButton());
        this.getChildren().addAll(iv1, content);

        //btn.setOnAction(e -> runner.CivilizationGame.startGame());
    }
    /**
    * gets the start button
    * @return the start button
    */
    public Button getStartButton() {
        return btn;
    }
    /**
    * return a ListView of CivEnums representing the list of
    * available civilizations to choose from
    * @return listview of CivEnum
    */
    public ListView<CivEnum> getCivList() {

        return civs;
    }
}