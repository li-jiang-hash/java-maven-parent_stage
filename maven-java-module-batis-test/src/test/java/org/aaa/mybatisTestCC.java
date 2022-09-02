package org.aaa;


import org.aaa.api.*;
import org.aaa.dao.OrderMapper;
import org.aaa.dao.UserMapper;
import org.aaa.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author:江Sir
 * @Date:29 2022/08/29 19:51
 * @description: Exercise
 * @Version 1.0.0
 */
public class mybatisTestCC {
    @Test
    public void testOrderWithUserBOrB() throws Exception {
        SqlSession sqlSession = SqlSessionUtils.getsqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<OrderUser> list = orderMapper.findAllWithUser();
        list.forEach(order -> System.out.println(order));
    }

    @Test
    public void testOrderWithUserBOrC() throws Exception {
        SqlSession sqlSession = SqlSessionUtils.getsqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<UserOrder> allWithOrder = userMapper.findAllWithOrder();
        allWithOrder.forEach(user -> System.out.println(user));
//        findAllWithOrder
    }
    @Test
    public void testOrderWithUserCOrC() throws Exception {
        SqlSession sqlSession = SqlSessionUtils.getsqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<UserRole> allWithOrder = userMapper.findAllWithRole();
        allWithOrder.forEach(user -> System.out.println(user));
//        findAllWithOrder
    }
    @Test
    public void testOrderWithUserCOrCTest() throws Exception {
        SqlSession sqlSession = SqlSessionUtils.getsqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<RoleTest> allWithOrder = userMapper.findAllWithRoleTest();
        allWithOrder.forEach(user -> System.out.println(user));
//        findAllWithOrder
    }
    @Test
    public void testOrderWithUserBOrBNest() throws Exception {
        SqlSession sqlSession = SqlSessionUtils.getsqlSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<OrderUser> list = orderMapper.findAllWithUser1();
        list.forEach(order -> System.out.println(order));
    }
//    @Test
//    public void testOrderWithUserBOrC() throws Exception {
//        SqlSession sqlSession = SqlSessionUtils.getsqlSession();
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        List<UserOrder> allWithOrder = userMapper.findAllWithOrder();
//        allWithOrder.forEach(user -> System.out.println(user));
////        findAllWithOrder
//    }
}
