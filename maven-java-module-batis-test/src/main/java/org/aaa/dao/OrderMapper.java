package org.aaa.dao;

import org.aaa.api.OrderUser;
import org.aaa.api.User;

import java.util.List;

/**
 * @Author:江Sir
 * @Date:29 2022/08/29 19:40
 * @description: Exercise
 * @Version 1.0.0
 */
public interface OrderMapper {
    List<OrderUser> findAllWithUser();





    //以下为嵌套查询
    List findAllWithUser1();
    User findById(Integer id);

}
