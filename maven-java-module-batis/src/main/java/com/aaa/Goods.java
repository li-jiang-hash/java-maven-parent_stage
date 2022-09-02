package com.aaa;

/**
 * @Author:江Sir
 * @Date:22 2022/08/22 23:02
 * @description: Exercise
 * @Version 1.0.0
 */
public class Goods {
    private Integer goods_id;
    private String goods_name;
    private Double goods_price;
    private String goods_slogan;

    public Goods() {
    }

    public Goods(Integer goods_id, String goods_name, Double goods_price, String goods_slogan) {
        this.goods_id = goods_id;
        this.goods_name = goods_name;
        this.goods_price = goods_price;
        this.goods_slogan = goods_slogan;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goods_id=" + goods_id +
                ", goods_name='" + goods_name + '\'' +
                ", goods_price=" + goods_price +
                ", goods_slogan='" + goods_slogan + '\'' +
                '}';
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public Double getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(Double goods_price) {
        this.goods_price = goods_price;
    }

    public String getGoods_slogan() {
        return goods_slogan;
    }

    public void setGoods_slogan(String goods_slogan) {
        this.goods_slogan = goods_slogan;
    }
}
