package repository;

import entity.Workout;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class WorkoutRepositoryImpl implements WorkoutRepository{

    public void save(Workout workout) {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();

            session.persist(workout);

            tx.commit();
            System.out.println("Successfully saved workout to the database with id: " + workout.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
