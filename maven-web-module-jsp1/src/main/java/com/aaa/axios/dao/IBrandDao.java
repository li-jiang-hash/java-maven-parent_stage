package com.aaa.axios.dao;

import java.util.List;
import java.util.Map;

/**
 * @Author:江Sir
 * @Date:20 2022/08/20 09:30
 * @description: Exercise
 * @Version 1.0.0
 */
public interface IBrandDao {

    List<Map> queryLimit(int begin,int limit);
    List<Map> queryall();
}
