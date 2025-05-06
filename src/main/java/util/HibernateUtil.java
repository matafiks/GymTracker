package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
            // Reads configuration from hibernate.cfg.xml from resources/
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Exception ex) {
            throw new ExceptionInInitializerError("Error creating SessionFactory: " + ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
