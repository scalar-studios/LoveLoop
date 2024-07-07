package dev.lemonjuice.loveloop.scene.week.base;

import dev.lemonjuice.loveloop.LoveLoop;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.io.FileInputStream;

/**
 * This is the class that creates all the basic scenes for the Visual Novel portion of the weekly scenes for the game.
 *
 * @author Lemon
 */
public class BaseSceneTemplate {

    /**
     * Creates the base scene for the Visual Novel portion of the game.
     * This requires the creation of a background image, a character image, and a text box.
     *
     * @return The base scene for the Visual Novel portion of the game.
     */
    public static Scene createBaseScene() {
        Pane root = new Pane();
        Scene baseScene = new Scene(root, LoveLoop.WINDOW_WIDTH, LoveLoop.WINDOW_HEIGHT);
        System.out.println("Base Scene Created");

        // Add Background Image
        // No Image Provided Yet

        // Add Character Image
        // No Image Provided Yet

        // Add Text Box
        Label textBox = new Label();
        textBox.setWrapText(true);
        textBox.setStyle("-fx-font-size: 12");
        int textBoxXPadding = 50;
        int textBoxYHeight = 200;
        int textBoxYPadding = textBoxYHeight + 50;
        textBox.setLayoutX(textBoxXPadding);
        textBox.setMaxWidth(LoveLoop.WINDOW_WIDTH - (textBoxXPadding * 2));
        textBox.setLayoutY(LoveLoop.WINDOW_HEIGHT - textBoxYPadding);
        textBox.setMaxHeight(textBoxYHeight);

        textBox.setText("Test Text");

        root.getChildren().addAll(textBox);
        return baseScene;
    }
}
