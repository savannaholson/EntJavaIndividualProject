package controller;

import entity.Book;
import persistance.BookDao;
import org.hibernate.HibernateException;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 *@author    Savannah Olson
 */
@WebServlet (
        name = "addBook",
        urlPatterns = { "/addBook" }
)
public class addBook extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        BookDao bookDao = new BookDao();

        String title = request.getParameter("title");
        String author = request.getParameter("author");

        Book myBook = new Book();
        myBook.setAuthor(author);
        myBook.setTitle(title);

        bookDao.addBook(myBook);

        String url = "/member/addBook.jsp";
        response.sendRedirect(url);
    }

}
