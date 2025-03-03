import model.Exercise;
import model.Workout;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------Gym tracker----------");

        Workout pushDay = new Workout("Push");

        Exercise barbellBenchPress = new Exercise("Barbell Bench Press");
        barbellBenchPress.addSet(50.0, 8);
        barbellBenchPress.addSet(55.0, 8);
        barbellBenchPress.addSet(60.0, 8);
        barbellBenchPress.addSet(62.5, 9);

        Exercise inclineDumbbellPress = new Exercise("Incline Dumbbell Press");
        inclineDumbbellPress.addSet(20.0, 8);
        inclineDumbbellPress.addSet(20.0, 8);
        inclineDumbbellPress.addSet(20.0, 8);
        inclineDumbbellPress.addSet(20.0, 8);

        Exercise machineShoulderPress = new Exercise("Machine Shoulder Press");
        machineShoulderPress.addSet(12.5, 8);
        machineShoulderPress.addSet(12.5, 8);
        machineShoulderPress.addSet(12.5, 8);
        machineShoulderPress.addSet(15.0, 8);

        pushDay.addExercise(barbellBenchPress);
        pushDay.addExercise(inclineDumbbellPress);
        pushDay.addExercise(machineShoulderPress);

        System.out.println(pushDay);
    }
}
