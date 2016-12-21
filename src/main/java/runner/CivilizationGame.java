package runner;

import controller.GameController;
import view.StartScreen;
import view.CivEnum;
import view.GameScreen;
import model.Map;
import model.QinDynasty;
import model.RomanEmpire;
import model.Egypt;
import model.HunDynasty;
import model.GreekEmpire;
import model.Sudan;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
//import javafx.scene;
import javafx.scene.Scene;
//import javafx.scene.layout;
//import javafx.scene.control;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
/**
 * Created by Tian-Yo Yang on 11/11/2016.
 */
public class CivilizationGame extends Application {
    private GameScreen gameScreen;
    private Optional<String> result;
    private static Map map;

    /**
     * this method is called upon running/launching the application
     * this method should display a scene on the stage
     */
    public void start(Stage primaryStage) {
        primaryStage.setTitle("I Want An A In CS 1331 Plz.Civilization");
        StartScreen starter1 = new StartScreen();
        Scene starter2 = new Scene(starter1);
        primaryStage.setScene(starter2);



        primaryStage.show();
        Button btn = starter1.getStartButton();

        btn.setOnAction(e -> {
                String musicFile = "src/For You.mp3";
                Media sound = new Media(new File(musicFile)
                    .toURI().toString());
                MediaPlayer mediaPlayer = new MediaPlayer(sound);
                mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
                mediaPlayer.play();
                GameController.setCivilization(new Egypt());
                String civ =
                    starter1.getCivList().getSelectionModel()
                    .getSelectedItem().toString();
                if (civ == CivEnum.ANCIENT_EGYPT.toString()) {
                    GameController.setCivilization(new Egypt());
                } else if (civ == CivEnum.ROMAN_EMPIRE.toString()) {
                    GameController.setCivilization(new RomanEmpire());
                } else if (civ == CivEnum.QIN_DYNASTY.toString()) {
                    GameController.setCivilization(new QinDynasty());
                } else if (civ == CivEnum.SUDAN.toString()) {
                    GameController.setCivilization(new Sudan());
                } else if (civ == CivEnum.GREEK_EMPIRE.toString()) {
                    GameController.setCivilization(new GreekEmpire());
                } else if (civ == CivEnum.HUN_DYNASTY.toString()) {
                    GameController.setCivilization(new HunDynasty());
                } else {
                    GameController.setCivilization(new Egypt());
                }
                TextInputDialog dia = new TextInputDialog();
                dia.setTitle("Name Your Settlement");
                dia.setHeaderText("First Settlement");
                dia.setContentText("Please enter the name of your"
                    + " first settlement:");
                result = dia.showAndWait();
                textRow();



                //textCol();
                //view.GridFX.dimensionSelect(this.row,this.col);
                //GameController.putSettlement()


                //GameController.getCivilization().incrementNumSettlements();

                primaryStage.setScene(startGame());


                gameScreen.update();
                primaryStage.show();
            });
    }
    /**
     * This is the main method that launches the javafx application
     */
    public static void main(String[] args) {
        launch(args);
    }

    public void textRow() {
        TextInputDialog dia1 = new TextInputDialog();
        dia1.setTitle("How Many Rows?");
        dia1.setHeaderText("Rows");
        dia1.setContentText("Please chose a number of rows (10, 12, 14):");
        Optional<String> result1 = dia1.showAndWait();
        if (result1.get().equals("10")) {
            map = new Map(10);
        } else if (result1.get().equals("12")) {
            map = new Map(12);
            //System.out.println("deb");
        } else if (result1.get().equals("14")) {
            map = new Map(14);
        }
    }

    public static Map getMap() {
        return map;
    }



    /**
    * This method is responsible for setting the scene to the corresponding
    * layout.
    * and returning the scene.
    * @return Scene
    */
    public Scene startGame() {
        gameScreen = new GameScreen(result.get());
        return new Scene(gameScreen);
    }
}
