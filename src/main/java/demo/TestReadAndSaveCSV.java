package demo;

import entity.Workout;
import repository.ReadWorkoutFromCSV;
import repository.WorkoutRepositoryImpl;

public class TestReadAndSaveCSV {

    private static final WorkoutRepositoryImpl WORKOUT_REPOSITORY_IMPL = new WorkoutRepositoryImpl();

    public static void main(String[] args) {
        // Wczytaj trening z CSV
        ReadWorkoutFromCSV reader = new ReadWorkoutFromCSV();
        Workout workout = reader.readWorkoutFromCSVFileAndReturn();

        if (workout == null) {
            System.out.println("Nie udało się wczytać treningu z pliku CSV.");
            return;
        }

        // Zapisz trening do bazy
        WORKOUT_REPOSITORY_IMPL.save(workout);
    }
}
