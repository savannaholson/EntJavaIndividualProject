package controller;

import entity.UserBook;

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

        int bookId = Integer.parseInt(request.getParameter("id"));
        double rating = Double.parseDouble(request.getParameter("rating"));
        String comments = request.getParameter("comments");
        String date = request.getParameter("date");

        UserBook userBook = new UserBook(bookId);

        String url = "/member/viewBooks.jsp";
        response.sendRedirect(url);
    }

}
