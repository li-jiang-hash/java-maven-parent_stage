package org.aaa;

import static org.junit.Assert.assertTrue;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.aaa.mybatis.entity.Emp;
import org.aaa.mybatis.entity.EmpExample;
import org.aaa.mybatis.entity.User;
import org.aaa.mybatis.mapper.EmpMapper;
import org.aaa.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class MBGTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testMBG() throws Exception {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        UserMapper mapper1 = sqlSession.getMapper(UserMapper.class);

        Page<Object> page = PageHelper.startPage(3, 4);
        List<Emp> emps = mapper.selectByExample(null);
        PageInfo<Emp> empPageInfo = new PageInfo<>(emps,5);
//        emps.forEach(emp -> System.out.println(emp));
        System.out.println(empPageInfo);
        /*EmpExample empExample = new EmpExample();
        empExample.createCriteria().andEmpNameEqualTo("张三").andAgeGreaterThanOrEqualTo(18);
        List<Emp> list = mapper.selectByExample(empExample);
        System.out.println(list);*/
//        mapper1.updateByPrimaryKeySelective(new User(1,"李江",new Date(),"男",null));
    }
}
