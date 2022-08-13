package com.Godman.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StoreTest {
    private StoreCustomer kenny;
    private StoreCustomer isreal;
    private StoreCustomer lekan;

    @BeforeEach
    public void setUp(){
        kenny = new StoreCustomer();
        kenny.setAccountNumber(1);
        kenny.setBalance(2000);
        kenny.setCreditLimit(1000);
        kenny.setTotalItemsCharged(2000);
        kenny.setTotalCreditApplied(1000);

        isreal = new StoreCustomer(2,6000,8000,0,10000);
        lekan = new StoreCustomer(3, 3000,5000,300,2000);
        }
    @Test
   public void calculateBalance(){
    int balance = kenny.calculateBalance();
    assertEquals(2000, kenny.getBalance());
}
   @Test
  public void calculateBalanceWithNegativeBalance(){

        kenny.calculateBalance();
        assertEquals(0, kenny.getBalance());
    }

    @Test
    public  void checkCreditLimitExceeded(){
        kenny.calculateBalance();
        boolean exceeded = kenny.isCreditLimitExceeded();
        assertFalse(exceeded);
    }
    @Test
    public void checkCreditLimitExceededWith(){
        kenny.setTotalItemsCharged(2000);
        kenny.calculateBalance();
        assertEquals(10000, kenny.getBalance());
        boolean exceeded = kenny.isCreditLimitExceeded();
    }
@Test
        public void checkresult(){
    StoreCustomer [] customers = { kenny, isreal, lekan};
    for ( int i = 0; i< customers.length; i++){
        StoreCustomer customer = customers[i];
        customer.calculateBalance();
        if(customer.isCreditLimitExceeded()){
            System.out.println("Credit Limit is Exceeded");
        }

        }
    }
}