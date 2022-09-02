package com.aaa.mybatis;




import com.aaa.mybatis.api.Mybatis_User;

import java.util.List;

/**
 * @Author:江Sir
 * @Date:26 2022/08/26 16:38
 * @description: Exercise
 * @Version 1.0.0
 */
public interface UserMapper {
//    List filendAll();

    int insertUser();
    int updateUser();

    int deleteUser();

    Mybatis_User getUSerById();

    List<Mybatis_User> getAllUser();
}
