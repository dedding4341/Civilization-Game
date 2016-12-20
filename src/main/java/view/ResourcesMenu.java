package view;

import controller.GameController;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
//import model.Civilization;

public class ResourcesMenu {

/*    Text stratText = new Text(10, 40, "Strat Level: "
        + GameController.getCivilization().getStrategy().getStrategyLevel());
    Text resourceText = new Text(10, 40, "Resources: "
        + GameController.getCivilization().getResources());
    Text settlementText = new Text(10, 40, "Settlements: "
        + GameController.getCivilization().getNumSettlements());
    Text moneyText = new Text(10, 40, "Money: "
        + GameController.getCivilization().getTreasury().getCoins());
    Text foodText = new Text(10, 40, "Food: "
        + GameController.getCivilization().getFood());
    Text happyText = new Text(10, 40, "Happiness: "
        + GameController.getCivilization().getHappiness());*/
    private Text compText = new Text(10, 40, "Strat Level: "
            + GameController.getCivilization().getStrategy().getStrategyLevel()
            + "    Resources: "
            + GameController.getCivilization().getResources()
            + "    Settlements: "
            + GameController.getCivilization().getNumSettlements()
            + "    Money: "
            + GameController.getCivilization().getTreasury().getCoins()
            + "    Food: "
            + GameController.getCivilization().getFood()
            + "    Happiness: "
            + GameController.getCivilization().getHappiness());
    private HBox content = new HBox(50);

    /**
    * creates a resource bar and display the current state of
    * your civilization's resouces
    */
    public ResourcesMenu() {
/*        Text stratText = new Text(10, 40, "Strat Level: "
            + GameController.getCivilization().getStrategy().getStrategyLevel()
            + "    Resources: "
            + GameController.getCivilization().getResources()
            + "    Settlements: "
            + GameController.getCivilization().getNumSettlements()
            + "    Money: "
            + GameController.getCivilization().getTreasury().getCoins()
            + "    Food: "
            + GameController.getCivilization().getFood()
            + "    Happiness: "
            + GameController.getCivilization().getHappiness());*/


        content.getChildren().addAll(compText);
    }
    /**
    * should update all the resouce values to the current
    * state of your resource values
    */
    public void update() {
/*        stratText.setText("Strat Level: "
            + GameController.getCivilization().getStrategy().getStrategyLevel())
            + "    ";
        resourceText.setText("Resources: "
            + GameController.getCivilization().getResources()) + "    ";
        settlementText.setText("Settlements: "
            + GameController.getCivilization().getNumSettlements()) + "    ";
        moneyText.setText("Money: "
            + GameController.getCivilization().getTreasury().getCoins())
            + "    ";
        foodText.setText("Food: "
            + GameController.getCivilization().getFood()) + "    ";
        happyText.setText("Happiness: "
            + GameController.getCivilization().getHappiness()) + "    ";*/
        //content.getChildren.clear();
        compText.setText("Strat Level: "
            + GameController.getCivilization().getStrategy().getStrategyLevel()
            + "    Resources: "
            + GameController.getCivilization().getResources()
            + "    Settlements: "
            + GameController.getCivilization().getNumSettlements()
            + "    Money: "
            + GameController.getCivilization().getTreasury().getCoins()
            + "    Food: "
            + GameController.getCivilization().getFood()
            + "    Happiness: "
            + GameController.getCivilization().getHappiness());
        //content.getChildren().addAll(compText);
    }
    /**
    * updates the resource bar and returns the resource bar
    * @return a hbox representation of the resource bar
    */
    public HBox getRootNode() {
        return content;
    }
}