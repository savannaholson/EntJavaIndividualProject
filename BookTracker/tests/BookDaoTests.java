import entity.Book;
import org.junit.Test;
import persistance.BookDao;
import static org.junit.Assert.*;
/**
 * Created by savannaholson on 3/8/16.
 */
public class BookDaoTests {

    BookDao bookDao = new BookDao();

    @Test
    public void testAddBook() {
        Book book = new Book("Testing", "Savannah Elizabeth Olson");

        int bookId = bookDao.addBook(book);

        assertTrue(bookId > 1);

    }

}
