package com.Day2;

import java.util.Scanner;

public class D02P15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to continue (y/n)? ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("No of Positive Numbers: " + positiveCount);
        System.out.println("No of Negative Numbers: " + negativeCount);
        System.out.println("No of Zeros Numbers: " + zeroCount);
    }


}
