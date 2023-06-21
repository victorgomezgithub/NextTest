package es.nextdigital.demo.models;

public class TransactionModel {

    public TransactionModel() { }

    public TransactionModel(int idTransaction, TypeOfTransaction typeOfTransaction, float amount) {
        this.idTransaction = idTransaction;
        this.typeOfTransaction = typeOfTransaction;
        this.ammount = amount;
    }

    public enum TypeOfTransaction {
        INGRESO, RETIRADA, COMISION, TRANSFERENCIA_ENT, TRANSFERENCIA_SAL
    }

    private int idTransaction;
    private TypeOfTransaction typeOfTransaction;
    private float ammount;

    public int getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(int idTransaction) {
        this.idTransaction = idTransaction;
    }

    public TypeOfTransaction getTypeOfTransaction() {
        return typeOfTransaction;
    }

    public void setTypeOfTransaction(TypeOfTransaction typeOfTransaction) {
        this.typeOfTransaction = typeOfTransaction;
    }

    public float getAmmount() {
        return ammount;
    }

    public void setAmmout(float ammount) {
        this.ammount = ammount;
    }
}
