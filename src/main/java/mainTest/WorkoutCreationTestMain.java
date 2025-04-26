package mainTest;

import model.Exercise;
import model.Workout;
import service.WorkoutService;

public class WorkoutCreationTestMain {

    public static void main(String[] args) {

        System.out.println("----------Gym tracker----------");

        WorkoutService workoutService = new WorkoutService();

        Workout pushDay = new Workout("Push", "20-04-2025");

        Exercise barbellBenchPress = new Exercise("Barbell Bench Press");
        workoutService.addSetToExercise(barbellBenchPress, 8, 60);
        workoutService.addSetToExercise(barbellBenchPress, 8, 62.5);
        workoutService.addSetToExercise(barbellBenchPress, 8, 62.5);
        workoutService.addSetToExercise(barbellBenchPress, 8, 65);

        Exercise inclineDumbbellPress = new Exercise("Incline Dumbbell Press");
        workoutService.addSetToExercise(inclineDumbbellPress, 8, 20);
        workoutService.addSetToExercise(inclineDumbbellPress, 8, 22.5);
        workoutService.addSetToExercise(inclineDumbbellPress, 8, 22.5);
        workoutService.addSetToExercise(inclineDumbbellPress, 8, 22.5);

        workoutService.addExerciseToWorkout(pushDay, barbellBenchPress);
        workoutService.addExerciseToWorkout(pushDay, inclineDumbbellPress);

        System.out.println(pushDay);


    }
}
