package org.aaa.service;

import org.aaa.BeanFactory;
import org.aaa.Impl.UserDaoImpl;
import org.aaa.dao.UserDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author:江Sir
 * @Date:31 2022/08/31 20:34
 * @description: Exercise
 * @Version 1.0.0
 */
@Service
@Scope("singleton")
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @PostConstruct
    public void save() {
        UserDao userDao = (UserDao) BeanFactory.getBean("userDao");
        userDao.save();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("销毁方法.....");
    }
}
