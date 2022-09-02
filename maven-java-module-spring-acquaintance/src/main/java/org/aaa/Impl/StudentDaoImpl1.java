package org.aaa.Impl;

import org.aaa.dao.StudentDao;

import java.util.Properties;

/**
 * @Author:江Sir
 * @Date:01 2022/09/01 14:24
 * @description: Exercise
 * @Version 1.0.0
 */
public class StudentDaoImpl1 implements StudentDao {
    private String name;
    private Integer age;
    private String sex;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "StudentDaoImpl1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public void save() {

    }
}
