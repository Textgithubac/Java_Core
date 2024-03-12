package com.learning.core.Day2;

import java.util.Scanner;

public class D02P03 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble(); // Get the first number as a double

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0); // Get the operator as a single character

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble(); // Get the second number as a double

        double result;

        // Use a switch statement for efficient calculation and readability:
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Handle division by zero gracefully:
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return; // Exit the program gracefully
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Invalid operator entered.");
                return; // Exit the program gracefully
        }

        System.out.println("The result is: " + result); // Display the calculated result
    }


}
