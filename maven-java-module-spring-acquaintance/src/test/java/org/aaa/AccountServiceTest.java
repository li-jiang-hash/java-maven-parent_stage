package org.aaa;

import org.aaa.api.Account;
import org.aaa.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author:江Sir
 * @Date:02 2022/09/02 15:22
 * @description: Exercise
 * @Version 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;
    //测试查询
    @Test
    public void testFindById() {
        List<Account> account = accountService.findAll();
        System.out.println(account);
    }
}
