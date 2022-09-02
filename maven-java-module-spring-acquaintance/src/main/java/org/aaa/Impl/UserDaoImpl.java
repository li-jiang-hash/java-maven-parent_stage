package org.aaa.Impl;

import org.aaa.dao.UserDao;
import org.springframework.stereotype.Repository;

import java.util.Properties;

/**
 * @Author:江Sir
 * @Date:31 2022/08/31 20:28
 * @description: Exercise
 * @Version 1.0.0
 */
public class UserDaoImpl implements UserDao {
    private Properties properties;
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void save() {
        System.out.println("保存成功。。。!!!");
    }
    public void init() {
        System.out.println("init");
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
