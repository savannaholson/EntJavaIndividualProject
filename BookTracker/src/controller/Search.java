package controller;

import com.sun.javafx.tools.packager.Log;
import entity.Book;
import persistance.BookDao;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/**
 *@author    Savannah Olson
 */
@WebServlet (
        name = "search",
        urlPatterns = { "/search" }
)
public class Search extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String searchTerm = request.getParameter("searchTerm");
        BookDao bookDao = new BookDao();

        List<Book> books = bookDao.getBooksWithSearchTerm(searchTerm);

        HttpSession session = request.getSession();
        session.setAttribute("books", books);

        String url = "/member/searchResults.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

}