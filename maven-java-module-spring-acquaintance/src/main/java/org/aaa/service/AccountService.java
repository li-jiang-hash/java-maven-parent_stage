package org.aaa.service;

import org.aaa.api.Account;

import java.util.List;

/**
 * @Author:江Sir
 * @Date:01 2022/09/01 19:00
 * @description: Exercise
 * @Version 1.0.0
 */
public interface AccountService {
    public List<Account> findAll();

    public Account findById(Integer id);

    public void save(Account account);

    public void update(Account account);

    public void delete(Integer id);
}
