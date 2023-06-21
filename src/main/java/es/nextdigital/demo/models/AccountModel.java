package es.nextdigital.demo.models;

import java.util.ArrayList;

// This model classes should be decorated with @Model annotation
public class AccountModel {

    private int idAccount;
    private ArrayList<TransactionModel> transactions = new ArrayList<>();

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public ArrayList<TransactionModel> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<TransactionModel> transactions) {
        this.transactions = transactions;
    }
}
