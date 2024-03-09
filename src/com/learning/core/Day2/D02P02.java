package com.learning.core.Day2;

import java.util.Scanner;

public class D02P02 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Even numbers less than or equal to " + number + ": ");
        if (number >= 2) {
            for (int i = 2; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("No even numbers less than or equal to " + number);
        }
    }

}
