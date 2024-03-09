package com.Day2;

import java.util.Scanner;

public class D02P07 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the percentage obtained by the student: ");
	        double percentage = scanner.nextDouble();

	        if (percentage >= 60) {
	            System.out.println("A Grade");
	        } else if (percentage >= 45) {
	            System.out.println("B Grade");
	        } else if (percentage >= 35) {
	            System.out.println("C Grade");
	        } else {
	            System.out.println("Fail");
	        }
	    }

}
