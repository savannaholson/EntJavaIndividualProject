package persistance;

import com.sun.javafx.tools.packager.Log;
import entity.Book;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by savannaholson on 2/24/16.
 */
public class BookDao {

    private final Logger log = Logger.getLogger(this.getClass());

    public int addBook(Book book) {
        Session session  = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        Integer bookId = null;

        try {
            tx = session.beginTransaction();
            bookId = (Integer) session.save("Book", book);
            tx.commit();
            log.info("Added Book with id " + bookId);
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }

        return bookId;
    }


    public void deleteBook(Book book) {

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

    public List<Book> getBooksWithSearchTerm(String searchTerm) {

        List<Book> books = new ArrayList<Book>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;

        try {

            tx = session.beginTransaction();

            Query query = session.createQuery("from Book where title like :searchTerm");
            query.setParameter("searchTerm", "%" + searchTerm + "%");
            books = query.list();

        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }

        return books;

    }

    public Book getBookById(int id) {

        Book book = null;
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;

        try {

            tx = session.beginTransaction();

            Query query = session.createQuery("from Book where bookId = :searchTerm");
            query.setParameter("searchTerm", id);
            book = (Book) query.list().get(0);

        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }

        return book;

    }

}
