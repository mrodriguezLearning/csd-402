/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * Marco Rodriguez
 * CSD402 Java for Programmers
 * Module 9 Assignment 9.2
 * 7/16/2026
 * 
 */
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

public class RandomDataFileProcessor {
    public static void main(String[] args) {
        String fileName = "data.file";
        File targetFile = new File(fileName);
        Random randomGenerator = new Random();

        System.out.println("=========================================================");
        System.out.println("             PROGRAM 2: RANDOM DATA FILE I/O             ");
        System.out.println("=========================================================");

        // 1. Check if the file exists or create a new one
        try {
            if (targetFile.createNewFile()) {
                System.out.println("Status: Success. Created new file -> " + fileName);
            } else {
                System.out.println("Status: Target file already exists. Appending new data stream...");
            }
        } catch (IOException e) {
            System.out.println("Error initializing file creation steps.");
            e.printStackTrace();
            return;
        }

        // 2. Write/Append 10 randomly generated numbers separated by spaces
        // Initializing FileWriter with 'true' activates append mode
        try (FileWriter fileWriter = new FileWriter(targetFile, true)) {
            for (int i = 0; i < 10; i++) {
                int nextRandomNum = randomGenerator.nextInt(100); // Generates bounds from 0-99
                fileWriter.write(nextRandomNum + " ");
            }
            System.out.println("Status: Successfully wrote 10 random integers to the storage file.");
        } catch (IOException e) {
            System.out.println("Error writing to the target file stream.");
            e.printStackTrace();
        }

        System.out.println("---------------------------------------------------------");

        // 3. Reopen the file, read the accumulated data, and display it
        System.out.println("Reading and displaying all data contents from " + fileName + ":");
        try (BufferedReader reader = new BufferedReader(new FileReader(targetFile))) {
            String logLine;
            while ((logLine = reader.readLine()) != null) {
                System.out.println(logLine);
            }
        } catch (IOException e) {
            System.out.println("Error reading records from the text file.");
            e.printStackTrace();
        }

        System.out.println("=========================================================");
    }
}