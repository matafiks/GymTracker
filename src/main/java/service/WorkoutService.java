package service;

import model.Exercise;
import model.SetEntry;
import model.Workout;

public class WorkoutService {

    public void addSetToExercise(Exercise exercise, double weight, int reps) {
        exercise.getSets().add(new SetEntry(weight, reps));
    }

    public void addExerciseToWorkout(Workout workout, Exercise exercise) {
        workout.getExercisesList().add(exercise);
    }

}
