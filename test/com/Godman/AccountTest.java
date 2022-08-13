package com.Godman;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

        @Test
        public void accountCanBeCreated(){
            //given that account exists
            //check that account exists
            Account account = new Account("1", "Godman Daniels", "1234");
            assertNotNull(account);
            assertEquals(0, account.getBalance("1234"));
        }
        @Test
        public void depositMoney_balanceIncreaseTest(){
            //given that i have account and the balance is zero
            //when i deposit 200
            //check that balance is 200
            Account godmanAccount = new Account("1", "Godman Daniels", "1234");
            assertEquals(0, godmanAccount.getBalance("1234"));
            godmanAccount.deposit(200);
            assertEquals(200, godmanAccount.getBalance("1234"));
        }
        @Test
        public void cannotDepositNegativeAmountTest(){
            // given i have an account and balance is zero
            // when i try to deposit -2500
            //check that balance is zero
            Account godmanAccount = new Account("1", "Godman Daniels", "1234");
            assertEquals(0, godmanAccount.getBalance("1234"));
            godmanAccount.deposit(-2500);
            assertEquals(0, godmanAccount.getBalance("1234"));
        }
        @Test
        @DisplayName("Getting balance with invalid pin returns zero")
        public void getBalanceWithWrongPin_ReturnZeroTest(){
            Account godmanAccount = new Account("1", "Godman Daniels", "1234");
            //given i have money in my account
            //when i check my balance with wrong pin
            //balance is zero
            godmanAccount.deposit(2000);
            int myBalance = godmanAccount.getBalance("1234");
            assertEquals(2000, myBalance);

        }
        @Test
        @DisplayName("Getting balance with invalid pin returns real balance")
        public void getBalanceWithWrongPin_ReturnRealBalanceTest(){
            Account godmanAccount = new Account("1", "Godman Daniels", "1234");
            //given i have money in my account
            //when i check my balance with wrong pin
            //balance is real
            godmanAccount.deposit(2000);
            godmanAccount.withdraw(1000, "1235");
            int myBalance = godmanAccount.getBalance("1234");
            assertEquals(2000, myBalance);
        }

        @Test
        public void withdrawMoneyWithRightPin_DecreaseBalanceTest(){
        Account godmanAccount = new Account("1","Godman Daniels", "1234");
        //given i have money in my account
        //when i withdraw  with right pin
        //check balance decreases
        godmanAccount.deposit(2000);
        godmanAccount.withdraw(1000, "1234");
        int balance =godmanAccount.getBalance("1234");
        assertEquals(1000, balance);
        }
       @Test
        public void withdrawMoneyWithRightPin_MoreThanAvailableBalanceTest(){
        Account godmanAccount = new Account("1","Godman Daniels", "1234");
        //given i have money in my account
        //when i withdraw  with right pin more than my available balance
        // balance return real balance
        godmanAccount.deposit(2000);
//        assertEquals(2000,godmanAccount.getBalance("1234"));
        godmanAccount.withdraw(3000, "1234");
        int balance = godmanAccount.getBalance("1234");
        assertEquals(2000, balance);

        }

}
