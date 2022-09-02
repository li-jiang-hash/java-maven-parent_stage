package com.aaa;

/**
 * @Author:江Sir
 * @Date:16 2022/08/16 15:25
 * @description: Exercise
 * @Version 1.0.0
 */
public class Brand1 {
    private Integer id;
    private String name;
    private String address;
    private Integer price;
    private String slogan;
    private Integer status;

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", slogan='" + slogan + '\'' +
                ", status=" + status +
                '}';
    }

    public Brand1() {
    }

    public Brand1(Integer id, String name, String address, Integer price, String slogan, Integer status) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.price = price;
        this.slogan = slogan;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
