package persistance;

import entity.User;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by savannaholson on 4/24/16.
 */
public class UserDaoTest {

    UserDao userDao = new UserDao();

    @Test
    public void testAddUser() {

        User user = new User();
        user.setUsername("My Test Person");
        user.setPassword("Not my Password");

        userDao.addUser(user);

        User selectedUser = userDao.getUserByUsername("My Test Person");

        assertTrue(selectedUser.getUsername().equals(user.getUsername()));
        assertTrue(selectedUser.getPassword().equals(user.getPassword()));

        userDao.deleteUser(user);

    }

    @Test
    public void testDeleteUser() {

        User user = new User();
        user.setUsername("test");
        user.setPassword("test");

        userDao.addUser(user);
        userDao.deleteUser(user);

        User user1 = userDao.getUserByUsername("test");

        assertNull(user1);
    }

    @Test
    public void testGetUserByUsername() {
        User user = new User();
        user.setUsername("test");
        user.setPassword("test");

        userDao.addUser(user);

        User user1 = userDao.getUserByUsername("test");

        assertTrue(user1.getUsername().equals(user.getUsername()));

        userDao.deleteUser(user);

    }

}