package org.aaa.dao;


import org.aaa.api.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author:江Sir
 * @Date:29 2022/08/29 21:49
 * @description: Exercise
 * @Version 1.0.0
 */
public interface UserMapper {

//    public List<Order> findByUid1(Integer uid);


    List<UserOrder> findAllWithOrder();
    List<UserRole> findAllWithRole();
    List<RoleTest> findAllWithRoleTest();
    List<UserOrder> findAllWithOrder1();
    List<Order> findByUid(@Param("id") Integer uid);


}
