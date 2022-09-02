package org.aaa.dao;

import org.aaa.api.Emp;
import org.aaa.api.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author:江Sir
 * @Date:30 2022/08/30 20:38
 * @description: Exercise
 * @Version 1.0.0
 */
public interface DynamicSQL {
    List<Emp> getEmpByCondition(Emp emp);


    /**
     * 测试choose，when、otherwise
     * 相当于 if(){}esle if(){}else{}
     */
    List<Emp> getEmpByChoose(Emp emp);

    /**
     * 通过数组实现批量删除
     * @param eids
     * @return
     */
    int deleteMoreByArray(@Param("eids") Integer eids[]);


    /**
     * 通过list实现批量添加
     */
    int inisertMoreByList(@Param("emps") List<Emp> emp);
}
