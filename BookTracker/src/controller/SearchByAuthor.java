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
@WebServlet(
        name = "searchByAuthor",
        urlPatterns = { "/member/searchByAuthor" }
)
public class SearchByAuthor extends HttpServlet {

    /**
     * This method is called when an http get is preformed on the server. It uses a web service to obtain information
     * about books by the author that was searched.
     *
     * @param request The http request
     * @param response The http response
     * @throws ServletException
     * @throws IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        //TODO: Write code here to fetch things from goodreads

        //TODO: Write code to take response of things 



    }

}
