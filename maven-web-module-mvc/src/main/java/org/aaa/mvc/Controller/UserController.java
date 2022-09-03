package org.aaa.mvc.Controller;

import org.aaa.mvc.api.QueryVo;
import org.aaa.mvc.api.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.Date;

/**
 * @Author:江Sir
 * @Date:02 2022/09/02 16:48
 * @description: Exercise
 * @Version 1.0.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(path = "/quick",
            method = RequestMethod.GET,
            params = {"q"})
    public String quick() {
        System.out.println();
        System.out.println("quick running.....");
        return "success";
    }

    @RequestMapping("/simpleParam")
    public String simpleParam(Integer id, String username) {
        System.out.println(id);
        System.out.println(username);
        return "success";
    }

    @RequestMapping("/pojoParam")
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

}
