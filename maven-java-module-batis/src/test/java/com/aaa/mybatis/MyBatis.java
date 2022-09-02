package com.aaa.mybatis;

import com.aaa.mybatis.api.Mybatis_User;
import com.aaa.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author:江Sir
 * @Date:25 2022/08/25 17:54
 * @description: Exercise
 * @Version 1.0.0
 */
public class MyBatis {

    @Test
    public void testMyBatis() throws IOException {
//        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
//        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        SqlSession sqlSession = SqlSessionUtils.getsqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

//        int result = mapper.insertUser();
//        int result = mapper.deleteUser();
//        int result = mapper.updateUser();

//        User user = mapper.getUSerById();
        List<Mybatis_User> list = mapper.getAllUser();
        list.forEach(mybatisUser -> System.out.println(mybatisUser));
//        sqlSession.commit();
//        System.out.println("result:" + result);
    }

    @Test
    public void testUpdate() throws IOException {

        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);


        UserMapper mapper = sqlSession.getMapper(UserMapper.class);


    }
}
