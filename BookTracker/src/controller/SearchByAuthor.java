package controller;

import bookwormsEntities.BookType;
import bookwormsEntities.BooksType;
import bookwormsEntities.GoodreadsResponseType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
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

    private final Logger log = Logger.getLogger(this.getClass());

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

        //Get from bookworms

        String jsonFromBookworms = getBookFromBookwormsByAuthor(firstName, lastName);


        //Validation
        if (jsonFromBookworms.length() < 1) {
            String url = "/member/booksByAuthor.jsp";

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);

        }

        ObjectMapper objectMapper = new ObjectMapper();

        GoodreadsResponseType object = new GoodreadsResponseType();

        object = objectMapper.readValue(jsonFromBookworms, GoodreadsResponseType.class);

        BooksType books = new BooksType();
         try {
             books = object.getAuthor().getBooks();
         } catch (NullPointerException ex) {
             String url = "/member/booksByAuthor.jsp";

             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
             dispatcher.forward(request, response);
         }

        //TODO: Write code to take response of things

        HttpSession session = request.getSession();
        session.setAttribute("books", books);

        String url = "/member/booksByAuthor.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);


    }

    /**
     * This method is used to retrieve a string of json representing an author
     *
     * @param firstName This is the first name of the author
     * @param lastName This is the last name of the author
     *
     * @return a string of json representing the books of the author
     */
    public String getBookFromBookwormsByAuthor(String firstName, String lastName) {

        URL bookwormsURL = null;

        try {

            bookwormsURL = new URL("http://tomcat2-savannaholson.rhcloud.com/webService%5Fwar/webService/" + firstName + "/" + lastName);

        } catch (MalformedURLException ex) {
            log.error(ex);

            return "";
        }

        InputStream input = null;
        BufferedReader reader = null;
        String bookwormsJSON = "";


        try {
            input =  bookwormsURL.openStream();
            reader = new BufferedReader(new InputStreamReader(input));

            String line = null;


            while ((line = reader.readLine()) != null) {
                bookwormsJSON += line;

            }

        } catch (IOException ex) {
            log.error(ex);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                log.error(e);
            }
        }

        return bookwormsJSON;

    }

}
