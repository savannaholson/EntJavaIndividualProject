package persistance;

import entity.User;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by savannaholson on 3/10/16.
 */
public class UserDao {

    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * This method adds a user
     *
     * @param user the user to be added
     * @return the user id of the user added
     */
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

    /**
     * This method deletes an user
     *
     * @param user the user to be deleted
     */
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

    /**
     * This method gets a user
     *
     * @param username the username of the user you are trying to get
     * @return the user with the username
     */
    public User getUserByUsername(String username) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        User user = null;

        try {
            tx = session.beginTransaction();

            Query query = session.createQuery("from User where username = :searchTerm");
            query.setParameter("searchTerm", username);
            user = (User) query.list().get(0);


        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } catch (IndexOutOfBoundsException e) {
            log.debug("No user with this username found!");

            return null;
        }finally {
            session.close();
        }


        return user;
    }

}
