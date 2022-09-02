package com.atguigu.cart.servlets;

import com.atguigu.cart.BaseDaoImpl.BrandDAOImpl;
import com.atguigu.cart.entity.Brand;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:江Sir
 * @Date:22 2022/08/22 11:05
 * @description: Exercise
 * @Version 1.0.0
 */
@WebServlet("/index")
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BrandDAOImpl brandDAO = new BrandDAOImpl();
        List<List> brandList = brandDAO.getBrandList();
        List<Brand> brands = new ArrayList<Brand>();
        System.out.println(brandList);
//        resp.sendRedirect("index");
        HttpSession session = req.getSession();
        session.setAttribute("brandList",brandList);
    }

}
