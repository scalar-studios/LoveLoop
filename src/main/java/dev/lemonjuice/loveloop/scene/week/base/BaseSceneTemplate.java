package dev.lemonjuice.loveloop.scene.week.base;

import dev.lemonjuice.loveloop.LoveLoop;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

import java.io.FileNotFoundException;

/**
 * This is the class that creates all the basic scenes for the Visual Novel portion of the weekly scenes for the game.
 *
 * @author Lemon
 */
public class BaseSceneTemplate {

    /**
     * Creates the base scene for the Visual Novel portion of the game.
     * This requires the creation of several elements:
     * 1. A background image, displayed behind all other elements.
     * 2. Character images that can be displayed in one of four positions: left, right, center, and off-screen.
     * 3. A text box that displays the dialogue of the characters, including the name of the character speaking.
     * The text box is composed of several sections:
     * 1. The graphic section, which is the image of the text box itself.
     * 2. The text section, which is the text that will be displayed in the text box.
     * 3. Another graphic section, which is the image of the name plate that sits on the top left of the text box.
     * 4. The name section, which is the name of the character speaking.
     *
     * @return The base scene for the Visual Novel portion of the game.
     */
    public static Scene createBaseScene() throws FileNotFoundException {
        StackPane root = new StackPane();
        Scene baseScene = new Scene(root, LoveLoop.WINDOW_WIDTH, LoveLoop.WINDOW_HEIGHT);



        return baseScene;
    }
}