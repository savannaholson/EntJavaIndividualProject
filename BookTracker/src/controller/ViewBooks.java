package controller;

import entity.Book;
import entity.User;
import entity.UserBook;
import persistance.BookDao;
import persistance.UserBookDao;
import persistance.UserDao;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
/**
 *@author    Savannah Olson
 */
@WebServlet (
        name = "viewBooks",
        urlPatterns = { "/member/viewBooks" }
)
public class ViewBooks extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UserDao userDao = new UserDao();
        UserBookDao userBookDao = new UserBookDao();
        BookDao bookDao = new BookDao();

        String username = request.getRemoteUser();
        User user = userDao.getUserByUsername(username);

        ArrayList<UserBook> userBooks = userBookDao.getBooksForUser(user);

        //TODO: Finish code to display books based on user

        ArrayList<Book> books = new ArrayList<Book>();

        for (UserBook userBook : userBooks) {
            Book book = bookDao.getBookById(userBook.getBookId());

            books.add(book);
        }

        HttpSession session = request.getSession();

        session.setAttribute("books", books);
        session.setAttribute("userBooks", userBooks);

        String url = "/member/viewBooks.jsp";
        response.sendRedirect(url);
    }

}
