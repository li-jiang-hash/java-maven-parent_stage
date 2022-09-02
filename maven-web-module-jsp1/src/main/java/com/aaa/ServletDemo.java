package com.aaa;


import org.aaa.JUtils.JdbcUtilsList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


/**
 * @Author:江Sir
 * @Date:16 2022/08/16 15:19
 * @description: Exercise
 * @Version 1.0.0
 */
@WebServlet("/Djsp1")
public class ServletDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 准备数据
//        List<Brand> brands = new ArrayList<Brand>();
//        brands.add(new Brand(1, "三只松鼠", "三只松鼠", 100, "三只松鼠，好吃不上 火", 1));
//        brands.add(new Brand(2, "优衣库", "优衣库", 200, "优衣库，服适人生", 0));
//        brands.add(new Brand(3, "小米", "小米科技有限公司", 1000, "为发烧而生", 1));
//        request.setAttribute("brands",brands);
//        request.setAttribute("status",1);
//
//        request.getRequestDispatcher("jsp1.jsp").forward(request,response);
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
//        UserDaoImpl empDao = new UserDaoImpl();
//        User emp = empDao.selectUserByLoginAccount(user,pass);
//        System.out.println(emp+"++++++++");
        JdbcUtilsList jUtils = new JdbcUtilsList();
        String sql= "select user_id userId, " +
                "user_name userName, " +
                "pass_word passWord " +
                "from user where user_name=? && pass_word=?;";
        List<List> lists = jUtils.queryList(sql, user, pass);
//        if ((user.equals("admin001") || user.equals("admin") || user.equals("admin01")) && pass.equals("552157")) {
        if (lists.size()>0) {
            HttpSession session = request.getSession(true);
            session.setAttribute("user", user);
            /* 这里如果404检查是否需要添加项目名 */
            response.sendRedirect("/maven_web_module_jsp1_war_exploded/Welcome");
        } else {

            response.sendRedirect("/maven_web_module_jsp1_war_exploded/index.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
