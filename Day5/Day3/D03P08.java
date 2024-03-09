package com.Day3;

public class D03P08 {
	

	    public static int minDeletions(String str) {
	        int n = str.length();

	        // Create a table to store the minimum number of deletions for all substrings
	        int[][] dp = new int[n][n];

	        // Fill the table in bottom-up manner
	        for (int i = n - 1; i >= 0; i--) {
	            for (int j = i + 1; j < n; j++) {
	                if (str.charAt(i) == str.charAt(j)) {
	                    dp[i][j] = dp[i + 1][j - 1];
	                } else {
	                    dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
	                }
	            }
	        }

	        return dp[0][n - 1];
	    }

	    public static void main(String[] args) {
	        String str = "aebcbda";
	        int minDel = minDeletions(str);
	        System.out.println("Minimum deletions required: " + minDel);
	    }

}
