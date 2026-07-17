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
 */
import java.util.ArrayList;
import java.util.Scanner;

public class StringCollectionExplorer {
    public static void main(String[] args) {
        // Initializing the ArrayList with 10 distinct Strings
        ArrayList<String> components = new ArrayList<>();
        components.add("Chassis Frame");
        components.add("Battery Pack");
        components.add("Drive Unit");
        components.add("Solar Inverter");
        components.add("Thermal Controller");
        components.add("Brake Assembly");
        components.add("Steering Gear");
        components.add("Cabin Module");
        components.add("Wiring Harness");
        components.add("Infotainment Unit");

        System.out.println("=========================================================");
        System.out.println("             PROGRAM 1: ARRAYLIST EXPLORER               ");
        System.out.println("=========================================================");
        
        System.out.println("Current elements in the collection:");
        int displayIndex = 0;
        // Using a for-each loop to print the collection content
        for (String component : components) {
            System.out.println("  Index [" + displayIndex + "]: " + component);
            displayIndex++;
        }
        System.out.println("---------------------------------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index number of the element you want to see again: ");
        String userInput = input.nextLine();

        try {
            // Autoboxing/Auto-Unboxing demonstration:
            // Integer.parseInt returns a primitive int. 
            // We assign it to an Integer object wrapper (Autoboxing).
            Integer selectedIndex = Integer.parseInt(userInput);

            // Passing the Integer object into the get() method requires an int.
            // Java automatically extracts the primitive value (Auto-Unboxing).
            String requestedElement = components.get(selectedIndex);
            
            System.out.println("\nSuccess! The retrieved element is: " + requestedElement);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("\nAn Exception has been thrown: Out of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("\nAn Exception has been thrown: Invalid numeric formatting input.");
        }

        System.out.println("=========================================================");
        input.close();
    }
}