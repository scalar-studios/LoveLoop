module dev.lemonjuice.loveloop {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens dev.lemonjuice.loveloop to javafx.fxml;
    exports dev.lemonjuice.loveloop;
}