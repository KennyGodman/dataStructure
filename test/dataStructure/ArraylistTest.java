package dataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//class ArraylistTest {
//
//    @Test
//    public void newListIsEmptyTest() {
//        List list = new Arraylist();
//        assertTrue(list.isEmpty());
//    }
//
//    @Test
//    public void addItemListIsNotEmptyTest() {
//        List list = new Arraylist();
//        list.add("Loud");
//        assertFalse(list.isEmpty());
//    }
//
//    @Test
//    public void addItemListIsNotEmpty_SizeIsOneTest() {
//        List list = new Arraylist();
//        list.add("Loud");
//        assertFalse(list.isEmpty());
//        assertEquals(1, list.size());
//
//    }
//
//    @Test
//    public void addItemLGetItemByIndexTest() {
//        List list = new Arraylist();
//        list.add("Louds");
////        assertFalse(list.isEmpty());
////        assertEquals(1,list.size());
//        String savedItem = list.get(0);
//        assertEquals("Loud", savedItem);
//    }
//
//    @Test
//    public void addXYGetXYTest() {
//        List list = new Arraylist();
//        list.add("Loud");
//        list.add("louds");
//        assertEquals("loud", list.get(0));
//        assertEquals("loud", list.get(1));
//
//    }
//
//    @Test
//    public void addXYRemoveXYTest() {
//        List list = new Arraylist();
//        list.add("Loud");
//        list.add("louds");
//        list.remove(1);
//        assertEquals(1, list.size());
//    }
//
//    @Test
//    public void addXYRemoveYFindByIndexIsNullTest() {
//        List list = new Arraylist();
//        list.add("Loud");
//        list.add("louds");
//        list.remove(1);
//        assertEquals(1, list.size());
//        String deletedItem = list.get(1);
//        assertNull(deletedItem);
//    }
//}