package org.aaa;

import org.aaa.api.Emp;
import org.aaa.dao.CacheMapper;
import org.aaa.utils.SqlSessionUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author:江Sir
 * @Date:31 2022/08/31 08:49
 * @description: Exercise
 * @Version 1.0.0
 */
public class CacheMapperTest {
    @Test
    public void testOneCache() {
        SqlSession sqlSession1 = SqlSessionUtils.getsqlSession();
//        SqlSession sqlSession2 = SqlSessionUtils.getsqlSession();
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
//        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp emp = mapper1.getEmpByid(1);
        System.out.println(emp);
        int i = mapper1.insertEmp(new Emp(null, "俩经", 21, "男", "123@qq.com"));
        System.out.println(i);
//        sqlSession1.clearCache();
        Emp emp1 = mapper1.getEmpByid(1);
        System.out.println(emp1);
    }
    @Test
    public void testTwoCache() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession1 = sqlSessionFactory.openSession(true);
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        System.out.println(mapper1.getEmpByid(1));
        sqlSession1.close();
        SqlSession sqlSession2 = sqlSessionFactory.openSession(true);
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        System.out.println(mapper2.getEmpByid(1));
        sqlSession2.close();
        SqlSession sqlSession3 = sqlSessionFactory.openSession(true);
        CacheMapper mapper3 = sqlSession3.getMapper(CacheMapper.class);
        System.out.println(mapper3.getEmpByid(1));
        sqlSession2.close();
    }
}
