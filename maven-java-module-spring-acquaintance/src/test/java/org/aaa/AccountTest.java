package org.aaa;

import org.aaa.api.Account;
import org.aaa.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:江Sir
 * @Date:01 2022/09/01 19:32
 * @description: Exercise
 * @Version 1.0.0
 */
public class AccountTest {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = applicationContext.getBean(AccountService.class);  /* 测试保存 */

        @Test
        public void testSave() {
            Account account = new Account();
            account.setName("lj");
            account.setMoney(100d);
            accountService.save(account);
        }
    }
