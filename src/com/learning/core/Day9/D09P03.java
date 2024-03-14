package com.learning.core.Day9;

public class D09P03 {
	public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 10, 40};
        int target1 = 10;
        boolean found1 = linearSearch(arr1, target1);
        if (found1) {
            System.out.println("Element is Present");
        } else {
            System.out.println("Element is not Present");
        }
        
        int[] arr2 = {2, 3, 4, 10, 40};
        int target2 = 90;
        boolean found2 = linearSearch(arr2, target2);
        if (found2) {
            System.out.println("Element is Present");
        } else {
            System.out.println("Element is not Present");
        }
    }
    
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
