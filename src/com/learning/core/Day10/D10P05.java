package com.learning.core.Day10;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class D10P05 {
	  public static void main(String[] args) {
	        
	        try {
	            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	            System.out.print("Enter a string: ");
	            String inputString = reader.readLine();
	            
	            BufferedWriter writer = new BufferedWriter(new FileWriter("io.txt"));
	            writer.write(inputString);
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        //  size of the file
	        File file = new File("io.txt");
	        long fileSize = file.length();
	        System.out.println("Size of the file io.txt: " + fileSize + " bytes");

	       
	        try {
	            BufferedReader fileReader = new BufferedReader(new FileReader("io.txt"));
	            String line;
	            System.out.println("Contents of the file io.txt:");
	            while ((line = fileReader.readLine()) != null) {
	                System.out.println(line);
	            }
	            fileReader.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        //  io.txt file using 
	        if (file.exists()) {
	            file.delete();
	            System.out.println("io.txt file has been deleted.");
	        } else {
	            System.out.println("The file io.txt does not exist.");
	        }
	    }

}
