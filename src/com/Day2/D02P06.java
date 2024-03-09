package com.Day2;

import java.util.Scanner;

public class D02P06 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number representing the week day (1 for Monday, 2 for Tuesday, ..., 7 for Sunday): ");
	        int day = scanner.nextInt();

	        if (day >= 1 && day <= 7) {
	            String weekday;
	            if (day == 1) {
	                weekday = "Monday";
	            } else if (day == 2) {
	                weekday = "Tuesday";
	            } else if (day == 3) {
	                weekday = "Wednesday";
	            } else if (day == 4) {
	                weekday = "Thursday";
	            } else if (day == 5) {
	                weekday = "Friday";
	            } else if (day == 6) {
	                weekday = "Saturday";
	            } else {
	                weekday = "Sunday";
	            }
	            System.out.println("Weekday: " + weekday);
	        } else {
	            System.out.println("Invalid Input");
	        }
	    }

}
