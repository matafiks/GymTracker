package ui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TextField;

import java.awt.*;
import java.awt.Button;

public class AddWorkoutController {

    @FXML
    private TextField exerciseField;
    @FXML
    private Spinner<Integer> setsSpinner;
    @FXML
    private TextField weightField;
    @FXML
    private TextField repsField;
    @FXML
    private DatePicker workoutDatePicker;
    @FXML
    private ChoiceBox<String> trainingTypeChoiceBox;
    @FXML
    private Button addNewExerciseButton;

    private String[] types = {"PUSH", "PULL", "LEGS"};

    @FXML
    public void initialize() {
        trainingTypeChoiceBox.getItems().addAll(types);
        setsSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10, 3));
    }

    public void handleSaveExercise() {

    }

    public void handleAddNewExercise(ActionEvent actionEvent) {

    }
}
