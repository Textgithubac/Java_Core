package com.learning.core.Day3;

public class D03P10 {
	public static int findLPSLength(String s) {
        int n = s.length();
        int[] lps = new int[n];

        
        int len = 0;  // Length of the previous longest prefix suffix
        int i = 1;

        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        
        return lps[n - 1];
    }

    public static void main(String[] args) {
        String s = "aabcdaabc";
        int length = findLPSLength(s);
        System.out.println("Length of the longest prefix suffix: " + length);
    }


}
