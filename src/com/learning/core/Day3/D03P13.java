package com.learning.core.Day3;

public class D03P13 {
	public static String replaceSpaces(String str) {
        // Convert the string to char array to perform the replacement in place
        char[] charArray = str.toCharArray();

        // Count the number of spaces in the original string
        int spaceCount = 0;
        for (char c : charArray) {
            if (c == ' ') {
                spaceCount++;
            }
        }

        // Calculate the new length of the string after replacing spaces
        int newLength = str.length() + (spaceCount * 2);
        char[] newCharArray = new char[newLength];

        // Replace spaces with '%20'
        int index = 0;
        for (char c : charArray) {
            if (c == ' ') {
                newCharArray[index++] = '%';
                newCharArray[index++] = '2';
                newCharArray[index++] = '0';
            } else {
                newCharArray[index++] = c;
            }
        }

        return new String(newCharArray);
    }

    public static void main(String[] args) {
        String input = "Mr John Smith";
        String output = replaceSpaces(input);
        System.out.println(output);
    }

}
