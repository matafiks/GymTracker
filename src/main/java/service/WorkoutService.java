package service;

import model.Exercise;
import model.SingleSet;
import model.Workout;

public class WorkoutService {

    public void addSetToExercise(Exercise exercise, int reps, double weight) {
        exercise.getSets().add(new SingleSet(reps, weight));
    }

    public void addSetToExercise(Exercise exercise, String repsString, String weightString) {
        int reps = Integer.parseInt(repsString);
        double weight = Double.parseDouble(weightString);
        exercise.getSets().add(new SingleSet(reps, weight));

    }

    public void addExerciseToWorkout(Workout workout, Exercise exercise) {
        workout.getExercisesList().add(exercise);
    }

}
