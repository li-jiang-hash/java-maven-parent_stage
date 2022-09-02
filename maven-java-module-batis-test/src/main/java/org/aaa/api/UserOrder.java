package org.aaa.api;

import java.util.Date;
import java.util.List;

/**
 * @Author:江Sir
 * @Date:29 2022/08/29 22:40
 * @description: Exercise
 * @Version 1.0.0
 */
public class UserOrder {

    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;
    //BC
    private List<Order> orderList;

    public UserOrder() {
    }

    public UserOrder(Integer id, String username, Date birthday, String sex, String address, List<Order> orderList) {
        this.id = id;
        this.username = username;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "UserOrder{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", orderList=" + orderList +
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

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
