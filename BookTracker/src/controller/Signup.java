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

        if (userDao.getUserByUsername(username) != null) {

            request.setAttribute("errorMessage", "You must have a unique username!");


            String url = "/signup.jsp";

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);

        }

        User user = new User();

        user.setUsername(username);
        user.setPassword(password);

        UserRole userRole = new UserRole();

        userRole.setUsername(username);
        userRole.setRoleName("registered-user");

        userDao.addUser(user);
        userRolesDao.addUserRole(userRole);

        String url = "member/memberHome.jsp";
        response.sendRedirect(url);
    }

}
