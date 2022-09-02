package org.aaa.imperial.court.dao.api;

import org.aaa.imperial.court.entity.Memorials;

import java.util.List;

/**
 * @Author:江Sir
 * @Date:13 2022/08/13 18:14
 * @description: Exercise
 * @Version 1.0.0
 */
public interface MemorialsDao {
    List<Memorials> selectAllMemorialsDigest();

    Memorials selectAllMemorialsById(String memorialsId);

    void updateMemorialsstatusToRead(String memorialsId);

    void updateMemorialsFeedBack(String memorialsId, String feedbackContent);
}
