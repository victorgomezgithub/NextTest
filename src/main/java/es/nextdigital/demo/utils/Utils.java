package es.nextdigital.demo.utils;

import es.nextdigital.demo.models.AccountModel;
import es.nextdigital.demo.models.TransactionModel;

import java.util.ArrayList;

public class Utils {

    public static ArrayList<AccountModel> getAccountMockData() {
        ArrayList<AccountModel> accounts = new ArrayList<>();
        accounts.add(getAccountModelMockData(1));
        accounts.add(getAccountModelMockData(2));
        return accounts;
    }

    private static AccountModel getAccountModelMockData(int id) {
        AccountModel accountModel = new AccountModel();
        accountModel.setIdAccount(id);
        accountModel.getTransactions().add(new TransactionModel(1, TransactionModel.TypeOfTransaction.RETIRADA, -100));
        accountModel.getTransactions().add(new TransactionModel(2, TransactionModel.TypeOfTransaction.INGRESO, +100));
        return accountModel;
    }
}
