package org.aaa.mvc.Controller;

import org.aaa.mvc.api.QueryVo;
import org.aaa.mvc.api.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Author:江Sir
 * @Date:02 2022/09/02 16:48
 * @description: Exercise
 * @Version 1.0.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(path = "/quick", method = RequestMethod.GET, params = {"q"})
    public String quick() {
        System.out.println();
        System.out.println("quick running.....");
        return "success";
    }

    @RequestMapping("/account")
    public String simpleParam(HttpServletResponse response, Integer id, String username) throws IOException {
        System.out.println(id);
        response.getWriter().write("欢迎" + username);
        System.out.println(username);
        return "success";
    }

    @RequestMapping(value = "/pojoParam", headers = {"referer"})
    public String pojoParam(User user) {
        System.out.println(user);
        return "success";
    }

    @RequestMapping("/arrayParam")

    public String arrayParam(Integer[] ids) {
        System.out.println(Arrays.toString(ids));
        return "success";
    }

    @RequestMapping(value = "/queryParam", method = RequestMethod.POST)
    public String queryParam(QueryVo queryVo) {
        System.out.println(queryVo);
        return "success";
    }

    @RequestMapping("/converterParam")
    public String converterParam(Date birthday) {
        System.out.println(birthday);
        return "success";
    }

    @RequestMapping("/findByPage")
    public String findByPage(@RequestParam(name = "pageNo", defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "5") Integer pageSize) {
        System.out.println(pageNum);
        System.out.println(pageSize);
        return "success";
    }

    @RequestMapping("/returnVoid")
    public void returnVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 1.通过response直接响应数据
//        response.setContentType("text/html;charset=utf-8");
//
//        response.getWriter().write("baidu");
        // 2.通过request实现转发
        request.getRequestDispatcher("/WEB-INF/pageSizeges/success.jsp").forward(request, response);
        // 3.通过response实现重定向
        response.sendRedirect(request.getContextPath() + "/index.jsp");
    }

    @RequestMapping("/returnModelAndView1")
    public ModelAndView returnModelAndView1() {  /*  Model:模型 作用封装数据  View：视图 作用展示数据  */
        ModelAndView modelAndView = new ModelAndView();
        //设置模型数据
        modelAndView.addObject("username", "fyh");
        //设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/rest/{request}")
    public String testRest(@PathVariable("request") String request) {
//        if(request.equals("param")){
//
//        }
        System.out.println(request);
        return request;
    }

    @RequestMapping("/{request}")
    public String testRest1(@PathVariable("request") String request) {
//        if(request.equals("param")){
//
//        }
        System.out.println(request);
        return request;
    }

    @RequestMapping("/param")
    public String getParam(@RequestParam(value = "userName",required = false ,defaultValue = "hello") String username,
                         String password) throws IOException {
        System.out.println("username：" + username + "password:" + password);
        return "success";
    }

    @RequestMapping(value = "/ajaxRequest")
    @ResponseBody
    public List<User> testAxios(@RequestBody List<User> list) {
        System.out.println(list);
        return list;
    }

    @RequestMapping("/fileUpload_file")
    public String fileupload(String username, MultipartFile filePic) {
        System.out.println(username);
        // 获取文件名
        String originalFilename = filePic.getOriginalFilename();
        //保存文件
        try {
            filePic.transferTo(new File("d:/upload/" + username + "_" + originalFilename));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "successUpdateFile";
    }

    @RequestMapping("/fileUpload_files")
    public String filesupload(String username, MultipartFile filePic[]) {
        System.out.println(username);
        for (MultipartFile multipartFile : filePic) {
            // 获取文件名
            String originalFilename = multipartFile.getOriginalFilename();
            //保存文件
            try {
                if (multipartFile.getSize() != 0) {
                    multipartFile.transferTo(new File("d:/upload/" + username + "_" + originalFilename));
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return "successUpdateFile";
    }


}
