package org.aaa.imperial.court.service.impl;

import org.aaa.imperial.court.dao.api.MemorialsDao;
import org.aaa.imperial.court.dao.impl.MenorialsDaoImpl;
import org.aaa.imperial.court.entity.Memorials;
import org.aaa.imperial.court.service.api.MemorialsService;

import javax.swing.*;
import java.util.List;

/**
 * @Author:江Sir
 * @Date:14 2022/08/14 19:53
 * @description: Exercise
 * @Version 1.0.0
 */
public class MemorialsServiceImpl implements MemorialsService {
    private MemorialsDao memorialsDao = new MenorialsDaoImpl();

    @Override
    public List<Memorials> getAllMemorialsDigest() {
        return memorialsDao.selectAllMemorialsDigest();
    }

    @Override
    public Memorials getMemoriasDetailById(String memorialsId) {
        return memorialsDao.selectAllMemorialsById(memorialsId);
    }

    @Override
    public void updateMemorialsstatusToRead(String memorialsId) {
        memorialsDao.updateMemorialsstatusToRead(memorialsId);
    }

    @Override
    public void updateMemorialsFeedBack(String memorialsId, String feedbackContent) {
        memorialsDao.updateMemorialsFeedBack(memorialsId,feedbackContent);
    }
}
