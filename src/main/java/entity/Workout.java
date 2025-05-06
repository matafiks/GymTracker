package entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

// Entity class for Workout (combined of exercises and sets performed on a certain day)

@Entity
@Table(name="workout")
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="workout_type")
    private String workoutType;

    @Column(name = "date")
    private LocalDate date;

    @OneToMany(mappedBy = "workout", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Exercise> exercisesList;

    public Workout() {
    }

    public Workout(String workoutType, String date) {
        this.workoutType = workoutType;
        // used a dtf to ensure proper date formatting for database storage
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.date = LocalDate.parse(date, formatter);
        this.exercisesList = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorkoutType() {
        return workoutType;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Exercise> getExercisesList() {
        return exercisesList;
    }

    @Override
    public String toString() {
        return "Workout{" +
                "id=" + id +
                ", name='" + workoutType + '\'' +
                ", date=" + date +
                ", exercisesList=" + exercisesList +
                '}';
    }
}
