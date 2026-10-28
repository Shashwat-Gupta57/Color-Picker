module org.flex.color_picker {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires java.desktop;

    opens org.flex.color_picker to javafx.fxml;
    exports org.flex.color_picker;
}