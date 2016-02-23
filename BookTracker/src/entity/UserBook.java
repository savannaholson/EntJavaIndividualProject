package entity;

/**
 * Created by savannaholson on 2/16/16.
 */
public class UserBook {

    private int userId;
    private int bookId;
    private double rating;
    private String comments;
    private String date;

    public UserBook() {
    }

    public UserBook(int userId, int bookId) {
        this.userId = userId;
        this.bookId = bookId;
    }

    public UserBook(int userId, int bookId, double rating, String comments, String date) {
        this.userId = userId;
        this.bookId = bookId;
        this.rating = rating;
        this.comments = comments;
        this.date = date;
    }

    public UserBook(int userId, int bookId, double rating) {
        this.userId = userId;
        this.bookId = bookId;
        this.rating = rating;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
