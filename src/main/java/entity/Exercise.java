package entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

// Name of exercise and all sets performed

@Entity
@Table(name = "exercise")
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="exercise_name")
    private String exerciseName;

    @OneToMany(mappedBy = "exercise", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SingleSet> sets = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "workout_id")
    private Workout workout;

    public Exercise() {
    }

    public Exercise(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSets(List<SingleSet> sets) {
        this.sets = sets;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public List<SingleSet> getSets() {
        return sets;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", exerciseName='" + exerciseName + '\'' +
                ", sets=" + sets +
                '}';
    }
}
