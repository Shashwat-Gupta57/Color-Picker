package org.flex.color_picker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Color_Picker extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Color_Picker.class.getResource("design.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setResizable(false);
        stage.setTitle("Color Picker");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        javafx.scene.control.ColorPicker cp = new javafx.scene.control.ColorPicker(Color.BLACK);


        launch();
    }
}