package model;

import java.util.ArrayList;
import java.util.List;

// Class containing a name of exercise and all sets performed

public class Exercise {

    private String name;
    private List<SetEntry> sets;

    public Exercise(String name) {
        this.name = name;
        this.sets = new ArrayList<>();
    }

    public void addSet(double weight, int reps) {

        this.sets.add(new SetEntry(weight, reps));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SetEntry> getSets() {
        return sets;
    }

    @Override
    public String toString() {

        return name + ": " + sets;

//        return "Exercise{" +
//                "name='" + name + '\'' +
//                ", sets=" + sets +
//                '}';
    }
}
