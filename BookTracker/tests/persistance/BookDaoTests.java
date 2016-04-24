package persistance;

import entity.Book;
import org.junit.Test;
import persistance.BookDao;

import java.util.List;

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

        bookDao.deleteBook(book);

    }


    @Test
    public void testGetBooksWithSearchTerm() {
        Book book = new Book("Testing123", "Savannah Elizabeth Olson");

        int bookId = bookDao.addBook(book);

        List<Book> books = bookDao.getBooksWithSearchTerm("Testing123");

        assertTrue(books.get(0).getTitle().equals("Testing123"));

        bookDao.deleteBook(book);

    }

    @Test
    public void testDeleteBook() {

        Book book = new Book("TestDelete", "Delete");

        bookDao.addBook(book);

        bookDao.deleteBook(book);

        List<Book> books = bookDao.getBooksWithSearchTerm("TestDelete");

        assertTrue(books.size() < 1);

    }

    @Test
    public void testGetBookById() {

        Book book = new Book("bookbyid", "random");

        int id = bookDao.addBook(book);

        Book secondBook = bookDao.getBookById(id);

        assertEquals(book.getTitle(), secondBook.getTitle());

        bookDao.deleteBook(book);

    }



}
