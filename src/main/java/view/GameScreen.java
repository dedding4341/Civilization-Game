package view;

import controller.GameController;
//import javafx.application.;
//import javafx.stage.;
//import javafx.scene.;
//import javafx.scene.layout.;
//import javafx.scene.control.;
//import javafx.geometry.Pos;
//import javafx.scene.Node;
import model.Bandit;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

//import model.Civilization;

/**
 * This class represents the GameScreen class
 */
public class GameScreen extends BorderPane {

    private static ResourcesMenu resourceCurr = new ResourcesMenu();
    private static AbstractMenu abbMenu = new AbstractMenu();
    private static MilitaryMenu miliMenu = new MilitaryMenu();
    private static RecruitMenu recMenu = new RecruitMenu();
    private static BuildingMenu buildMenu = new BuildingMenu();
    private static WorkerMenu workMenu = new WorkerMenu();
    private static VBox menuCurr = new VBox();

    //static NeutralMenu neutMenu = new NeutralMenu(); // Implement later
    /**
     * Creates a new view into the game. this layout should include
     * the rescource bar, grid map, and action menus
     *
     */
    public GameScreen(String firstCityName) {
        GridFX.getMap().putSettlement(firstCityName,
            GameController.getCivilization(), 4, 4);

        Bandit bandits = new Bandit();
        GameController.setBandits(bandits);
        GridFX.getMap().addEnemies(bandits, 7);
        menuCurr.setPrefWidth(AbstractMenu.PREFWIDTH);
        this.setTop(resourceCurr.getRootNode());
        this.setCenter(GridFX.getInstance());
        this.setLeft(menuCurr);
        update();
    }

    /**
     * This method should update the gridfx and the resource bar
     */
    public void update() {

        GridFX.update();
        resourceCurr.update();
    }
    /**
    * this method should return the resource menu
    * @return reosuce menu
    */
    public static ResourcesMenu getResources() {
        return resourceCurr;
    }


    /**
     * This method switches menus based on passed in game state.
     * Game.java calls this to selectively control which menus are displayed
     * @param state
     */
    public static void switchMenu(GameController.GameState state) {
        menuCurr.getChildren().clear();
        switch (state) {
        case MILITARY:
            menuCurr.getChildren().addAll(miliMenu.getRootNode());

            break;
        case WORKER:
            menuCurr.getChildren().addAll(workMenu.getRootNode());

            break;
        case RECRUITING:
            menuCurr.getChildren().addAll(recMenu.getRootNode());

            break;
        case BUILDING:
            menuCurr.getChildren().addAll(buildMenu.getRootNode());

            break;
        case NEUTRAL:
            menuCurr.getChildren().addAll(abbMenu.getRootNode());

            break;
        default:
            break;
        }

    }
}
