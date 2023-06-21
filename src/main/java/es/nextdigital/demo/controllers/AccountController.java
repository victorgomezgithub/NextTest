package es.nextdigital.demo.controllers;

import es.nextdigital.demo.models.AccountModel;
import es.nextdigital.demo.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    AccountService accountService;
    @GetMapping("/{id}")
    public AccountModel getAccountTransactions(@PathVariable int id) {

        return accountService.getAccountData(id);
    }
}
