package view;


import controller.GameController;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import model.TerrainTile;
//import model.MapObject;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;

/**
 * Created by RuYiMarone on 11/11/2016.
 */
public class TerrainTileFX extends StackPane {
    private Rectangle overlay;
    private ImageView background;
    private TerrainTile tile;
    private ImageView icon = new ImageView("File:./bologna");
    private DropShadow shadow = new DropShadow();
    /**
     * Constructor for TerrainTileFX.
     * Creates a Rectangle for the highlighting and overlay
     * Creates ImageViews for the background terrain and icon
     * Transitions states when a tile is clicked
     * @param tile
     */
    public TerrainTileFX(TerrainTile tile) {
        this.tile = tile;
        overlay = new Rectangle(70, 70, Color.rgb(0, 0, 0, 0.0));
        overlay.setStroke(Color.BLACK);
        this.background = new ImageView(tile.getImage());
        this.getChildren().addAll(background, overlay);
        updateTileView();
        this.setOnMousePressed(event -> {
                GameController.setLastClicked(this);
            });
    }
    /**
     * gets the TerrainTile of this TerrainTileFX
     * @return TerrainTile
     */
    public TerrainTile getTile() {
        return tile;
    }
    /**
     * this method updates the view of this TerrainTileFX.
     * It should check if the TerrainTile is empty. If it is empty,
     * set the overlay to be transparent. If it is not empty, fill
     * the overlay with the color of the occupant on the terrain tile
     * If the TerrainTileFX contains an icon, remove it. If the tile is
     * not empty, get the image of the occupant of the tile and add the
     *image of the occupant to the tile.
     */
    public void updateTileView() {

        if (GameController.getLastClicked() == this) {
            overlay.setFill(Color.rgb(255, 248, 66, .4));
        } else if (tile.isEmpty()) {
            overlay.setFill(Color.TRANSPARENT);
        } else {
            overlay.setFill(getTile().getOccupant().getColor());
        }
        if (this.getChildren().contains(icon)) {
            this.getChildren().remove(icon);
        }
        if (!tile.isEmpty()) {
            Image image = tile.getOccupant().getImage();
            ImageView iv = new ImageView(image);
            icon = iv;
        } else {
            icon = new ImageView("File:./bologna");
        }
        this.getChildren().add(icon);
    }
}
