package es.nextdigital.demo.services;

import es.nextdigital.demo.models.AccountModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;


@SpringBootTest
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void getAccountWithId() {
        AccountModel account = accountService.getAccountData(1);

        Assertions.assertEquals(1, account.getIdAccount());
    }

}
