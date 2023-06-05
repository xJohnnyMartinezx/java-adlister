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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.codeup.adlister.util.Password.isValidPassword;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String passwordConfirmation = request.getParameter("confirm_password");

        // validate input
        boolean inputHasErrors = username.isEmpty()
            || email.isEmpty()
            || password.isEmpty()
            || (!password.equals(passwordConfirmation));


//        USING isValidPassword() METHOD IMPORTED FORM Password CLASS AND PASSING IN OUR password VAR FROM ABOVE
        if (isValidPassword(password)){
//            inputHasErrors IS TRUE
//            THEN REDIRECT BACK TO THE REGISTER PAGE.
            if (inputHasErrors) {
                System.out.println("Registration Unsuccessful: One or more values are empty!");
                response.sendRedirect("/register");
                return;
            }
//            IF PASSWORD MEETS CRITERIA THEN
//            HASH IT, CREATE A NEW USER, AND REDIRECT TO LOGIN.
            System.out.println("password is valid");
            String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
            // create and save a new user
            User user = new User(username, email, hashedPassword);
            DaoFactory.getUsersDao().insert(user);
            response.sendRedirect("/login");
            System.out.println("Successful user registration");
        }else {
//            IF PASSWORD DOES NOT MEET THE CRITERIA.
            System.out.println("pw not valid");

        }


    }
}
