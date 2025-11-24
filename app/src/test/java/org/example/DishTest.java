package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DishTest {

    @Test
    public void testDishDescription() {
        Dish dish = new Dish("A test dish");
        assertEquals("A test dish", dish.description, "Dish description should match the constructor input");
    }
}
