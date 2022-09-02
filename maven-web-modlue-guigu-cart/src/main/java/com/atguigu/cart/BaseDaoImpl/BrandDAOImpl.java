package com.atguigu.cart.BaseDaoImpl;

import com.atguigu.cart.BaseDao.BrandDAO;
import org.aaa.JUtils.JdbcUtilsList;

import java.util.List;

/**
 * @Author:江Sir
 * @Date:22 2022/08/22 10:29
 * @description: Exercise
 * @Version 1.0.0
 */
public class BrandDAOImpl extends JdbcUtilsList implements BrandDAO {
    @Override
    public List<List> getBrandList() {
        return super.queryList("select * from tb_brand");
    }
}
