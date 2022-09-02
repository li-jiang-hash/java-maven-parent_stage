package org.aaa;

import org.aaa.api.Account;
import org.aaa.dao.UserDao;
import org.aaa.service.AccountService;
import org.aaa.service.UserService;
import org.aaa.service.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author:江Sir
 * @Date:31 2022/08/31 20:30
 * @description: Exercise
 * @Version 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class UserTest {
    @Test
    public void testSave() {
        UserServiceImpl userService = new UserServiceImpl();
        userService.save();
    }

    @Test
    public void UserTest() {  /* 加载同时保存bean 到容器中 */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");    /* 直接从容器中获取 */
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();
        applicationContext.close();
    }

    @Autowired
    private AccountService accountService;

    @Test
    public void testFindById() {
        List<Account> all = accountService.findAll();
        System.out.println(all);
    }

}
