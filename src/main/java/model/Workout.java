package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

// Whole workout day (all exercises performed that day)

public class Workout {

    private String name;

    private LocalDate date;

    private List<Exercise> exercisesList;

    public Workout(String name, String date) {
        this.name = name;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.date = LocalDate.parse(date, formatter);
        this.exercisesList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Exercise> getExercisesList() {
        return exercisesList;
    }

    @Override
    public String toString() {

        return name + " " + date + "\n" + exercisesList;

//        return "Workout{" +
//                "name='" + name + '\'' +
//                ", exercisesList=" + exercisesList +
//                '}';
    }
}
