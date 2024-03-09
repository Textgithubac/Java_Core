package com.Day2;
import java.util.Scanner;

public class D02P14 {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the base number: ");
	        int base = scanner.nextInt();

	        System.out.print("Enter the exponent: ");
	        int exponent = scanner.nextInt();

	        // Calculate the power using a loop
	        int result = 1;
	        for (int i = 0; i < exponent; i++) {
	            result *= base;
	        }

	        System.out.println("The power of " + base + " raised to " + exponent + " is: " + result);

	        // Example of if-else statement
	        if (exponent == 0) {
	            System.out.println("Any number raised to the power of 0 is 1.");
	        } else if (exponent < 0) {
	            System.out.println("This program cannot calculate negative exponents.");
	        }

	        // Example of switch statement
	        switch (exponent) {
	            case 0:
	                System.out.println("Any number raised to the power of 0 is 1.");
	                break;
	            case 1:
	                System.out.println("Any number raised to the power of 1 is the number itself.");
	                break;
	            default:
	                // No specific message for other exponents
	        }
	    }

}
