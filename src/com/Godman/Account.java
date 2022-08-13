package com.Godman;

public class Account {
    private String number;
    private String name;

    public String getPin() {
        return pin;
    }

    private String pin;

    private int balance;


    public Account(String accountNumber, String accountName, String accountPin){
        pin = accountPin;
        name = accountName;
        number =accountNumber;
    }
    public void deposit(int amount){
        if (amount > 0)balance = (getBalance(pin) + amount);
    }
    public int getBalance(String pin) {
        if (pin.equals(this.pin)) {
            return balance;
        } else {
            return 0;
        }
    }
    public void withdraw(int amount, String pin){
        boolean isValid = balance > amount && amount > 0;
        if (pin.equals(this.pin) &&  isValid)
            balance -= amount;
    }

    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
}
