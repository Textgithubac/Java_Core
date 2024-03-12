package com.learning.core.Day7;
import java.util.Stack;
public class D07P07 {
	public static boolean isTopElementEven(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return false; // Stack is empty, return false
        } else {
            int topElement = stack.peek(); // Get the top element of the stack
            return topElement % 1 == 0; // Check if the top element is even
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] elements = {40, 30, 25, 15};

        // Push elements onto the stack
        for (int element : elements) {
            stack.push(element);
        }

        // Check if the top element is even
        boolean isEven = isTopElementEven(stack);
        System.out.println(" " + isEven);
    }
}
