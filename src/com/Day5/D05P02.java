package com.Day5;

import java.util.ArrayList;

import java.util.Scanner;

public class D05P02 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Create an ArrayList to store student names
	        ArrayList<String> studentNames = new ArrayList<>();
	        
	        // Add student names to the ArrayList
	        System.out.print("Enter the list of student names separated by space: ");
	        String[] namesInput = scanner.nextLine().split(" ");
	        for (String name : namesInput) {
	            studentNames.add(name);
	        }
	        
	        // Input the name to find
	        System.out.print("Enter the name to find: ");
	        String nameToFind = scanner.nextLine();
	        
	        // Check if the name exists in the list
	        if (studentNames.contains(nameToFind)) {
	            System.out.println("Found");
	        } else {
	            System.out.println("Not Found");
	        }
	        
	        scanner.close();
	 }

}

