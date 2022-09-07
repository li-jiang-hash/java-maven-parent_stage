package Dao;


import pojo.Account;

import java.util.List;

public interface AccountDao {
    public List<Account> findAll();
    int updateSave(Account account);
}
