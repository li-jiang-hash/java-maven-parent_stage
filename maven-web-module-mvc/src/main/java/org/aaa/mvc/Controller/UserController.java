package org.aaa.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
            params = {"accountName"})
    public String quick() {
        System.out.println("quick running.....");
        return "success";
    }
}
