package Service;

import pojo.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();

    int updateSave(Account account);
}
