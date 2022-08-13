package dataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class VectorTest {
    Vector vector;

    @BeforeEach
    public void setUp() {
        vector = new Vector();

    }

    @Test
    public void testThatListIsEmpty() {
        assertTrue(vector.isEmpty());
    }

    @Test
    public void testThatItemCanBeAddedToList() {
        vector.add("Glasses");
        vector.add("Laptop");
        vector.add("Phone");
        vector.add("Colone");
        assertFalse(vector.isEmpty());
    }

    @Test
    public void testThatItemCanBeGottenFromTheList() {
        vector.add("Glasses");
        vector.add("Laptop");
        vector.add("Phone");
        vector.add("Colone");
        assertEquals("Glasses", vector.get(0));
    }

    @Test
    public void testThatItemCanBeRemovedFromListByIndex() {
        vector.add("Glasses");
        vector.add("Laptop");
        vector.add("Phone");
        vector.add("Colone");
        vector.remove(0);
        assertEquals(null, vector.get(0));
    }

    @Test
    public void testThatListCanBeCleared() {
        vector.add("Glasses");
        vector.add("Laptop");
        vector.add("Phone");
        vector.add("Colone");
        vector.clear();
        assertTrue(vector.isEmpty());
    }

    @Test
    public void testThatSizeOfListCanBeGotten() {
        vector.add("Glasses");
        vector.add("Laptop");
        vector.add("Phone");
        vector.add("Colone");
        assertEquals(4, vector.size());
    }

    @Test
    public void testThatItemCanBeRemoved() {
        vector.add("Glasses");
        vector.add("Laptop");
        vector.add("Phone");
        vector.add("Colone");
        vector.remove("Glasses");
        assertEquals(null, vector.get(0));

    }

    @Test
    public void testThatListContainsSpecificItem() {
        vector.add("Glasses");
        vector.add("Laptop");
        vector.add("Phone");
        vector.add("Colone");
        assertTrue(vector.contains("Glasses"));

    }

    @Test
    public void testThatListDoestNotContainsElementNotAddedToTheList() {
        vector.add("Glasses");
        vector.add("Laptop");
        vector.add("Phone");
        vector.add("Colone");
        assertFalse(vector.contains("eeee"));

    }

    @Test
    public void testThatListCanBeAddedByItemAndIndex() {
        vector.add(0, "Glasses");
        vector.add(1, "Laptop");
        vector.add(1, "Phone");
        vector.add(1,"Colone");
        assertEquals("Phone", vector.get(1));
    }

    @Test
    public void testThatItemCanReplaceItemAtASpecificIndexWithoutReplacement() {
        vector.add(0, "Glasses");
        vector.add(1, "Laptop");
        vector.add(1, "Phone");
        vector.add(1,"Colone");
        assertEquals("Laptop", vector.get(2));
    }
}



