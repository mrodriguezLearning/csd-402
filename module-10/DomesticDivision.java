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
 * The DomesticDivision class extends the abstract Division class.
 * It represents a company division located within the home country.
 */
public class DomesticDivision extends Division {
    // Additional field specific to domestic divisions
    private String state;

    /**
     * Constructor requires all fields for initialization.
     * It uses the super keyword to initialize the parent class fields.
     */
    public DomesticDivision(String divisionName, String accountNumber, String state) {
        super(divisionName, accountNumber); // Initialize parent fields
        this.state = state;                 // Initialize local field
    }

    /**
     * Overrides the abstract display method from the Division class.
     * Prints all the specific details of the domestic division.
     */
    @Override
    public void display() {
        System.out.println("Domestic Division: " + this.divisionName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("State: " + this.state);
        System.out.println(); // Adds a blank line for readability
    }
}