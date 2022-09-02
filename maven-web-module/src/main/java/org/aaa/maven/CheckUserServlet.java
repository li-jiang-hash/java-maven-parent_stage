package org.aaa.maven;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author:江Sir
 * @Date:16 2022/08/16 09:49
 * @description: Exercise
 * @Version 1.0.0
 */
@WebServlet("/CheckUserServlet")
public class CheckUserServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        if ((user.equals("admin001") || user.equals("admin") || user.equals("admin01")) && pass.equals("552157")) {
            HttpSession session = request.getSession(true);
            session.setAttribute("user", user);
            /* 这里如果404检查是否需要添加项目名 */
            response.sendRedirect("/web-module_aaa/welcomeServlet");
        } else {           /* 这里如果404 检查是否需要添加项目名 */
            response.sendRedirect("/web-module_aaa/lgin.jsp");
        }

    }
}
