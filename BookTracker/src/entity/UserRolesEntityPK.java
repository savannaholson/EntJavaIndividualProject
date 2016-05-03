package entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by savannaholson on 3/10/16.
 *
 * generated class
 */
public class UserRolesEntityPK implements Serializable {
    private String username;
    private String roleName;

    /**
     * get method for username
     *
     * @return the username
     */
    @Column(name = "username")
    @Id
    public String getUsername() {
        return username;
    }

    /**
     * set method for the username
     *
     * @param username the new username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * get method for the role name
     *
     * @return the role name
     */
    @Column(name = "role_name")
    @Id
    public String getRoleName() {
        return roleName;
    }

    /**
     * set method for the role name
     *
     * @param roleName the role name
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * method to compare this object to other objects
     *
     * @param o the object to be compared
     * @return the result of the comparison.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRolesEntityPK that = (UserRolesEntityPK) o;

        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (roleName != null ? !roleName.equals(that.roleName) : that.roleName != null) return false;

        return true;
    }

    /***
     * This might be interesting
     *
     * @return something cool. It is an int.
     */
    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        return result;
    }
}
