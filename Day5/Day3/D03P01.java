package com.Day3;

import java.util.HashSet;

public class D03P01 {

    public static int firstRepeatingElement(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (seen.contains(arr[i])) {
                return i;
            }
            seen.add(arr[i]);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 4, 3, 5, 6};
        int index = firstRepeatingElement(arr);

        if (index != -1) {
            System.out.println("Index of first repeating element is " + index);
        } else {
            System.out.println("No repeating element found");
        }
    }


}
