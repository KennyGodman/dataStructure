package com.Godman.store;

public class StoreCustomer {
    private int accountNumber;
    private int balance;
    private int totalItemsCharged;
    private int  totalCreditApplied;
    private int creditLimit;


    public StoreCustomer(){

    }

    public StoreCustomer(int accountNumber, int balance, int totalItemsCharged, int totalCreditApplied, int creditLimit){
        this.accountNumber= accountNumber;
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.totalCreditApplied = totalCreditApplied;
        this.totalItemsCharged = totalItemsCharged;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTotalItemsCharged() {
        return totalItemsCharged;
    }

    public void setTotalItemsCharged(int totalItemsCharged) {
        this.totalItemsCharged = totalItemsCharged;
    }

    public int getTotalCreditApplied() {
        return totalCreditApplied;
    }

    public void setTotalCreditApplied(int totalCreditApplied) {
        this.totalCreditApplied = totalCreditApplied;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }


    public int calculateBalance() {
        int balance = getBalance() * totalItemsCharged - creditLimit;
        setBalance(balance);
        return getBalance();
    }
    public boolean isCreditLimitExceeded(){
        boolean result = false;
        if(getBalance() > getCreditLimit()){
            result = true;
        }
    return result;
}

    }

