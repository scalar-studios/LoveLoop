package dev.lemonjuice.loveloop.scene.week.base;

import dev.lemonjuice.loveloop.LoveLoop;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BaseSceneTemplate {
    public static Scene createBaseScene() throws FileNotFoundException {
        StackPane root = new StackPane();
        Scene baseScene = new Scene(root, LoveLoop.WINDOW_WIDTH, LoveLoop.WINDOW_HEIGHT);

        // Add Background Image
        // No Image Provided Yet

        // Add Character Image
        // No Image Provided Yet

        // Add Text Box (Unified)
        int textBoxYHeight = 200;

        // Add Text Box (Graphic Section)
        FileInputStream inputStream = new FileInputStream("src/main/resources/dev/lemonjuice/loveloop/image/container/textbox.png");
        Image textBoxImage = new Image(inputStream);
        ImageView textBoxImageView = new ImageView(textBoxImage);
        StackPane.setAlignment(textBoxImageView, javafx.geometry.Pos.BOTTOM_CENTER);
        StackPane.setMargin(textBoxImageView, new Insets(0, 0, 50, 0)); // Adjust bottom margin as needed

        // Add Text Box (Text Section)
        Label textBox = new Label("Test Text");
        textBox.setWrapText(true);
        textBox.setStyle("-fx-font-size: 12");
        textBox.setPrefWidth(LoveLoop.WINDOW_WIDTH - 100); // Adjust padding as needed
        textBox.setPrefHeight(textBoxYHeight);
        StackPane.setAlignment(textBox, javafx.geometry.Pos.BOTTOM_CENTER);
        StackPane.setMargin(textBox, new Insets(0, 0, 50, 0)); // Adjust bottom margin as needed

        root.getChildren().addAll(textBoxImageView, textBox);
        return baseScene;
    }
}