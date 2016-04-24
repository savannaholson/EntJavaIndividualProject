package persistance;

import entity.Book;
import entity.User;
import entity.UserBook;
import org.junit.Test;
import persistance.BookDao;
import persistance.UserBookDao;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

/**
 * Created by savannaholson on 3/19/16.
 */
public class UserBookDaoTests {

    UserBookDao userBookDao = new UserBookDao();

    @Test
    public void testAddUserBook() {

        UserBook userBook = new UserBook(1, 6, 5.0, "Test add", "01012015");

        userBookDao.addUserBook(userBook);

        User user = new User();
        user.setUserId(1);

        ArrayList<UserBook> userBooks = userBookDao.getBooksForUser(user);

        assertTrue(userBooks.size() > 0);

        userBookDao.deleteUserBook(userBook);

    }

    @Test
    public void testDeleteUserBook() {
        UserBook userBook = new UserBook(1, 1, 0.0, "Test delete", "01012015");

        userBookDao.addUserBook(userBook);

        userBookDao.deleteUserBook(userBook);

        User user = new User();
        user.setUserId(1);

        ArrayList<UserBook> userBooks = userBookDao.getBooksForUser(user);

        assertTrue(userBooks.size() == 0);
    }

    @Test
    public void testGetBooksForUser() {

        UserBook userBook = new UserBook(1, 1, 0.0, "Test get books", "01012015");

        userBookDao.addUserBook(userBook);

        UserBook userBook2 = new UserBook(2, 1, 0.0, "Test get books", "01012015");

        userBookDao.addUserBook(userBook2);

        User user = new User();
        user.setUserId(1);

        ArrayList<UserBook> userBooks = userBookDao.getBooksForUser(user);

        assertTrue(userBooks.size() == 1);

        userBookDao.deleteUserBook(userBook);
        userBookDao.deleteUserBook(userBook2);
    }


}
