package com.Day3;

import java.util.Scanner;

public class D03P06 {
	 public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);

	       System.out.print("Enter a string: ");
	       String string = scanner.nextLine();

	       System.out.print("Enter the number of vowels to count: ");
	       int n = scanner.nextInt();

	       int vowelCount = countLastNVowels(string, n);

	       if (vowelCount == -1) {
	           System.out.println("Mismatch in vowels count");
	       } else {
	           System.out.println(vowelCount);
	       }
	   }

	   public static int countLastNVowels(String string, int n) {
	       string = string.toLowerCase();  // Case-insensitive vowel check
	       int vowelCount = 0;

	       for (int i = string.length() - 1; i >= 0; i--) {
	           if (isVowel(string.charAt(i))) {
	               vowelCount++;
	               if (vowelCount == n) {
	                   return vowelCount;
	               }
	           }
	       }

	       return -1;  // Indicate mismatch
	   }

	   public static boolean isVowel(char character) {
	       return "aeiou".indexOf(character) != -1;
	   }


}
