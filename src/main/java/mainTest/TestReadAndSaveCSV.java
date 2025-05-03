package mainTest;

import entity.Workout;
import org.hibernate.Session;
import org.hibernate.Transaction;
import repository.ReadWorkoutFromCSV;
import util.HibernateUtil;

public class TestReadAndSaveCSV {

    public static void main(String[] args) {
        // Wczytaj trening z CSV
        ReadWorkoutFromCSV reader = new ReadWorkoutFromCSV();
        Workout workout = reader.readWorkoutFromCSVFileAndReturn();

        if (workout == null) {
            System.out.println("Nie udało się wczytać treningu z pliku CSV.");
            return;
        }

        // TODO: to jest tylko klasa testowa, potem utworzyć całą klasę do połączeń z bazą danych (WorkoutRepository)

        // Zapisz trening do bazy
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            session.persist(workout);

            transaction.commit();
            System.out.println("Zapisano trening do bazy:");
            System.out.println(workout);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
