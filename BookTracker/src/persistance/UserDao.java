package persistance;

import entity.User;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by savannaholson on 3/10/16.
 */
public class UserDao {

    private final Logger log = Logger.getLogger(this.getClass());


    public int addUser(User user) {
        Session session  = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        Integer userId = null;

        try {
            tx = session.beginTransaction();
            userId = (Integer) session.save("User", user);
            tx.commit();
            log.info("Added User with id " + userId);
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }

        return userId;
    }


    public void deleteUser(User user) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            session.delete(user);

            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }

    }

}
