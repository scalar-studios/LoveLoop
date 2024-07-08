package dev.lemonjuice.loveloop.scene.week.builder;

import dev.lemonjuice.loveloop.LoveLoop;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

/**
 * This is a class that can dynamically build scenes for the Visual Novel portion of the game.
 *
 * @author Lemon
 */
public class SceneBuilder {

    /**
     * Creates the base scene for the Visual Novel portion of the game.
     * This requires the creation of several elements:
     * 1. A background image, displayed behind all other elements.
     * 2. Character images that can be displayed in one of four positions: left, center, right, and off-screen.
     * 3. A text box that displays the dialogue of the characters, including the name of the character speaking.
     * The text box is composed of several sections:
     * 1. The graphic section, which is the image of the text box itself.
     * 2. The text section, which is the text that will be displayed in the text box.
     * 3. Another graphic section, which is the image of the name plate that sits on the top left of the text box.
     * 4. The name section, which is the name of the character speaking.
     *
     * @param background The file path to the background image. This should not be changed unless the scene changes.
     * @param leftCharacter The file path to the left character image. This can be null if there is no character on the left.
     *                      This is an array as this can change throughout the scene.
     * @param centerCharacter The file path to the center character image. This can be null if there is no character in the center.
     *                        This is an array as this can change throughout the scene.
     * @param rightCharacter The file path to the right character image. This can be null if there is no character on the right.
     *                       This is an array as this can change throughout the scene.
     * @param text The text that will be displayed in the text box.
     *             This is an array as this will change throughout the scene.
     * @param name The name of the character speaking.
     *             This is an array as this will change throughout the scene.
     *
     * The scene will progress if the space bar is pressed, or if the mouse is clicked.
     * However, the mouse click is reserved for the player to make choices in the game.
     *
     * @return The constructed scene.
     */
    public static Scene buildScene(String background, String[] leftCharacter, String[] centerCharacter, String[] rightCharacter, String[] text, String[] name) {
        StackPane root = new StackPane();
        Scene scene = new Scene(root, LoveLoop.WINDOW_WIDTH, LoveLoop.WINDOW_HEIGHT);

        // Set the background image, this will be displayed behind all other elements and fill the screen.
        Image backgroundImage = new Image(background);
        ImageView backgroundView = new ImageView(backgroundImage);
        backgroundView.setFitWidth(LoveLoop.WINDOW_WIDTH);
        backgroundView.setFitHeight(LoveLoop.WINDOW_HEIGHT);
        root.getChildren().add(backgroundView);

        // Add the background image to the scene.
        root.getChildren().add(backgroundView);

        // This likely won't work either, back to the drawing board
        // The issue comes from the fact that we can't build the scene without the models and text box fighting over the top position.

        return scene;
    }

}
