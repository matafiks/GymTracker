package repository;
import model.Exercise;
import model.Workout;
import service.WorkoutService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadWorkoutFromCSV {

    private static final String pushPath = "src/main/resources/Workout plan - PUSH B.csv";
    private static final String legsPath = "src/main/resources/Workout plan - LEGS B.csv";

    WorkoutService workoutService = new WorkoutService();

    public void readWorkoutFromCSVFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(legsPath))) {

            String firstLine = reader.readLine();
            String[] workoutInfo = firstLine.split(",");
            Workout workout = new Workout(workoutInfo[0], workoutInfo[1]);

            reader.readLine();

            String line;

            while ((line = reader.readLine()) != null) {
                String[] exercise = line.split(",");
                Exercise exerciseName = new Exercise(exercise[0]);
                workoutService.addExerciseToWorkout(workout, exerciseName);
                // TODO: zamienić na pętlę tak aby zapobiec występowaniu wyjatku braku setow (niektóre ćwiczenia robię tylko na 3 sety)
                workoutService.addSetToExercise(exerciseName, exercise[1], exercise[2]);
                workoutService.addSetToExercise(exerciseName, exercise[3], exercise[4]);
                workoutService.addSetToExercise(exerciseName, exercise[5], exercise[6]);
                workoutService.addSetToExercise(exerciseName, exercise[7], exercise[8]);
            }

            System.out.println("Wczytane z pliku ćwiczenie");
            System.out.println(workout);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
