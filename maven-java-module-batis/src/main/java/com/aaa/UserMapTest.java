package com.aaa;

import java.util.Date;

/**
 * @Author:江Sir
 * @Date:26 2022/08/26 22:08
 * @description: Exercise
 * @Version 1.0.0
 */
public class UserMapTest {

    private Integer Id;
    private String userName;
    private Date Birthday;
    private String Sex;
    private String Address;

    @Override
    public String toString() {
        return "UserMapTest{" +
                "Id=" + Id +
                ", userName='" + userName + '\'' +
                ", Birthday=" + Birthday +
                ", Sex='" + Sex + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

    public UserMapTest() {
    }

    public UserMapTest(Integer id, String userName, Date birthday, String sex, String address) {
        Id = id;
        this.userName = userName;
        Birthday = birthday;
        Sex = sex;
        Address = address;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
