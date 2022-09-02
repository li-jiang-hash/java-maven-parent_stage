package org.aaa.Impl;

import org.aaa.api.Account;
import org.aaa.dao.AccountDao;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author:江Sir
 * @Date:01 2022/09/01 18:53
 * @description: Exercise
 * @Version 1.0.0
 */
@Repository
public class AccountDaoIpml implements AccountDao {
    @Autowired
    private QueryRunner queryRunner;

    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    @Override
    public List<Account> findAll() {
        List<Account> list = null;    /* 编写sql */
        String sql = "select * from account";
        try {      /* 执行sql */
            list = queryRunner.query(sql, new BeanListHandler<Account>(Account.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Account findById(Integer id) {
        Account account = null;    /* 编写sql */
        String sql = "select * from account where id = ?";
        try {      /* 执行sql */
            account = queryRunner.query(sql, new BeanHandler<Account>(Account.class), id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return account;
    }

    @Override
    public void save(Account account) {    /* 编写sql */
        String sql = "insert into account values(null,?,?)";    /* 执行sql */
        try {
            queryRunner.update(sql, account.getName(), account.getMoney());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Account account) {      /* 编写sql */
        String sql = "update account set name = ?,money = ? where id = ?";      /* 执行sql */
        try {
            queryRunner.update(sql, account.getName(), account.getMoney(), account.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) {    /* 编写sql */
        String sql = "delete from account where id = ?";    /* 执行sql */
        try {
            queryRunner.update(sql, id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
