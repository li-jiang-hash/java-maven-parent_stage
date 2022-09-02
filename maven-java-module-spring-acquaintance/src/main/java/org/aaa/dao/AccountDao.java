package org.aaa.dao;

import org.aaa.api.Account;

import java.util.List;

/**
 * @Author:江Sir
 * @Date:01 2022/09/01 18:51
 * @description: Exercise
 * @Version 1.0.0
 */
public interface AccountDao {
    List<Account> findAll();

    Account findById(Integer id);

    void save(Account account);

    void update(Account account);

    void delete(Integer id);
}
