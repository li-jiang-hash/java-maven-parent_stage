package org.aaa;

import org.aaa.api.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:江Sir
 * @Date:02 2022/09/02 09:04
 * @description: Exercise
 * @Version 1.0.0
 */
public class AtguiguTest {
    @Test
    public void testBeanDI(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("atguigu.xml");
        Student student = ioc.getBean("studentTwo",Student.class);
        System.out.println(student);
    }
    @Test
    public void testBeanIOC(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("atguigu.xml");
        Student student = ioc.getBean("studentOne",Student.class);
        System.out.println(student);
    }
}
