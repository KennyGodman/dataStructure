import dataStructure.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    Stack stack;
    @BeforeEach
    public void setUp() {
        stack = new Stack();
    }
    @Test
    public void testThatStackIsEmpty(){
        assertTrue(stack.isEmpty());
    }
    @Test
    public void testThatStackIsNotEmpty(){
        stack.push("Glasses");
        assertFalse(stack.isEmpty());
    }
    @Test
    public void testThatStackCnBeSetAtASpecificIndex(){
        stack.set(1,"Phone");
        assertEquals("Phone",stack.get(1));
    }
    @Test
    public void testThatItemsCanBeAddedToStack() {
        stack.push("Phone");
        assertEquals("Phone", stack.get(0));
    }
    @Test
    public void testForStackSize(){
        stack.push("Glasses");
        stack.push("Phone");
        stack.push("Laptop");
        stack.push("Colone");

        assertEquals(4,stack.size());
    }

    @Test
    public void testToSearchForAnElementInStack(){
        stack.push("Glasses");
        stack.push("Phone");
        stack.push("Laptop");
        stack.push("Colone");
        assertEquals(1,stack.search("Colone"));
    }



}
