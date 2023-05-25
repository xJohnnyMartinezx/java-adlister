package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // TODO: find a record in your database that matches the submitted password
        // TODO: make sure we find a user with that username
        // TODO: check the submitted password against what you have in your database
        boolean validAttempt = false;


        User userSearch = DaoFactory.getUsersDao().findByUsername(username);
        String hashedPassword = userSearch.getPassword();

        boolean passwordsMatch = BCrypt.checkpw(password, hashedPassword);

        if (passwordsMatch) {
                validAttempt = true;
            System.out.println("Successful user login");
        }else {
            System.out.println("No user found or password mismatch");
            response.sendRedirect("/login");
        }

        if (validAttempt) {
            // TODO: store the logged in user object in the session, instead of just the username
            request.getSession().setAttribute("user", userSearch);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
}