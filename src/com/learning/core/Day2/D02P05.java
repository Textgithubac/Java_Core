package com.learning.core.Day2;

import java.util.Scanner;

public class D02P05 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0) {
            System.out.println("Number divisible by 5");
        } else {
            System.out.println("Number is not divisible by 5");
        }
    }

}
