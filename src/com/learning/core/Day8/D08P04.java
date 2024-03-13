package com.learning.core.Day8;
import java.util.LinkedList;
import java.util.Queue;
public class D08P04 {
	public static void main(String[] args) {
		String[] input1 = {"Yellow", "Green", "Pink", "Black", "Blue", "White"};
		
		String[] input2 = {};
		
		System.out.println("Output 1:");
		if(isEmpty(input1)) {
			System.out.println("Empty");
		}else {
			System.out.println("Not Empty");
		}
		System.out.println("\nOutput 2:");
		if(isEmpty(input2)) {
			System.out.println("Empty");
		}else {
			System.out.println("Not Empty");
		}
		
	}
	public static boolean isEmpty(String[] elements) {
		Queue<String> q = new LinkedList<>();
		for(String element : elements) {
			q.offer(element);
		}
		return q.isEmpty();
	}

}
