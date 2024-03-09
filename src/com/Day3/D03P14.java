package com.Day3;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class D03P14 {

    public static void findUnionIntersection(int[] arr1, int[] arr2) {
        List<Integer> union = new ArrayList<>();
        List<Integer> intersection = new ArrayList<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                union.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                union.add(arr2[j]);
                j++;
            } else {
                union.add(arr1[i]);
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements of arr1, if any
        while (i < arr1.length) {
            union.add(arr1[i]);
            i++;
        }

        // Add remaining elements of arr2, if any
        while (j < arr2.length) {
            union.add(arr2[j]);
            j++;
        }

        // Output
        System.out.print("Union : ");
        for (int num : union) {
            System.out.print(num + " ");
        }
        System.out.print("Intersection : ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter size of first array:");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Enter size of second array:");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Find union and intersection
        findUnionIntersection(arr1, arr2);
    }


}
