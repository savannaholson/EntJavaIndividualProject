package entity;

/**
 * Created by savannaholson on 2/16/16.
 */
public class User {

    private int userId;
    private String username;
    private String password;

    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * Constructor with more params
     *
     * @param userId userId
     * @param username username
     * @param password password
     */
    public User(int userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }




    /**
     * Sets new username.
     *
     * @param username New value of username.
     */
    public void setUsername(String username) {
        this.username = username;
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
     * Sets new userId.
     *
     * @param userId New value of userId.
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Gets username.
     *
     * @return Value of username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets new password.
     *
     * @param password New value of password.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets password.
     *
     * @return Value of password.
     */
    public String getPassword() {
        return password;
    }
}
