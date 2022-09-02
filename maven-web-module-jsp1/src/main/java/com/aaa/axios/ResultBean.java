package com.aaa.axios;

import java.util.List;

/**
 * @Author:江Sir
 * @Date:18 2022/08/18 16:19
 * @description: Exercise
 * @Version 1.0.0
 */
public class ResultBean<T> {
    private int code;
    private String msg;
    private  int count;
    private List<T> data;

    public ResultBean(){}
    public ResultBean(int code, String msg, int count, List<T> data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
