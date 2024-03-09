package com.Day3;
import java.util.Scanner;

public class D03P02 {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Accepting two numbers from the user
	        System.out.println("Enter two numbers between 1 and 40:");
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        
	        // Array containing five integer elements
	        int[] array = {7, 25, 5, 19, 30};
	        
	        // Checking if both numbers are found in the array
	        boolean foundNum1 = false;
	        boolean foundNum2 = false;
	        
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == num1) {
	                foundNum1 = true;
	            }
	            if (array[i] == num2) {
	                foundNum2 = true;
	            }
	        }
	        
	        // Displaying the output
	        if (foundNum1 && foundNum2) {
	            System.out.println("It's Bingo");
	        } else {
	            System.out.println("Not found");
	        }
	        
	        scanner.close();
	    }

}
