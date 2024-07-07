package dev.lemonjuice.loveloop;

import dev.lemonjuice.loveloop.scene.menu.MenuScenes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The main class of the Love Loop game.
 * This class is responsible for setting up the JavaFX application.
 *
 * @author Lemon
 */
public class LoveLoop extends Application {
    public static final int WINDOW_WIDTH = 1280;
    public static final int WINDOW_HEIGHT = 720;

    @Override
    public void start(Stage stage) throws IOException {
        // Stage Properties
        stage.setTitle("Love Loop");

        // Set The Stage to the Main Menu Scene (Default)
        Scene mainMenuScene = MenuScenes.loadMainMenuScene(stage);
        stage.setScene(mainMenuScene);

        // Show The Stage
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}