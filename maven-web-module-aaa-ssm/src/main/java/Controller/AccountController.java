package Controller;

import Dao.AccountDao;
import Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Account;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
//            List<Account> list = new ArrayList<>();
//            list.add(new Account(1,"张三",1000d));
//            list.add(new Account(2,"李四",1000d));
        List<Account> list = accountService.findAll();
        model.addAttribute("list", list);
        return "list";
    }
    @RequestMapping("/save")
    public String save(Account account){
        int i = accountService.updateSave(account);
        return "list";
    }
}
