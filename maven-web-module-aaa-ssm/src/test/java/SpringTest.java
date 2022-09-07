import Service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.Account;

import java.util.List;
    //@RunWith让测试运行于Spring测试环 境，以便在测试开始的时候自动创建Spring的应用上下文
    @RunWith(SpringJUnit4ClassRunner.class)
    //@ContextConfiguration注解来标注我们想要导入这个测试类的某些bean
    @ContextConfiguration("classpath:applicationContext.xml")
    public class SpringTest {
        //@Autowired注解来引入这些收集起来的bean
        @Autowired
        private AccountService accountService;

        @Test
        public void testSpring() throws Exception {
            List<Account> list = accountService.findAll();
            System.out.println(list);
        }
    }
