package org.aaa.imperial.court.dao.impl;

import org.aaa.imperial.court.dao.BaseDao;
import org.aaa.imperial.court.dao.api.EmpDao;
import org.aaa.imperial.court.entity.Emp;

/**
 * @Author:江Sir
 * @Date:13 2022/08/13 18:12
 * @description: Exercise
 * @Version 1.0.0
 */
public class EmpDaoImpl extends BaseDao<Emp> implements EmpDao {

    @Override
    public Emp selectEmpByLoginAccount(String loginAccount, String encodedLoginPassword) {
        String sql= "select emp_id empId, " +
                "emp_name empName, " +
                "emp_position empPosition, " +
                "login_account loginAccount, " +
                "login_password loginPassword " +
                "from t_emp where login_account=? and login_password=?";

//

        Emp singleBean = super.getSingleBean(sql, Emp.class, loginAccount, encodedLoginPassword);
        System.out.println(singleBean);
        return singleBean;
    }
}
