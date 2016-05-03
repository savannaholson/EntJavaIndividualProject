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
        name = "searchResultBook",
        urlPatterns = { "/searchResultBook" }
)
public class SearchResultBook extends HttpServlet {

    /**
     * This method is used to pass information that needs to be loaded on the page
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int bookId = Integer.parseInt(request.getParameter("id"));

        BookDao bookDao = new BookDao();

        Book book = bookDao.getBookById(bookId);

        HttpSession session = request.getSession();
        session.setAttribute("bookTitle", book.getTitle());
        session.setAttribute("bookId", book.getBookId());

        String url = "/member/addUserBook.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);



    }

}
