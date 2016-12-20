package view;

import javafx.scene.layout.GridPane;
import model.Map;
import model.TerrainTile;
import runner.CivilizationGame;

/**
 * Created by RuYiMarone on 11/11/2016.
 */
public class GridFX extends GridPane {
    private static Map map = CivilizationGame.getMap();
    private static GridFX instance = new GridFX();

    private GridFX() {
        instance = this;    //pseudo singleton so that update can be called
        for (int r = 0; r < map.getSize(); r++) {
            for (int c = 0; c < map.getSize(); c++) {
                this.add(new TerrainTileFX(map.getTile(r, c)), c, r);
            }
        }
    }

/*    public static void dimensionSelect(int a, int b) {
        map = new Map(a,b);
    }*/

    public static void update() {
        instance.getChildren().forEach(
                n -> ((TerrainTileFX) n).updateTileView());
    }

    public static boolean adjacent(TerrainTileFX current, TerrainTileFX other) {
        return adjacent(current.getTile(), other.getTile());
    }

    public static boolean adjacent(TerrainTile selected, TerrainTile other) {
        int srow = selected.getRow();
        int scol = selected.getCol();
        int orow = other.getRow();
        int ocol = other.getCol();
        return (Math.abs(orow - srow) <= 1) && (Math.abs(ocol - scol) <= 1);
    }

    public static Map getMap() {
        return map;
    }

    public static GridFX getInstance() {
        return instance;
    }
}
