package com.learning.core.Day10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Student implements Serializable {
    private int rollNumber;
    private String name;
    private int age;

    public Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class BlankFieldException extends Exception {
    public BlankFieldException(String message) {
        super(message);
    }
}

public class D10P02 {
	 public static void main(String[] args) {
	        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("students_record.txt"))) {
	            Scanner scanner = new Scanner(System.in);
	            String choice;

	            do {
	                try {
	                    System.out.print("Enter Roll Number: ");
	                    int rollNumber = Integer.parseInt(scanner.nextLine());

	                    System.out.print("Enter Name: ");
	                    String name = scanner.nextLine().trim();
	                    if (name.isEmpty()) {
	                        throw new BlankFieldException("Name cannot be blank.");
	                    }

	                    System.out.print("Enter Age: ");
	                    int age = Integer.parseInt(scanner.nextLine());
	                    
	                  
	                    if (age <= 0 || rollNumber <= 0) {
	                        throw new NumberFormatException("Age and Roll Number should be numeric and greater than 0.");
	                    }

	                
	                    Student student = new Student(rollNumber, name, age);

	                  
	                    outputStream.writeObject(student);
	                    System.out.print("Do you want to add another record? (Yes/No): ");
	                    choice = scanner.nextLine().trim().toLowerCase();
	                } catch (NumberFormatException e) {
	                    System.out.println("Age and Roll Number should be numeric and greater than 0.");
	                    choice = "yes"; 
	                } catch (BlankFieldException e) {
	                    System.out.println("Error: " + e.getMessage());
	                    choice = "yes"; 
	                }

	            } while (choice.equals("yes"));
	            
	            System.out.println("Records saved successfully.");
	        } catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	    }
    
	
 }


