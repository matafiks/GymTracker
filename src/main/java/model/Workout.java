package model;

import java.util.ArrayList;
import java.util.List;

// Whole workout day (all exercises performed that day)

public class Workout {

    private String name;
    private List<Exercise> exercisesList;

    public Workout(String name) {
        this.name = name;
        this.exercisesList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Exercise> getExercisesList() {
        return exercisesList;
    }

    @Override
    public String toString() {

        return name + "\n" + exercisesList;

//        return "Workout{" +
//                "name='" + name + '\'' +
//                ", exercisesList=" + exercisesList +
//                '}';
    }
}
