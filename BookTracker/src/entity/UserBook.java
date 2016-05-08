package entity;

import java.io.Serializable;

/**
 * Created by savannaholson on 2/16/16.
 */
public class UserBook implements Serializable {

    private int userBookId;
    private int userId;
    private int bookId;
    private double rating;
    private String comments;
    private String date;



    /**
     * default constructor
     */
    public UserBook() {
    }

    /**
     * constructor with book id and user id
     *
     * @param userId the user id
     * @param bookId the book id
     */
    public UserBook(int userId, int bookId) {
        this.userId = userId;
        this.bookId = bookId;
    }

    /**
     * constructor to set all feilds
     *
     * @param userId the user id
     * @param bookId the book id
     * @param rating the rating
     * @param comments the comments
     * @param date the date
     */
    public UserBook(int userId, int bookId, double rating, String comments, String date) {
        this.userId = userId;
        this.bookId = bookId;
        this.rating = rating;
        this.comments = comments;
        this.date = date;
    }

    /**
     * constructor with user id, book id, and rating
     *
     * @param userId the user  id
     * @param bookId the book id
     * @param rating the rating
     */
    public UserBook(int userId, int bookId, double rating) {
        this.userId = userId;
        this.bookId = bookId;
        this.rating = rating;
    }


    /**
     * Gets rating.
     *
     * @return Value of rating.
     */
    public double getRating() {
        return rating;
    }

    /**
     * Sets new comments.
     *
     * @param comments New value of comments.
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * Gets bookId.
     *
     * @return Value of bookId.
     */
    public int getBookId() {
        return bookId;
    }

    /**
     * Gets comments.
     *
     * @return Value of comments.
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets new date.
     *
     * @param date New value of date.
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Sets new bookId.
     *
     * @param bookId New value of bookId.
     */
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    /**
     * Gets date.
     *
     * @return Value of date.
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets new rating.
     *
     * @param rating New value of rating.
     */
    public void setRating(double rating) {
        this.rating = rating;
    }

    /**
     * Sets new userId.
     *
     * @param userId New value of userId.
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Gets userId.
     *
     * @return Value of userId.
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Gets userBookId.
     *
     * @return Value of userBookId.
     */
    public int getUserBookId() {
        return userBookId;
    }

    /**
     * Sets new userBookId.
     *
     * @param userBookId New value of userBookId.
     */
    public void setUserBookId(int userBookId) {
        this.userBookId = userBookId;
    }
}
