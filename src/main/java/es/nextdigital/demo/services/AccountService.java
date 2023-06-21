package es.nextdigital.demo.services;

import es.nextdigital.demo.models.AccountModel;
import es.nextdigital.demo.utils.Utils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AccountService {

    public AccountModel getAccountData(int id) {
        // This class should have a repository autowired that
        // could retrieve the data from the DataBase
        ArrayList<AccountModel> accounts = Utils.getAccountMockData();

        return accounts.stream()
                .filter(account -> account.getIdAccount() == id)
                .findFirst()
                .get();
    }

}
