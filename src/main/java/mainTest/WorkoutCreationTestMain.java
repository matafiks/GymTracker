package mainTest;

import model.Exercise;
import model.Workout;
import service.WorkoutService;

public class WorkoutCreationTestMain {

    public static void main(String[] args) {

        System.out.println("----------Gym tracker----------");

        WorkoutService workoutService = new WorkoutService();

        Workout pushDay = new Workout("Push");

        Exercise barbellBenchPress = new Exercise("Barbell Bench Press");
        workoutService.addSetToExercise(barbellBenchPress, 60, 8);
        workoutService.addSetToExercise(barbellBenchPress, 62.5, 8);
        workoutService.addSetToExercise(barbellBenchPress, 62.5, 8);
        workoutService.addSetToExercise(barbellBenchPress, 65, 8);

        Exercise inclineDumbbellPress = new Exercise("Incline Dumbbell Press");
        workoutService.addSetToExercise(inclineDumbbellPress, 20, 8);
        workoutService.addSetToExercise(inclineDumbbellPress, 22.5, 8);
        workoutService.addSetToExercise(inclineDumbbellPress, 22.5, 8);
        workoutService.addSetToExercise(inclineDumbbellPress, 22.5, 8);

        workoutService.addExerciseToWorkout(pushDay, barbellBenchPress);
        workoutService.addExerciseToWorkout(pushDay, inclineDumbbellPress);

        System.out.println(pushDay);


    }
}
