package entity;

import javax.persistence.*;

/**
 * Created by savannaholson on 3/10/16.
 *
 * Generated class
 */
@Entity
@Table(name = "user_roles", schema = "BOOK_TRACKER", catalog = "")
@IdClass(UserRolesEntityPK.class)
public class UserRolesEntity {
    private String username;
    private String roleName;

    /**
     * get method for username
     *
     * @return the username
     */
    @Id
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    /**
     * method to set the username
     *
     * @param username the new username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * get the role name
     *
     * @return the role name
     */
    @Id
    @Column(name = "role_name")
    public String getRoleName() {
        return roleName;
    }

    /**
     * set the role name
     *
     * @param roleName the new role name
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * the equals method to be able to compare with other objects
     *
     * @param o an object
     * @return whether or not the object is equal to this object
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRolesEntity that = (UserRolesEntity) o;

        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (roleName != null ? !roleName.equals(that.roleName) : that.roleName != null) return false;

        return true;
    }

    /**
     * This method does something and it was generated.
     *
     * @return Something that someone somewhere will find very interesting.
     */
    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        return result;
    }
}
