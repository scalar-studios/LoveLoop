package dev.lemonjuice.loveloop.scene.week.day.monday;

import dev.lemonjuice.loveloop.scene.week.builder.SceneBuilder;
import javafx.scene.Scene;

public class MondayScenes {

    public static Scene loadMondayScene() {
        // Character References - May need to be their own file
        String aya = "src/main/resources/dev/lemonjuice/loveloop/image/character/aya.png";
        String kaida = "src/main/resources/dev/lemonjuice/loveloop/image/character/kaida.png";
        String lucille = "src/main/resources/dev/lemonjuice/loveloop/image/character/lucille.png";
        String ohta = "src/main/resources/dev/lemonjuice/loveloop/image/character/ohta.png";

        String[] leftCharacter = {null, null};
        String[] centerCharacter = {lucille, lucille};
        String[] rightCharacter = {null, null};

        String[] text = {"Test 1", "Test 2"};
        String[] name = {"Lucille", "Lucille"};

        return SceneBuilder.buildScene("src/main/resources/dev/lemonjuice/loveloop/image/background/player_bedroom.png",
                leftCharacter, centerCharacter, rightCharacter, text, name);
    }
}
