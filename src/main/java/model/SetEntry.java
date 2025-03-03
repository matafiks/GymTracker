package model;

// Class containing data related to single set of certain Exercise

public class SetEntry {

    private double weight;
    private int reps;

    public SetEntry(double weight, int reps) {
        this.weight = weight;
        this.reps = reps;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    @Override
    public String toString() {

        return weight + " x " + reps;

//        return "SetEntry{" +
//                "weight=" + weight +
//                ", reps=" + reps +
//                '}';
    }
}
