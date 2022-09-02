package org.aaa;

import org.aaa.dao.StudentDao;
import org.aaa.dao.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:江Sir
 * @Date:01 2022/09/01 14:30
 * @description: Exercise
 * @Version 1.0.0
 */
public class StuTest {

    @Test
    public void UserTest() {  /* 加载同时保存bean 到容器中 */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");    /* 直接从容器中获取 */
        StudentDao studentDao1 = (StudentDao) applicationContext.getBean("studentDao");
        StudentDao studentDao = (StudentDao) applicationContext.getBean("studentDao1");
        System.out.println(studentDao1);
        System.out.println(studentDao);
    }
}
