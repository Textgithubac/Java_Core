package com.Day2;
import java.util.Scanner;

public class D02P16 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();

	        if (n <= 0) {
	            System.out.println("Invalid input");
	        } else if (n == 1) {
	            System.out.println("0");
	        } else if (n == 2) {
	            System.out.println("0, 1");
	        } else {
	            int first = 0, second = 1;
	            System.out.print("0, 1");
	            for (int i = 3; i <= n; i++) {
	                int next = first + second;
	                System.out.print(", " + next);
	                first = second;
	                second = next;
	            }
	            System.out.println();
	        }
	    }

	 
}
