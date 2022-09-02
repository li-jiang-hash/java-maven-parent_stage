package org.aaa.imperial.court.service.api;

import org.aaa.imperial.court.entity.Emp;

/**
 * @Author:江Sir
 * @Date:14 2022/08/14 17:07
 * @description: Exercise
 * @Version 1.0.0
 */
public interface EmpService {
    Emp getEmpByLoginAccount(String loginAccount, String loginPassword);
}
