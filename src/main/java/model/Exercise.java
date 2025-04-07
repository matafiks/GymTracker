package model;

import java.util.ArrayList;
import java.util.List;

// Name of exercise and all sets performed

public class Exercise {

    private String name;
    private List<SetEntry> sets;

    public Exercise(String name) {
        this.name = name;
        this.sets = new ArrayList<>();
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
