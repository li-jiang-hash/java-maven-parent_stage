package org.aaa.imperial.court.dao.api;

import org.aaa.imperial.court.entity.Emp;

/**
 * @Author:江Sir
 * @Date:13 2022/08/13 18:12
 * @description: Exercise
 * @Version 1.0.0
 */
public interface EmpDao {
    Emp selectEmpByLoginAccount(String loginAccount, String encodedLoginPassword);
}
