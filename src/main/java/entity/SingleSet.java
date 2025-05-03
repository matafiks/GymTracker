package entity;

// Data related to single set of certain Exercise

import jakarta.persistence.*;

@Entity
@Table(name = "single_set")
public class SingleSet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "weight")
    private double weight;

    @Column(name = "reps")
    private int reps;

    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;

    public SingleSet() {
    }

    public SingleSet(int reps, double weight) {
        this.weight = weight;
        this.reps = reps;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SingleSet{" +
                "id=" + id +
                ", weight=" + weight +
                ", reps=" + reps +
                '}';
    }
}
