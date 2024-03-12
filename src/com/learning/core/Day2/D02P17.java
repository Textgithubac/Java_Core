package com.learning.core.Day2;

import java.util.Scanner;

public class D02P17 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
        } else {
            System.out.print("Numbers from 1 to " + n + " excluding multiples of 2 and 3: ");
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0 && i % 3 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }


}
