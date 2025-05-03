package service;

import entity.Exercise;
import entity.SingleSet;
import entity.Workout;

public class WorkoutService {

    public void addSetToExercise(Exercise exercise, int reps, double weight) {
        SingleSet set = new SingleSet(reps, weight);
        set.setExercise(exercise);
        exercise.getSets().add(set);
    }

    public void addSetToExercise(Exercise exercise, String repsString, String weightString) {
        int reps = Integer.parseInt(repsString);
        double weight = Double.parseDouble(weightString);
//        exercise.getSets().add(new SingleSet(reps, weight));
        addSetToExercise(exercise, reps, weight);
    }

    public void addExerciseToWorkout(Workout workout, Exercise exercise) {
        exercise.setWorkout(workout);
        workout.getExercisesList().add(exercise);
    }

}
