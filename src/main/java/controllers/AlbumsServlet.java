package controllers;

import models.Albums;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AlbumsServlet", urlPatterns = "/albums")
public class AlbumsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Albums album1 = new Albums(1L, "TestArtist", "TestRecord", 2023, 20.50, "testGenre");

        List<Albums> albums = new ArrayList<>();

        albums.add(album1);

        req.setAttribute("albums", albums);
        req.getRequestDispatcher("/albums-list.jsp").forward(req, resp);

    }
}
