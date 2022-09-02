package org.aaa.maven;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.util.Map;

/**
 * @Author:江Sir
 * @Date:13 2022/08/13 10:01
 * @description: Exercise
 * @Version 1.0.0
 */
//@WebServlet(urlPatterns = "/my1",loadOnStartup = 1)
public class MyServlet1 extends MyServlet {
    @Override
   protected void doGet(ServletRequest servletRequest, ServletResponse servletResponse) {
        System.out.println("我自己处理get");
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/text_stu?useUnicode=true&characterEncoding=GBK";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(url, "root", "552157");

            stmt = conn.createStatement();

            rs = stmt.executeQuery("select * from Student");
            while (rs.next()){
                int id=rs.getInt("id");
                int age=rs.getInt("age");
                String name = rs.getString("name");
                String sex = rs.getString("sex");
                String school = rs.getString("school");
                System.out.println("大家好我叫"+name+"性别"+sex+"今年"+age+"岁，现在就读于"+school+"学号为"+id);
            }
        } catch (SQLException e) {
            System.err.println("检查数据库SQL");
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

//        System.out.println(rs);
    }

    @Override
    protected void doPost(ServletRequest servletRequest, ServletResponse servletResponse){
        System.out.println("我自己处理post");
        try {
            servletRequest.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        Map<String, String[]> map = servletRequest.getParameterMap();
        String username = servletRequest.getParameter("username");
        String password = servletRequest.getParameter("password");
        String habby[] = servletRequest.getParameterValues("habby");
        for(String key:map.keySet()) {
            System.out.print(key+":");
            String value[] = map.get(key);
            for(String values:value) {
                System.out.print(values);
            }
            System.out.println();
        }
        try {
            servletRequest.getRequestDispatcher("aaa.jsp").forward(servletRequest,servletResponse);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        servletResponse.setContentType("text/html;charset=utf-8");
//        servletResponse.sendRedirecrt
    }
}
