package org.flex.color_picker;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
public class Controls {
    @FXML
    private FlowPane BG;
    @FXML
    private Label rgb,hex,hsb;
    @FXML
    private Button rgb_copy,hex_copy,hsb_copy;
    @FXML
    private ColorPicker CCB;
    private String hexValue,rgbValue,hsbValue;
    private Color selectedColor;
    @FXML
    private void changeColor(){
        selectedColor = CCB.getValue();
        rgbValue = String.format("RGB: %d, %d, %d", (int) (selectedColor.getRed() * 255), (int) (selectedColor.getGreen() * 255), (int) (selectedColor.getBlue() * 255));
        hexValue = String.format("#%02X%02X%02X", (int) (selectedColor.getRed() * 255), (int) (selectedColor.getGreen() * 255), (int) (selectedColor.getBlue() * 255));
        float[] hsb_a = java.awt.Color.RGBtoHSB((int) (selectedColor.getRed() * 255), (int) (selectedColor.getGreen() * 255), (int) (selectedColor.getBlue() * 255), null);
        hsbValue = String.format("HSB: %.1f, %.1f, %.1f", hsb_a[0] * 360, hsb_a[1] * 100, hsb_a[2] * 100);

        System.out.println("Color changed to #"+hexValue);
        rgb.setText(rgbValue);
        hex.setText(hexValue);
        hsb.setText(hsbValue);
    }
    @FXML
    private void copyRGB(){
        System.out.println("RGB color copied");
        copy(rgb.getText().substring(5));
    }
    @FXML
    private void copyHEX(){
        System.out.println("HEX color code copied");
        copy(hex.getText().substring(1));
    }
    @FXML
    private void copyHSB(){
        System.out.println("HSB color code copied");
        copy(hsb.getText().substring(5));
    }
    public static void copy(String text) {
        java.awt.datatransfer.StringSelection stringSelection = new java.awt.datatransfer.StringSelection(text);
        java.awt.datatransfer.Clipboard clipboard = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }


}