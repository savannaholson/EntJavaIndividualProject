package persistance;

import entity.UserRole;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

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

    public void deleteUserRole(UserRole userRole) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.delete(userRole);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }

    }

    public ArrayList<UserRole> getUserRolesFor(String userName) {
        ArrayList<UserRole> userRoles = new ArrayList<UserRole>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();


        Query query = session.createQuery("from UserRole where username = :searchTerm");
        query.setParameter("searchTerm", userName);

        userRoles = (ArrayList<UserRole>) query.list();

        session.close();

        return userRoles;
    }

}
