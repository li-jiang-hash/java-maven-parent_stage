package org.aaa.api;

import java.util.Date;
import java.util.List;

/**
 * @Author:江Sir
 * @Date:29 2022/08/29 19:28
 * @description: Exercise
 * @Version 1.0.0
 */
public class Order {

    private Integer id;
    private Date ordertime;
    private double money;

    public Order() {
    }

    public Order(Integer id, Date ordertime, double money) {
        this.id = id;
        this.ordertime = ordertime;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", ordertime=" + ordertime +
                ", money=" + money +
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
}
