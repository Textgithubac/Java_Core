package com.Day3;


import java.util.ArrayList;


public class D03P07 {
	

	    static ArrayList<String> getSubsequences(String str) {
	        if (str.length() == 0) {
	            ArrayList<String> empty = new ArrayList<>();
	            empty.add("");
	            return empty;
	        }

	        char first = str.charAt(0);
	        String rest = str.substring(1);

	        ArrayList<String> subsequences = getSubsequences(rest);
	        ArrayList<String> result = new ArrayList<>();

	        // Add subsequences without the first character
	        result.addAll(subsequences);

	        // Add subsequences with the first character
	        for (String subsequence : subsequences) {
	            result.add(first + subsequence);
	        }

	        // Add the first character as a single-character subsequence
	        result.add(Character.toString(first));

	        return result;
	    }

	    public static void main(String[] args) {
	        String str = "abc";
	        ArrayList<String> subsequences = getSubsequences(str);

	        // Print the subsequences in a user-friendly format
	        System.out.println("Subsequences of " + str + ":");
	        for (String subsequence : subsequences) {
	            System.out.println(subsequence);
	        }
	    }

	
	   
	  
}
