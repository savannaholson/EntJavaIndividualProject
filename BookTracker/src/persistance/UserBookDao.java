package persistance;

import entity.User;
import entity.UserBook;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

/**
 * Created by savannaholson on 3/19/16.
 */
public class UserBookDao {

    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * This method adds a user book
     *
     * @param userBook the user book to be added
     */
    public void addUserBook(UserBook userBook) {
        Session session  = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save("UserBook", userBook);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }
    }

    /**
     * This method deletes an user book
     *
     * @param book the user book to be deleted
     */
    public void deleteUserBook(UserBook book) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;

        try {

            tx = session.beginTransaction();

            session.delete(book);

            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }

    }

    /**
     * This method gets user books based on a user
     *
     * @param user the user who's books you are obtaining
     * @return an array list of user books for the user
     */
    public ArrayList<UserBook> getBooksForUser(User user) {

        ArrayList<UserBook> books = new ArrayList<UserBook>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();


        Query query = session.createQuery("from UserBook where userId = :searchTerm order by userBookId");
        query.setParameter("searchTerm", user.getUserId());

        books = (ArrayList<UserBook>) query.list();

        session.close();

        return books;

    }



}
