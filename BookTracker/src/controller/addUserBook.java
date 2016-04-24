package controller;

import entity.User;
import entity.UserBook;
import persistance.UserBookDao;
import persistance.UserDao;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 *@author    Savannah Olson
 */
@WebServlet (
        name = "addUserBook",
        urlPatterns = { "/addUserBook" }
)
public class addUserBook extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UserDao userDao = new UserDao();
        UserBookDao userBookDao = new UserBookDao();

        int bookId = Integer.parseInt(request.getParameter("id"));
        double rating = Double.parseDouble(request.getParameter("rating"));
        String comments = request.getParameter("comments");
        String date = request.getParameter("date");

        String username = request.getRemoteUser();
        User user = userDao.getUserByUsername(username);
        int userId = user.getUserId();

        UserBook userBook = new UserBook(userId, bookId, rating, comments, date);

        userBookDao.addUserBook(userBook);


        String url = "/member/viewBooks"; //TODO: make a servlet to allow proper viewing of books
        response.sendRedirect(url);
    }

}
