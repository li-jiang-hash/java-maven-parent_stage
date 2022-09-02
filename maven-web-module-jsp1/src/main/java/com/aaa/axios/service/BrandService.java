package com.aaa.axios.service;

import com.aaa.axios.Brand;
import com.aaa.axios.dao.BrandDaoImpl;
import com.aaa.axios.dao.IBrandDao;

import java.util.List;
import java.util.Map;

/**
 * @Author:江Sir
 * @Date:20 2022/08/20 09:39
 * @description: Exercise
 * @Version 1.0.0
 */
public class BrandService {
    public List<Brand> queryBandsData(int begin, int limit) {
        IBrandDao brandDao = new BrandDaoImpl();
        List<Map> mapList = brandDao.queryLimit(begin,limit);
        List<Map> maps = brandDao.queryall();
        return null;
    }
}
