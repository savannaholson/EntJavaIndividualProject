package entity;

/**
 * Created by savannaholson on 2/16/16.
 */
public class Book {

    private int bookId;
    private String author;
    private String title;

    /**
     * This is the default, zero param, constructor
     */
    public Book() {
    }

    /**
     * This constructor takes the bookId, the author name, and the title
     *
     * @param bookId the book id
     * @param author the author's name
     * @param title the title of the book
     */
    public Book(int bookId, String author, String title) {
        this.bookId = bookId;
        this.author = author;
        this.title = title;
    }

    /**
     * This constructor takes a title and an author
     *
     * @param title the title of the book
     * @param author the author of the book
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * This is the getter method to get the book id
     *
     * @return the id of the book
     */
    public int getBookId() {
        return bookId;
    }

    /**
     * Use this method to set the book id
     *
     * @param bookId the book id
     */
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    /**
     * Use this method to get the author
     *
     * @return the author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method sets the author of the book
     *
     * @param author the author of the book
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Use this method to get the title of the book
     *
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * this method sets the title of the book
     *
     * @param title the new title of the book
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method represents the object as a string
     *
     * @return  A string representation of the object
     */
    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
