package com.learning.core.Day2;

import java.util.Scanner;

public class D02P09 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                int cube = i * i * i;
                System.out.print(cube + " ");
            }
            System.out.println();
        } else {
            System.out.println("Invalid Input");
        }
    }

}
