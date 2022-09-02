package com.aaa.axios.dao;

import org.aaa.JUtils.JdbcUtilsMap;

import java.util.List;
import java.util.Map;

/**
 * @Author:江Sir
 * @Date:20 2022/08/20 09:31
 * @description: Exercise
 * @Version 1.0.0
 */
public class BrandDaoImpl implements IBrandDao{

    @Override
    public List<Map> queryLimit(int begin, int limit) {
        return JdbcUtilsMap.queryMap("select * from tb_brand limit ?,?",begin,limit);
    }

    @Override
    public List<Map> queryall() {
        return JdbcUtilsMap.queryMap("select * from tb_brand");
    }
}
