package mainTest;

import entity.Exercise;
import entity.SingleSet;
import entity.Workout;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class TestHibernate {

    public static void main(String[] args) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();

            // tworzenie treningu
            Workout workout = new Workout("Push Day", "03-05-2025");

            // tworzenie ćwiczenia
            Exercise exercise = new Exercise("Bench Press");
            exercise.setWorkout(workout); // powiązanie ćwiczenia z treningiem
            workout.getExercisesList().add(exercise);

            // tworzenie setów
            SingleSet set1 = new SingleSet(10, 60);
            set1.setExercise(exercise);
            exercise.getSets().add(set1);

            SingleSet set2 = new SingleSet(8, 70);
            set2.setExercise(exercise);
            exercise.getSets().add(set2);

            // zapis do bazy
            session.persist(workout);

            tx.commit();
            System.out.println("Zapisano trening do bazy.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
