package org.aaa.imperial.court.service.impl;

import org.aaa.imperial.court.dao.api.EmpDao;
import org.aaa.imperial.court.dao.impl.EmpDaoImpl;
import org.aaa.imperial.court.entity.Emp;
import org.aaa.imperial.court.exception.LoginFailedException;
import org.aaa.imperial.court.service.api.EmpService;
import org.aaa.imperial.court.util.ImperialCourtConst;
import org.aaa.imperial.court.util.MD5Util;

/**
 * @Author:江Sir
 * @Date:14 2022/08/14 17:08
 * @description: Exercise
 * @Version 1.0.0
 */
public class EmpServiceImpl implements EmpService {
    private EmpDao empDao = new EmpDaoImpl();


    @Override
    public Emp getEmpByLoginAccount(String loginAccount, String loginPassword) {
        //1、对密码执行加密
        String encodedLoginPassword = MD5Util.encode(loginPassword);

        //2、根据账户和加密密码查询数据库
        Emp emp = empDao.selectEmpByLoginAccount(loginAccount, encodedLoginPassword);
        //3、检查Emp对象是否为nuLL
        if (emp != null) {
            //①不为nuLL：返回Emp
            return emp;
        } else {
            //②为nuLL:抛登录失败异常
            throw new LoginFailedException(ImperialCourtConst.LOGIN_FAILED_MESSAGE);
        }
    }
}
