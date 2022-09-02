package org.aaa.api;

import java.util.Date;

/**
 * @Author:江Sir
 * @Date:29 2022/08/29 19:28
 * @description: Exercise
 * @Version 1.0.0
 */
public class OrderUser {

    private Integer id;
    private Date ordertime;
    private double money;
    // 表示当前订单属于哪个用户
    //一对一打开
    private User user;
    public OrderUser() {
    }

    public OrderUser(Integer id, Date ordertime, double money, User user) {
        this.id = id;
        this.ordertime = ordertime;
        this.money = money;
        this.user = user;
    }

    @Override
    public String toString() {
        return "OrderUser{" +
                "id=" + id +
                ", ordertime=" + ordertime +
                ", money=" + money +
                ", user=" + user +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
