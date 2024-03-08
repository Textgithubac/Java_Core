package com.Day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D03P04 {
	 public static int firstRepeatingIndex(int[] arr, int n) {
	        Map<Integer, Integer> map = new HashMap<>();

	        for (int i = 0; i < n; i++) {
	            if (map.containsKey(arr[i])) {
	                return i;
	            } else {
	                map.put(arr[i], i);
	            }
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Finding the index of the first repeating element
	        int index = firstRepeatingIndex(arr, n);

	        // Output
	        if (index != -1) {
	            System.out.println(index);
	        } else {
	            System.out.println("No repeating elements found.");
	        }
	    }


}
