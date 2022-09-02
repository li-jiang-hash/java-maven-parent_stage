package com.aaa.axios;

import org.aaa.JUtils.JdbcUtilsMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

/**
 * @Author:江Sir
 * @Date:19 2022/08/19 15:00
 * @description: Exercise
 * @Version 1.0.0
 */
//@WebServlet("/asd")
public class CheckUserName extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
//
//
        String username = req.getParameter("username");
        String passwod = req.getParameter("password");
        String sql1 = "select*from user where user_name=?;";
        List<Map> maps1 = JdbcUtilsMap.queryMap(sql1,username);
        if(maps1.size()>0){
            out.println(1);
            System.out.println(1);
        }else {
            out.println(0);
            if(maps1.size()==0){
                String sql="insert into user(user_name,pass_word) values(?,?);";
                System.out.println(username+"|||||||"+passwod);
                int list = JdbcUtilsMap.update(sql,username,passwod);
                System.out.println("受影响行数"+list);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

}
