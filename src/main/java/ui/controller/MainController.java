package ui.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;

public class MainController {

    @FXML
    private Button addWorkoutButton;
    @FXML
    private GridPane mainContent;
    @FXML
    private Button importWorkoutButton;
    @FXML
    private Button personalBestsButton;
    @FXML
    private Button progressGraphsButton;
    @FXML
    private Button mainPageButton;

    @FXML
    public void initialize() {
        loadView("/javafx_ui/dashboard.fxml");
        importWorkoutButton.setOnAction(e -> handleImportWorkout());
        personalBestsButton.setOnAction(e -> loadView("/javafx_ui/personal_best.fxml"));
        addWorkoutButton.setOnAction(e -> loadView("/javafx_ui/add_workout.fxml"));
        progressGraphsButton.setOnAction(e -> loadView("/javafx_ui/progress_graphs.fxml"));
        mainPageButton.setOnAction(e -> loadView("/javafx_ui/dashboard.fxml"));
    }

    private void loadView(String fxmlPath) {
        try {
            Parent view = FXMLLoader.load(getClass().getResource(fxmlPath));
            mainContent.getChildren().setAll(view);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void handleImportWorkout() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Wybierz plik CSV");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("pliki CSV", "*csv"));

        File selectedFile = fileChooser.showOpenDialog(mainContent.getScene().getWindow());

        if (selectedFile != null) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/javafx_ui/import_workout_from_csv.fxml"));
                Parent view = loader.load();

                ImportFromCsvController controller = loader.getController();
                controller.setFilePathLabel(selectedFile.getAbsolutePath());

                mainContent.getChildren().setAll(view);

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
