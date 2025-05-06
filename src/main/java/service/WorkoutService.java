package service;

import entity.Exercise;
import entity.SingleSet;
import entity.Workout;

public class WorkoutService {

    // add new set to exercise with reps and weight
    public void addSetToExercise(Exercise exercise, int reps, double weight) {
        SingleSet set = new SingleSet(reps, weight);
        set.setExercise(exercise);
        exercise.getSets().add(set);
    }

    // add new set to exercise with reps and weight
    // (used for reading from .csv purposes since all data has to be converted from String)
    public void addSetToExercise(Exercise exercise, String repsString, String weightString) {
        int reps = Integer.parseInt(repsString);
        double weight = Double.parseDouble(weightString);
//        exercise.getSets().add(new SingleSet(reps, weight));
        addSetToExercise(exercise, reps, weight);
    }

    // add new exercise to workout
    public void addExerciseToWorkout(Workout workout, Exercise exercise) {
        exercise.setWorkout(workout);
        workout.getExercisesList().add(exercise);
    }

}
