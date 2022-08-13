package com.Godman;

public class Bank {
    private String name;

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    private String pin;
    private String number;

    private int numberOfCustomer;
    private final Account[] accounts = new Account[10];

    public Bank(String accountName, String accountPin, String accountNumber) {
        number = accountNumber;
        pin = accountPin;
        name = accountName;
    }

    public void createAccountFor(String accountName, String pin) {
//        numberOfCustomer++;
        Account account = new Account((numberOfCustomer + 1) + "", accountName, pin);
        accounts[numberOfCustomer] = account;
        numberOfCustomer++;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomer;
    }

    public Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getNumber().equals(accountNumber))
                return account;
        }
        return null;
    }

    public void deposit(int amount, String accountNumber) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);

    }

    public Account withdraw(int amount, String accountNumber) {
        Account account = findAccount(accountNumber);
        account.withdraw(amount, account.getPin());
        return account;
    }
}
