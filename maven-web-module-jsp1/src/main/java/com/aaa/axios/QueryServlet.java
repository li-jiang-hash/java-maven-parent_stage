package com.aaa.axios;

import com.alibaba.fastjson.JSON;
import org.aaa.JUtils.JdbcUtilsMap;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Author:江Sir
 * @Date:18 2022/08/18 14:54
 * @description: Exercise
 * @Version 1.0.0
 */
@WebServlet("/SAll")
public class QueryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page = req.getParameter("page");
        String limit = req.getParameter("limit");
        Integer pageInt = Integer.valueOf(page);
        Integer limitInt = Integer.valueOf(limit);
        pageInt = (pageInt - 1) * limitInt;

//        JUtils august = new JUtils("august", 3306);

        String sql = "select*from tb_brand limit ?,?;";
        String sql1 = "select*from tb_brand;";

//        List<Map> maps = JdbcUtils.queryMap("select * from tb_brand limit ?,?", pageInt, limitInt*2.5);
//        System.out.println(august.queryList(sql));
//        JdbcUtils jdbcUtils = new JdbcUtils();
        List<Map> maps = JdbcUtilsMap.queryMap(sql, pageInt, limitInt);
        List<Map> maps1 = JdbcUtilsMap.queryMap(sql1);
        System.out.println("maps"+maps);
        List<Brand> brands = new ArrayList<Brand>();
        for (Map map : maps) {
            try {
                Brand brand = new Brand();

                BeanUtils.populate(brand, map);
                brands.add(brand);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
//            brand
        }
        ResultBean<Brand> brandResultBean = new ResultBean<Brand>();

        brandResultBean.setCode(0);
        brandResultBean.setMsg("");
        brandResultBean.setCount(maps1.size());
        brandResultBean.setData(brands);
        String brandsStr = JSON.toJSONString(brandResultBean);
        resp.setHeader("content-type", "text/html;charset = UTF-8");
        resp.getWriter().println(brandsStr);

     }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
