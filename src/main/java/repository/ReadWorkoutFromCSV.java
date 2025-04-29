package repository;
import model.Exercise;
import model.Workout;
import service.WorkoutService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadWorkoutFromCSV {

    // TODO: in future change static paths from resources to chosen by user from GUI
    private static final String pushPath = "src/main/resources/Workout plan - PUSH B.csv";
    private static final String legsPath = "src/main/resources/Workout plan - LEGS B.csv";
    private static final String pushPath2 = "src/main/resources/Workout plan - PUSH A.csv";

    WorkoutService workoutService = new WorkoutService();

    public void readWorkoutFromCSVFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(pushPath2))) {

            String firstLine = reader.readLine();
            String[] workoutInfo = firstLine.split(",");
            Workout workout = new Workout(workoutInfo[0], workoutInfo[1]);

            reader.readLine();

            String line;

            while ((line = reader.readLine()) != null) {

                String[] exercise = line.split(",");
                Exercise exerciseName = new Exercise(exercise[0]);
                workoutService.addExerciseToWorkout(workout, exerciseName);
                workoutService.addSetToExercise(exerciseName, exercise[1], exercise[2]);
                workoutService.addSetToExercise(exerciseName, exercise[3], exercise[4]);
                workoutService.addSetToExercise(exerciseName, exercise[5], exercise[6]);
                if (exercise.length > 7) {
                    workoutService.addSetToExercise(exerciseName, exercise[7], exercise[8]);
                }
            }

            System.out.println("Wczytane z pliku ćwiczenie");
            System.out.println(workout);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
