package org.aaa.maven;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author:江Sir
 * @Date:16 2022/08/16 09:40
 * @description: Exercise
 * @Version 1.0.0
 */
@WebServlet("/welcomeServlet")
public class WelcomeServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if(session==null){
            resp.sendRedirect("login.jsp");
        }else {
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter out = resp.getWriter();
            out.println("<h1>欢迎你" + session.getAttribute("user") + "</h1>");
            out.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
