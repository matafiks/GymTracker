package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/javafx_ui/mainWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 800);

        stage.setTitle("Gym Tracker");
        stage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/img/dumbbell.png"))));

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
