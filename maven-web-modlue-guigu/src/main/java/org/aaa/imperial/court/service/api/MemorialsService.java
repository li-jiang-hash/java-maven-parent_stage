package org.aaa.imperial.court.service.api;

import org.aaa.imperial.court.entity.Memorials;

import java.util.List;

/**
 * @Author:江Sir
 * @Date:14 2022/08/14 19:52
 * @description: Exercise
 * @Version 1.0.0
 */
public interface MemorialsService {
    List<Memorials> getAllMemorialsDigest();

    Memorials getMemoriasDetailById(String memorialsId);

    void updateMemorialsstatusToRead(String memorialsId);

    void updateMemorialsFeedBack(String memorialsId, String feedbackContent);
}
