package entity;

/**
 * Created by savannaholson on 3/10/16.
 */
public class UserRole {

    private String username;
    private String roleName;

    /**
     * constructor to set all values
     *
     * @param username the username
     * @param roleName the rolename
     */
    public UserRole(String username, String roleName) {
        this.username = username;
        this.roleName = roleName;
    }

    /**
     * default empty constructor
     */
    public UserRole() {
        username = "";
        roleName = "";
    }


    /**
     * Gets roleName.
     *
     * @return Value of roleName.
     */
    public String getRoleName() {
        return roleName;
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
     * Sets new roleName.
     *
     * @param roleName New value of roleName.
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * Gets username.
     *
     * @return Value of username.
     */
    public String getUsername() {
        return username;
    }
}
