package test.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/login")
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("content", "/3/login.jsp");
        req.getRequestDispatcher("/3/layout.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String pwd = req.getParameter("pwd");
        if(id.equals("test") && pwd.equals("1234")){
            req.getSession().setAttribute("id", id);
            resp.sendRedirect(req.getContextPath() + "/3/layout.jsp");
        } else {
            req.setAttribute("content", "/3/login.jsp");
            req.setAttribute("errMsg", "아이디 또는 비밀번호 오류");
            req.getRequestDispatcher("/3/layout.jsp").forward(req, resp);
        }
    }
}
