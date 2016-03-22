package persistance;

import entity.UserBook;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by savannaholson on 3/19/16.
 */
public class UserBookDao {

    private final Logger log = Logger.getLogger(this.getClass());

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

}
