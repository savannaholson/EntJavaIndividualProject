import entity.Book;
import entity.UserBook;
import org.junit.Test;
import persistance.BookDao;
import persistance.UserBookDao;

import static org.junit.Assert.assertTrue;

/**
 * Created by savannaholson on 3/19/16.
 */
public class UserBookDaoTests {

    UserBookDao userBookDao = new UserBookDao();

    @Test
    public void testAddBook() {

        UserBook userBook = new UserBook(1, 1, 5.0, "Test Comment", "01012015");

        userBookDao.addUserBook(userBook);

    }

}
