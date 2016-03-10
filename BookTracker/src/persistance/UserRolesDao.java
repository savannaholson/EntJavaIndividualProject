package persistance;

import entity.UserRole;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by savannaholson on 3/10/16.
 */
public class UserRolesDao {

    private final Logger log = Logger.getLogger(this.getClass());

    public void addUserRole(UserRole userRole) {
        Session session  = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save("UserRole", userRole);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }
    }

}
