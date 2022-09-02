package org.aaa.api;

import java.util.Date;
import java.util.List;

/**
 * @Author:江Sir
 * @Date:29 2022/08/29 22:40
 * @description: Exercise
 * @Version 1.0.0
 */
public class UserRole {

    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;
    //BC
    private List<Role> roleList;
    public UserRole() {
    }

    public UserRole(Integer id, String username, Date birthday, String sex, String address, List<Role> roleList) {
        this.id = id;
        this.username = username;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
        this.roleList = roleList;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", roleList=" + roleList +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}
