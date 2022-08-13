package com.Godman.Gross;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SalesTest {
    private SalesPerson john;
    private Item iphone;

    private Item[] itemsSold = new Item[1];

    @BeforeEach
    public void setUp(){
        john = new SalesPerson();
        iphone = new Item(1000);
        itemsSold [0] = iphone;
//        john.setSoldItems(itemsSold);
////      Item[] itemsSold = new Item [5];
////
//
    }
    @Test
    public void addItem(){
        assertNull(john.getSoldItems());
        itemsSold[0] = iphone;
        john.setSoldItems(itemsSold);
        assertEquals(1, john.getSoldItems().length);
    }

    @Test
    public void calculateEarnings(){
//        assertEquals(1, john.getSoldItems().length);
        Item itemSold = john.getSoldItems()[0];
        assertEquals(1000, itemSold.getValueSold());
        assertEquals(290, john.calculateEarnings());
    }
    @Test
    public void calculateEarningsWithMultipleItems(){
        assertEquals(1, john.getSoldItems().length);
        Item itemSold = john.getSoldItems()[0];
        assertEquals(1000, itemSold.getValueSold());
//        assertEquals(290, john.calculateEarnings());

        Item samsung = new Item (2000);
        Item itel = new Item (200);
        Item dell = new Item (5000);
        Item hp = new Item (4500);

       Item [] itemsSold = {iphone, samsung, itel, dell, hp};
       john.setSoldItems(itemsSold);
       assertEquals(5, john.getSoldItems().length);
        assertEquals(1343, john.calculateEarnings());
    }
}
