package org.example;

public class App {
    public static void main(String[] args) {
        DishStack stack = new DishStack();

        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        Dish blueDish = new Dish("A dish with a blue fish pattern on it");

        // The variable stackSize should equal zero
        int stackSize = stack.size();
        System.out.println("Initial stack size: " + stackSize);

        stack.push(oneDish);
        stack.push(twoDish);
        stack.push(redDish);
        stack.push(blueDish);

        // The variable sizeAfterPushes should equal four
        int sizeAfterPushes = stack.size();
        System.out.println("Stack size after pushes: " + sizeAfterPushes);

        // The variable peekedDish should have a description of "A dish with a blue fish pattern on it"
        Dish peekedDish = stack.peek();
        System.out.println("Peeked dish: " + peekedDish.description);

        // The variable poppedDish should have a description of "A dish with a blue fish pattern on it"
        Dish poppedDish = stack.pop();
        System.out.println("Popped dish: " + poppedDish.description);

        // The variable anotherPoppedDish should have a description of "A dish with a red fish pattern on it"
        Dish anotherPoppedDish = stack.pop();
        System.out.println("Another popped dish: " + anotherPoppedDish.description);

        // The variable finalSize should equal two
        int finalSize = stack.size();
        System.out.println("Final stack size: " + finalSize);

    }
}
