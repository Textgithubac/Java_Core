package com.learning.core.Day2;

import java.util.Scanner;

public class D02P08 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                sum += i;
            }
            System.out.println("Sum: " + sum);
        } else {
            System.out.println("Invalid Input");
        }
    }

}
