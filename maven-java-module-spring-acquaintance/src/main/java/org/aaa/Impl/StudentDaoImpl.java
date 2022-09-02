package org.aaa.Impl;

import org.aaa.dao.StudentDao;

import java.util.Properties;

/**
 * @Author:江Sir
 * @Date:01 2022/09/01 14:24
 * @description: Exercise
 * @Version 1.0.0
 */
public class StudentDaoImpl implements StudentDao {
    private Properties stuinfo;

    public void setStuinfo(Properties stuinfo) {
        this.stuinfo = stuinfo;
    }

    @Override
    public String toString() {
        return "StudentDaoImpl{" +
                "stuinfo=" + stuinfo +
                '}';
    }

    @Override
    public void save() {

    }
}
