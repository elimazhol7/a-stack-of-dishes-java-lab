package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DishStackTest {

    private DishStack stack;
    private Dish dish1;
    private Dish dish2;
    private Dish dish3;

    @BeforeEach
    public void setUp() {
        stack = new DishStack(3); // Small stack to test full behavior
        dish1 = new Dish("Dish 1");
        dish2 = new Dish("Dish 2");
        dish3 = new Dish("Dish 3");
    }

    @Test
    public void testPushAndSize() {
        assertEquals(0, stack.size(), "Initial stack size should be 0");
        stack.push(dish1);
        assertEquals(1, stack.size(), "Stack size should be 1 after one push");
        stack.push(dish2);
        assertEquals(2, stack.size(), "Stack size should be 2 after two pushes");
    }

    @Test
    public void testPeek() {
        stack.push(dish1);
        stack.push(dish2);
        Dish topDish = stack.peek();
        assertEquals(dish2, topDish, "Peek should return the top element without removing it");
        assertEquals(2, stack.size(), "Size should remain unchanged after peek");
    }

    @Test
    public void testPop() {
        stack.push(dish1);
        stack.push(dish2);
        Dish popped = stack.pop();
        assertEquals(dish2, popped, "Pop should return the last pushed dish");
        assertEquals(1, stack.size(), "Size should decrease after pop");
        popped = stack.pop();
        assertEquals(dish1, popped, "Pop should return the next dish");
        assertTrue(stack.isEmpty(), "Stack should be empty after popping all elements");
    }

    @Test
    public void testPushWhenFull() {
        stack.push(dish1);
        stack.push(dish2);
        stack.push(dish3);
        assertTrue(stack.isFull(), "Stack should be full");
        stack.push(new Dish("Extra Dish")); // Should print a message but not throw
        assertEquals(3, stack.size(), "Size should not change when pushing onto full stack");
    }

    @Test
    public void testPopWhenEmpty() {
        assertNull(stack.pop(), "Pop from empty stack should return null");
    }

    @Test
    public void testPeekWhenEmpty() {
        assertNull(stack.peek(), "Peek from empty stack should return null");
    }
}
