package com.Day3;

import java.util.ArrayList;

import java.util.List;

public class D03P05 {
	 public static List<List<Integer>> findCombinations(int[] nums, int k) {
		    List<List<Integer>> combinations = new ArrayList<>();
		    combinationsHelper(nums, 0, combinations, new ArrayList<>(), k);
		    return combinations;
		  }

		  private static void combinationsHelper(int[] nums, int start, List<List<Integer>> combinations, List<Integer> current, int k) {
		    if (current.size() == k) {
		      combinations.add(new ArrayList<>(current));
		      return;
		    }

		    for (int i = start; i < nums.length; i++) {
		      current.add(nums[i]);
		      combinationsHelper(nums, i + 1, combinations, current, k);
		      current.remove(current.size() - 1);
		    }
		  }

		  public static void main(String[] args) {
		    int[] nums = {1, 2, 3};
		    int k = 2;
		    List<List<Integer>> combinations = findCombinations(nums, k);
		    for (List<Integer> combination : combinations) {
		      System.out.println(combination.toString().replace(",", ""));
		    }
		  }

	

}
