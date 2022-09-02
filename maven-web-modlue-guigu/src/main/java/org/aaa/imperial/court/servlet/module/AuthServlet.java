package org.aaa.imperial.court.servlet.module;

import org.aaa.imperial.court.entity.Emp;
import org.aaa.imperial.court.exception.LoginFailedException;
import org.aaa.imperial.court.service.api.EmpService;
import org.aaa.imperial.court.service.impl.EmpServiceImpl;
import org.aaa.imperial.court.servlet.base.ModelBaseServlet;
import org.aaa.imperial.court.util.ImperialCourtConst;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialException;
import java.io.IOException;

/**
 * @Author:江Sir
 * @Date:14 2022/08/14 16:58
 * @description: Exercise
 * @Version 1.0.0
 */
public class AuthServlet extends ModelBaseServlet {

    private EmpService empservice = new EmpServiceImpl();

    protected void login(HttpServletRequest request, HttpServletResponse response) throws SerialException, IOException {
        try {

//1.获取请求参数
            String loginAccount = request.getParameter("loginAccount");
            String loginPassword = request.getParameter("loginPassword");


//2.调用EmpService方法执行登陆逻辑
            Emp emp = empservice.getEmpByLoginAccount(loginAccount, loginPassword);

//3、通过request获取Httpsession对象
            HttpSession session = request.getSession();
//4、将查询到的Emp对象存入Session域
            session.setAttribute(ImperialCourtConst.LOGIN_EMP_ATTR_NAME, emp);

//5、前往指定页面视图

            //String templateName = "temp";
            //processTemplate(templateName, request, response);
            response.sendRedirect(request.getContextPath() + "/work?method=showMemorialsDigestList");
        } catch (Exception e) {
            e.printStackTrace();
//6、判断此处捕获到的异常是否是登录失败异常
            if (e instanceof LoginFailedException) {

//7、如果是登录失败异常则跳转回登录页面
//①将异常信息存入请求域

                request.setAttribute("message", e.getMessage());

//②处理视图：index
                processTemplate("index", request, response);
            } else {
//8、如果不是登录异常则封装为运行时异常继续抛出
                throw new RuntimeException(e);
            }
        }


    }

    protected void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {

        HttpSession session = request.getSession();
        session.invalidate();

//        回到首页
        String templateName = "index";
        processTemplate(templateName, request, response);
    }
}

