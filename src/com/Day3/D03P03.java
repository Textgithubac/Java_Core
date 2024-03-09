package com.Day3;

import java.util.Scanner;

public class D03P03 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input array initialization
	        int[] A = new int[18];

	        // Input
	        System.out.println("Enter 18 elements separated by space:");
	        for (int i = 0; i < 18; i++) {
	            A[i] = scanner.nextInt();
	        }

	        // a. Compute the sum of elements from index 0 to 14 and store it in element 15
	        int sum = 0;
	        for (int i = 0; i < 15; i++) {
	            sum += A[i];
	        }
	        A[15] = sum;

	        // b. Compute the average of all numbers and store it at element 16
	        double average = (double) sum / 18;
	        A[16] = (int) Math.round(average);

	        // c. Identify the smallest value from the array and store it at element 17
	        int min = A[0];
	        for (int i = 1; i < 18; i++) {
	            if (A[i] < min) {
	                min = A[i];
	            }
	        }
	        A[17] = min;

	        // Output the updated array
	        for (int num : A) {
	            System.out.print(num + " ");
	        }
	    }


}
