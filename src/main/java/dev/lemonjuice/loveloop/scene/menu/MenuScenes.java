package dev.lemonjuice.loveloop.scene.menu;

import dev.lemonjuice.loveloop.LoveLoop;
import dev.lemonjuice.loveloop.scene.week.base.BaseSceneTemplate;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MenuScenes {
    private static final double BUTTON_WIDTH = 200;
    private static final double BUTTON_HEIGHT = 50;

    public static Scene loadMainMenuScene(Stage stage) throws FileNotFoundException {
        // Create a VBox to be the root of the scene
        VBox root = new VBox();
        Scene menuScene = new Scene(root, LoveLoop.WINDOW_WIDTH, LoveLoop.WINDOW_HEIGHT);
        root.alignmentProperty().set(javafx.geometry.Pos.CENTER);
        root.spacingProperty().set(20);

        // Add Title Image to the VBox
        FileInputStream inputStream = new FileInputStream("src/main/resources/dev/lemonjuice/loveloop/image/title.png");
        Image titleImage = new Image(inputStream);
        ImageView titleImageView = new ImageView(titleImage);

        // Add Buttons to the VBox
        Button startButton = new Button("Start");
        startButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        startButton.setStyle("-fx-font-size: 20");
        startButton.setOnAction(e -> {
            // Load the base scene of the game for now
            Scene baseScene = BaseSceneTemplate.createBaseScene();
            stage.setScene(baseScene);
        });

        Button optionsButton = new Button("Options");
        optionsButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        optionsButton.setStyle("-fx-font-size: 20");

        Button exitButton = new Button("Exit");
        exitButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        exitButton.setStyle("-fx-font-size: 20");

        // Add Children and Return the Scene
        root.getChildren().addAll(titleImageView, startButton, optionsButton, exitButton);
        return menuScene;
    }
}
