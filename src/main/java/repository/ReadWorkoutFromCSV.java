package repository;
import entity.Exercise;
import entity.Workout;
import service.WorkoutService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadWorkoutFromCSV {

    // TODO: in future change static paths from resources to chosen by user from GUI
    private static final String pushPath = "src/main/resources/sample_workouts/Workout plan - PUSH B.csv";
    private static final String legsPath = "src/main/resources/sample_workouts/Workout plan - LEGS B.csv";
    private static final String pushPath2 = "src/main/resources/sample_workouts/Workout plan - PUSH A.csv";
    private static final String pullPath = "src/main/resources/sample_workouts/Workout plan - PULL A.csv";

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
                for (int i = 1; i < exercise.length; i+=2) {
                    if (exercise[i] != null) {
                        workoutService.addSetToExercise(exerciseName, exercise[i], exercise[i+1]);
                    }
                }
            }

            System.out.println("Wczytane z pliku ćwiczenie");
            System.out.println(workout);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Workout readWorkoutFromCSVFileAndReturn() {
        try (BufferedReader reader = new BufferedReader(new FileReader(pullPath))) {

            String firstLine = reader.readLine();
            String[] workoutInfo = firstLine.split(",");
            Workout workout = new Workout(workoutInfo[0], workoutInfo[1]);

            reader.readLine();

            String line;

            while ((line = reader.readLine()) != null) {

                String[] exercise = line.split(",");
                Exercise exerciseName = new Exercise(exercise[0]);
                workoutService.addExerciseToWorkout(workout, exerciseName);

                for (int i = 1; i < exercise.length; i+=2) {
                    if (exercise[i] != null) {
                        workoutService.addSetToExercise(exerciseName, exercise[i], exercise[i+1]);
                    }
                }
            }

            return workout;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
