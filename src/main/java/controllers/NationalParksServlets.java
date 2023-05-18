package controllers;

import models.NationalParks;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "NationalParks", urlPatterns = "/parks")
public class NationalParksServlets extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        NationalParks n1 = new NationalParks(1L, "Park One", "Texas", LocalDate.parse("1958-02-26"), "Fake Nat Park 1");
        NationalParks n2 = new NationalParks(2L, "Park Two", "California", LocalDate.parse("1988-08-15"), "Fake Nat Park 2");
        NationalParks n3 = new NationalParks(3L, "Park Three", "Colorado", LocalDate.parse("1944-04-05"), "Fake Nat Park 3");
        NationalParks n4 = new NationalParks(4L, "Park Four", "Florida", LocalDate.parse("1977-11-07"), "Fake Nat Park 4");

        List<NationalParks> nationalParks = new ArrayList<>();

        nationalParks.add(n1);
        nationalParks.add(n2);
        nationalParks.add(n3);
        nationalParks.add(n4);

        req.setAttribute("park", nationalParks);
        req.getRequestDispatcher("/profile.jsp").forward(req, resp);




    }
}
