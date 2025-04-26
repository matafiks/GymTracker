package model;

// Data related to single set of certain Exercise

public class SingleSet {

    private double weight;
    private int reps;

    public SingleSet(int reps, double weight) {
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

        return reps + " x " + weight;

//        return "SetEntry{" +
//                "weight=" + weight +
//                ", reps=" + reps +
//                '}';
    }
}
