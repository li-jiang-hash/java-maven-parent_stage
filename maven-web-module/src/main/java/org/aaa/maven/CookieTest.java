package org.aaa.maven;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @Author:江Sir
 * @Date:15 2022/08/15 17:24
 * @description: Exercise
 * @Version 1.0.0
 */
@WebServlet("/ad")
public class CookieTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Cookie cookie = new Cookie("admin","aaalijiang");
        String value="李张三";
        value = URLEncoder.encode(value,"UTF-8");
        Cookie cookie = new Cookie("admin", value);
        //设置cookie存活时间
        cookie.setMaxAge(60*60);
        resp.addCookie(cookie);
        Cookie[] cookies = req.getCookies();
        resp.sendRedirect("aaa");
        for(Cookie cookie1:cookies) {
          String name = cookie1.getName();
          if("admin".equals(name)){
              String val = cookie1.getValue();
              val = URLDecoder.decode(value,"UTF-8");
              System.out.println(name+":"+val);
              break;
          }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
