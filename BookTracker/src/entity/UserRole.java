package entity;

/**
 * Created by savannaholson on 3/10/16.
 */
public class UserRole {

    private String username;
    private String roleName;

    public UserRole(String username, String roleName) {
        this.username = username;
        this.roleName = roleName;
    }

    public UserRole() {
        username = "";
        roleName = "";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
