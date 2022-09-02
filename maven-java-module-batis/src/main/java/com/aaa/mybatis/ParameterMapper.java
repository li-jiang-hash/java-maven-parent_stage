package com.aaa.mybatis;


import com.aaa.mybatis.api.Mybatis_User;
import com.aaa.mybatis.api.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author:江Sir
 * @Date:26 2022/08/26 23:08
 * @description: Exercise
 * @Version 1.0.0
 */
public interface ParameterMapper {
    //    List<User> getAllUser();
    List<Mybatis_User> getAllUser();
    User getUserByUsername(String username);
    User checkLogin(String username, String password);
    /**
     * 验证登录
     * MAP方式。
     */
    User checkLoginByMap(Map<String,Object> map);
    int insertUser(User user);

    User checkLoginByParam(@Param("username") String username,@Param("password") String password);
//    void save(User user);
}
