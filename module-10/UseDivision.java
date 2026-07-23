/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * Marco Rodriguez
 * CSD402 Java for Programmers
 * Module 10 Assignment 10.2
 * 7/22/2026
 * 
 * javac *.java
 * java UseDivision
 * 
 * The UseDivision class contains the main method to test the application.
 * It creates instances of the concrete subclasses and calls their display methods.
 */
public class UseDivision {
    public static void main(String[] args) {
        
        // Instantiate two InternationalDivision objects with required arguments
        InternationalDivision intDiv1 = new InternationalDivision("European Operations", "INT-84392", "Germany", "German");
        InternationalDivision intDiv2 = new InternationalDivision("Asian Markets", "INT-59210", "Japan", "Japanese");
        
        // Instantiate two DomesticDivision objects with required arguments
        DomesticDivision domDiv1 = new DomesticDivision("West Coast Sales", "DOM-10482", "California");
        DomesticDivision domDiv2 = new DomesticDivision("Southern Logistics", "DOM-49201", "Texas");
        
        // Execute the display method on each object to output the data to the console
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}