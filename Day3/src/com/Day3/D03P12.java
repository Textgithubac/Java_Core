package com.Day3;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class D03P12 {
	
	
	    public static boolean canSplitIntoFour(String str) {
	        // Check if the length of the string is at least 8 characters
	        if (str.length() < 8) {
	            return false;
	        }

	        Set<String> set = new HashSet<>();

	        // Iterate through the string and add substrings to the set
	        for (int i = 1; i <= 3; i++) {
	            for (int j = i + 1; j <= 5; j++) {
	                for (int k = j + 1; k <= 7; k++) {
	                    String first = str.substring(0, i);
	                    String second = str.substring(i, j);
	                    String third = str.substring(j, k);
	                    String fourth = str.substring(k);

	                    // Check if all substrings are distinct
	                    if (!first.equals(second) && !first.equals(third) && !first.equals(fourth) &&
	                            !second.equals(third) && !second.equals(fourth) && !third.equals(fourth)) {
	                        return true;
	                    }
	                }
	            }
	        }

	        return false;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input
	        System.out.println("Enter a string:");
	        String str = scanner.nextLine();

	        // Check if the string can be split into four distinct strings
	        if (canSplitIntoFour(str)) {
	            System.out.println("Yes");
	        } else {
	            System.out.println("No");
	        }
	    }

}
