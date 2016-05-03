package controller;

import entity.User;
import entity.UserRole;
import org.hibernate.HibernateException;
import persistance.UserDao;
import persistance.UserRolesDao;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 *@author    Savannah Olson
 */
@WebServlet (
        name = "signup",
        urlPatterns = { "/signup" }
)
public class Signup extends HttpServlet {

    /**
     * This method is called to do the processing to add a new user.
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UserDao userDao = new UserDao();
        UserRolesDao userRolesDao = new UserRolesDao();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User();

        user.setUsername(username);
        user.setPassword(password);

        UserRole userRole = new UserRole();

        userRole.setUsername(username);
        userRole.setRoleName("registered-user");

        userDao.addUser(user);
        userRolesDao.addUserRole(userRole);

        String url = "/member/viewBooks.jsp";
        response.sendRedirect(url);
    }

}
