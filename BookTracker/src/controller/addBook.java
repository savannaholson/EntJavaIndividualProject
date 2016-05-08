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
        urlPatterns = { "/member/addBook" }
)
public class addBook extends HttpServlet {

    /**
     * This method will run when someone sends a post request to this servlet
     *
     * This method adds a book with the title and author stored in the request
     *
     * @param request the http request object
     * @param response the http response object
     * @throws ServletException
     * @throws IOException
     */
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
