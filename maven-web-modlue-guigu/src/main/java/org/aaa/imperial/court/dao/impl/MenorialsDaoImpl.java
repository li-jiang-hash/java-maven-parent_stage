package org.aaa.imperial.court.dao.impl;

import org.aaa.imperial.court.dao.BaseDao;
import org.aaa.imperial.court.dao.api.MemorialsDao;
import org.aaa.imperial.court.entity.Memorials;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author:江Sir
 * @Date:13 2022/08/13 18:14
 * @description: Exercise
 * @Version 1.0.0
 */
public class MenorialsDaoImpl extends BaseDao<Memorials> implements MemorialsDao {
    @Override
    public List<Memorials> selectAllMemorialsDigest() {
        String sql = "select memorials_id memorialsId,\n" +
                "    memorials_title memorialsTitle,\n" +
//                "    concat(left(memorials_content,10),\"...\") memorialsContent,\n" +
                "    concat(left(memorials_content,10),\"...\") memorialsContentDigest,\n" +
                "    emp_name memorialsEmpName,\n" +
                "    memorials_create_time memorialsCreateTime,\n" +
                "    memorials_status memorialsStatus\n" +
                "from t_memorials m left join t_emp e on m.memorials_emp=e.emp_id;";

        return getBeanList(sql,Memorials.class);
    }

    @Override
    public Memorials selectAllMemorialsById(String memorialsId) {

        String sql = "select memorials_id memorialsId,\n" +
                "    memorials_title memorialsTitle,\n" +
                "    memorials_content memorialsContent,\n" +
                "    emp_name memorialsEmpName,\n" +
                "    memorials_create_time memorialsCreateTime,\n" +
                "    memorials_status memorialsStatus,\n" +
                "    feedback_time feedbackTime,\n" +
                "    feedback_content feedbackContent\n" +
                "from t_memorials m left join t_emp e on m.memorials_emp=e.emp_id " +
                "where memorials_id=?;";
        System.out.println(getSingleBean(sql, Memorials.class, memorialsId));
        return getSingleBean(sql, Memorials.class, memorialsId);


    }

    @Override
    public void updateMemorialsstatusToRead(String memorialsId) {
        String sql = "update t_memorials set memorials_status=1 where memorials_id=?";
        super.update(sql,memorialsId);
    }

    @Override
    public void updateMemorialsFeedBack(String memorialsId, String feedbackContent) {
        String feedbackTime = new SimpleDateFormat("yyy-MM-dd").format(new Date());

//        String sql = "select t_memorials set memorials_status=2,feedback_content?,feedback_time=? where memorials_id=?;";

        String sql = "update t_memorials set memorials_status=2,feedback_content=?,feedback_time=? where memorials_id=?";
        update(sql,feedbackContent,feedbackTime,memorialsId);

    }
}
