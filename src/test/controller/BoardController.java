package test.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/board")
public class BoardController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add("게시글1");
        list.add("게시글2");
        list.add("게시글3");
        req.setAttribute("list", list);
        req.setAttribute("content", "/3/board.jsp");
        req.getRequestDispatcher("/3/layout.jsp").forward(req, resp);
    }
}
