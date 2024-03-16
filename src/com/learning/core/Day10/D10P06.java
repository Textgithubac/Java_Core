package com.learning.core.Day10;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class D10P06 {
	public static void main(String[] args) {
        String combinedNotes = combineNotes("DavidEnglish.txt", "DavidScience.txt", "DavidComputer.txt");
        System.out.println(combinedNotes);
        writeToFile(combinedNotes, "DavidNotes.txt");
    }

    private static String combineNotes(String englishFile, String scienceFile, String computerFile) {
        StringBuilder combinedNotes = new StringBuilder();
        try (BufferedReader englishReader = new BufferedReader(new FileReader(englishFile));
             BufferedReader scienceReader = new BufferedReader(new FileReader(scienceFile));
             BufferedReader computerReader = new BufferedReader(new FileReader(computerFile))) {

            String line;
            
            while ((line = englishReader.readLine()) != null) {
                combinedNotes.append(line).append("\n");
            }
            combinedNotes.append("\n");

            
            while ((line = scienceReader.readLine()) != null) {
                combinedNotes.append(line).append("\n");
            }
            combinedNotes.append("\n");

            
            while ((line = computerReader.readLine()) != null) {
                combinedNotes.append(line).append("\n");
            }
            combinedNotes.append("\n");

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
        return combinedNotes.toString();
    }

    private static void writeToFile(String content, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
           // System.out.println(fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
