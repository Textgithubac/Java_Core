package com.learning.core.Day7;
import java.util.Stack;


public class D07P03 {
	 public static String reverseString(String input) {
	        Stack<Character> stack = new Stack<>();

	        // Push characters onto the stack
	        for (int i = 0; i < input.length(); i++) {
	            stack.push(input.charAt(i));
	        }

	        // Pop characters from the stack to form the reversed string
	        StringBuilder reversedString = new StringBuilder();
	        while (!stack.isEmpty()) {
	            reversedString.append(stack.pop());
	        }

	        return reversedString.toString();
	    }

	    public static void main(String[] args) {
	        String input = "JavaQuiz";
	        String reversed = reverseString(input);
	        System.out.println(" " + input);
	        System.out.println(" " + reversed);
	    }

}
