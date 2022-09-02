package org.aaa;

import org.aaa.api.Emp;
import org.aaa.api.User;
import org.aaa.dao.DynamicSQL;
import org.aaa.dao.UserMapper;
import org.aaa.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author:江Sir
 * @Date:30 2022/08/30 20:48
 * @description: Exercise
 * @Version 1.0.0
 */
public class DynamicSQLTest {
    @Test
    public void testGetUserByCondition() {
        SqlSession sqlSession = SqlSessionUtils.getsqlSession();
        DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);


        List<Emp> list = mapper.getEmpByCondition(new Emp(null, "张三",null , "", ""));
        System.out.println(list);

    }

    @Test
    public void testGetUserByChoose() {
        SqlSession sqlSession = SqlSessionUtils.getsqlSession();
        DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);


        List<Emp> list = mapper.getEmpByChoose(new Emp(null, "李江", 21, "男", "li4656822@gmail.com"));
        System.out.println(list);

    }

    @Test
    public void testDeleteMoreByArray() {
        SqlSession sqlSession = SqlSessionUtils.getsqlSession();
        DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);


        int result = mapper.deleteMoreByArray(new Integer[]{5});
        System.out.println(result);

    }

    @Test
    public void testInsertMoreByList() {
        SqlSession sqlSession = SqlSessionUtils.getsqlSession();
        DynamicSQL mapper = sqlSession.getMapper(DynamicSQL.class);
        Emp emp1 = new Emp(null, "a1", 21, "男", "123@qq.com");
        Emp emp2 = new Emp(null, "a2", 21, "男", "123@qq.com");
        Emp emp3 = new Emp(null, "a3", 21, "男", "123@qq.com");
        Emp emp4 = new Emp(null, "a4", 21, "男", "123@qq.com");
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3, emp4);
        int result = mapper.inisertMoreByList(emps);
        System.out.println(result);

    }

}
