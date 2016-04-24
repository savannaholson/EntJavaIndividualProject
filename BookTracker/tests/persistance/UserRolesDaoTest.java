package persistance;

import entity.UserRole;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by savannaholson on 4/24/16.
 */
public class UserRolesDaoTest {

    UserRolesDao dao = new UserRolesDao();

    @Test
    public void testAddUserRoleAndSelectUserRole() {
        UserRole userRole = new UserRole("test", "tester");

        dao.addUserRole(userRole);

        UserRole userRole1 = dao.getUserRolesFor("test").get(0);

        assertTrue(userRole.getUsername().equals(userRole1.getUsername()));

        dao.deleteUserRole(userRole);
    }

    @Test
    public void testDeleteUserRole() {
        UserRole userRole = new UserRole("test", "tester");

        dao.addUserRole(userRole);

        dao.deleteUserRole(userRole);

        ArrayList<UserRole> userRoles = dao.getUserRolesFor("test");

        assertTrue(userRoles.size() == 0);

    }
}