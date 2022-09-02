package com.aaa.mybatis;

import com.aaa.mybatis.api.Mybatis_User;
import com.aaa.mybatis.api.User;
import com.aaa.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:江Sir
 * @Date:26 2022/08/26 23:13
 * @description: Exercise
 * @Version 1.0.0
 */
public class ParameterMapperTest {
    @Test
    public void testGetAllUser() {
        SqlSession sqlSession = SqlSessionUtils.getsqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<Mybatis_User> mybatisUser = mapper.getAllUser();
        mybatisUser.forEach(mybatisUser1 -> System.out.println(mybatisUser1));
    }

    @Test
    public void testGetByUsername() {
        SqlSession sqlSession = SqlSessionUtils.getsqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.getUserByUsername("admin");
        System.out.println(user);
    }

    @Test
    public void testCheckLogin() {
        SqlSession sqlSession = SqlSessionUtils.getsqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLogin("admin", "552157");
        System.out.println(user);
    }

    @Test
    public void testCheckByMap() {
        SqlSession sqlSession = SqlSessionUtils.getsqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "admin");
        map.put("password", "123456");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
    }

    @Test
    public void testinsertUser() {
        SqlSession sqlSession = SqlSessionUtils.getsqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin");
        mapper.insertUser(user);
//        int result = mapper.insertUser(user);
//        System.out.println(result);
        System.out.println("返回主键" + user.getId());
    }
    @Test
    public void testCheckLoginByparam() {
        SqlSession sqlSession = SqlSessionUtils.getsqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        User user = mapper.checkLoginByParam("admin", "552157");
        System.out.println(user);
    }
}
