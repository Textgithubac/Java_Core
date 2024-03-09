package com.Day2;
import java.util.Scanner;


public class D02P13Switch {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int factorial = 1;

	        switch (number) {
	            case 0:
	                factorial = 1;
	                break;
	            case -1:
	                System.out.println("Factorial is not defined for negative numbers.");
	                break;
	            default:
	                for (int i = 1; i <= number; i++) {
	                    factorial *= i;
	                }
	        }

	        System.out.println("Factorial of " + number + " is " + factorial);
	    }
	}

