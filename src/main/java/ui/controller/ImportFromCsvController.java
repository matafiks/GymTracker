package ui.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class ImportFromCsvController {

    @FXML
    private Label filePathLabel;

    public void setFilePathLabel(String path) {
        filePathLabel.setText("Wybrany plik: " + path);
    }
}
