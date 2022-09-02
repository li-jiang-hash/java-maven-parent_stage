package com.aaa;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:江Sir
 * @Date:16 2022/08/16 19:25
 * @description: Exercise
 * @Version 1.0.0
 */
@WebServlet("/Welcome")
public class Welcome extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
//        System.out.println(req.getCookies());
//        System.out.println(req.getSession());
        System.out.println(session==null);
        if(session==null){
            resp.sendRedirect("index.jsp");
        }else {
            List<Brand1> brands = new ArrayList<Brand1>();
            brands.add(new Brand1(1, "三只松鼠", "三只松鼠", 100, "三只松鼠，好吃不上 火", 1));
            brands.add(new Brand1(2, "优衣库", "优衣库", 200, "优衣库，服适人生", 0));
            brands.add(new Brand1(3, "小米", "小米科技有限公司", 1000, "为发烧而生", 1));
            req.setAttribute("brands",brands);
            req.setAttribute("status",1);

            req.getRequestDispatcher("jsp1.jsp").forward(req,resp);
            resp.setContentType("text/html;charset=utf-8");
//            PrintWriter out = resp.getWriter();
//            out.println("<h1>欢迎你" + session.getAttribute("user") + "</h1>");
            req.setAttribute("user",session.getAttribute("user"));
//            out.close();
            //1. 准备数据

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    public void logout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("123");
        HttpSession session = req.getSession();
        Cookie cookies[] = req.getCookies();
        for(Cookie cookie:cookies) {
          cookie.setMaxAge(0);
          cookie.setPath("/index.jsp");
          resp.addCookie(cookie);
        }
        session.invalidate();

        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
