import Dao.AccountDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.Account;

import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    //mybatis在ssm环境中能独立使用
    @Test
    public void testMybatis() throws Exception {
    // 加载核心配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
    // 获得sqlsession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    // 获得sqlsession会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
    // 获得mapper代理对象
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
    // 执行
        List<Account> list = accountDao.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
    // 释放资源
        sqlSession.close();
    }
}
