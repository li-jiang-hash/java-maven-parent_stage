package com.aaa.dao;

import com.aaa.dao.api.User;

/**
 * @Author:江Sir
 * @Date:13 2022/08/13 18:12
 * @description: Exercise
 * @Version 1.0.0
 */
public class UserDaoImpl extends BaseDao<User> implements User {


    public User selectUserByLoginAccount(String userName, String passWord) {
        System.out.println(userName+"user");
        System.out.println(passWord+"pass");
        String sql= "select user_id userId, " +
                "user_name userName, " +
                "pass_word passWord " +
                "from user where user_name=? && pass_word=?;";

//        String sql= "select user_id, " +
//                "user_name, " +
//                "pass_word " +
//                "from user where user_name=\""+userName+"\"+"+" && pass_word=\""+passWord+"\";";
//        select user_id userId, user_name userName, pass_word passWord
//        from user
//        where
//                user_name="admin" && pass_word="123456"

//


        return super.getSingleBean(sql, User.class, userName, passWord);
    }
}
