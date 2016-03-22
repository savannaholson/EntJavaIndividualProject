package entity;

/**
 * Created by savannaholson on 2/16/16.
 */
public class Book {

    private int bookId;
    private String author;
    private String title;

    public Book() {
    }

    public Book(int bookId, String author, String title) {
        this.bookId = bookId;
        this.author = author;
        this.title = title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
