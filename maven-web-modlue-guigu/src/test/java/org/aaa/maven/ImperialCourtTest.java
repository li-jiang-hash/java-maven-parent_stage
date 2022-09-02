package org.aaa.maven;

import org.aaa.imperial.court.dao.BaseDao;
import org.aaa.imperial.court.entity.Emp;
import org.aaa.imperial.court.util.JDBCUtils;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.sql.Connection;
import java.util.List;

/**
 * @Author:江Sir
 * @Date:13 2022/08/13 16:28
 * @description: Exercise
 * @Version 1.0.0
 */
public class ImperialCourtTest {

    private BaseDao<Emp> baseDao = new BaseDao<>();

    @Test
    public void testGetSingleBean(){
        String sql ="select emp_id empId,emp_name empName,emp_position empPosition,login_account loginAccount,login_password loginPassword from t_emp where emp_id=?";
        Emp emp = baseDao.getSingleBean(sql, Emp.class, 8);
        System.out.println("emp="+emp);
    }
    @Test
    public void testGetBeanList(){
        String sql ="select emp_id empId,emp_name empName,emp_position empPosition,login_account loginAccount,login_password loginPassword from t_emp";
        List<Emp> beanList = baseDao.getBeanList(sql, Emp.class);
        for(Emp emp:beanList) {
            System.out.println("emp="+emp);
        }
    }
    @Test
    public void testUpdate ( ) {
        String sql = "update t_memorials set memorials_status=? where memorials_id=?";
        String memorialsStatus = "0";
        String memorialsId= "15";

        int val = baseDao.update(sql, memorialsStatus, memorialsId);
        System.out.println("val="+val);
    }

    @Test
    public void testGetConnection() {
        Connection connection = JDBCUtils.getConnection();
        System.out.println("connection=" + connection);


        JDBCUtils.releaseConnection(connection);

    }

    @Test
    public void testSubString(){
        String subdtring = "aa.aaa.png".substring("aaa.png".lastIndexOf("."));
        System.out.println(subdtring);
    }



}
