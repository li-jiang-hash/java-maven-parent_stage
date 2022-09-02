package org.aaa.dao;

import org.aaa.api.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @Author:江Sir
 * @Date:31 2022/08/31 08:38
 * @description: Exercise
 * @Version 1.0.0
 */
public interface CacheMapper {
    Emp getEmpByid(@Param("eid") Integer eid);

    int insertEmp(Emp emp);
}
