package org.example;

public class DishStack {
    private Dish[] stackArray;
    private int top;
    private int capacity;

    // Constructor with a default capacity
    public DishStack(int capacity) {
        this.capacity = capacity;
        stackArray = new Dish[capacity];
        top = -1; // the stack is empty
    }

    // Default constructor with capacity of 10
    public DishStack() {
        this(10);
    }

    // push a Dish onto the stack
    public void push(Dish dish) {
        if (top == capacity - 1) {
            System.out.println("Stack is full! Cannot push more dishes.");
            return;
        }
        stackArray[++top] = dish;
    }

    // Pop a Dish from the stack
    public Dish pop() {
        if (top == -1) {
            System.out.println("Stack is empty! Cannot pop.");
            return null;
        }
        return stackArray[top--];
    }

    // peek at the top Dish without removing it
    public Dish peek() {
        if (top == -1) {
            System.out.println("Stack is empty! Nothing to peek.");
            return null;
        }
        return stackArray[top];
    }

    // Get current size of the stack
    public int size() {
        return top + 1;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }
}
