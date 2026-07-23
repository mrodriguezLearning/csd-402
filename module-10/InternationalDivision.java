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
 * The InternationalDivision class extends the abstract Division class.
 * It represents a company division located outside the home country.
 */
public class InternationalDivision extends Division {
    // Additional fields specific to international divisions
    private String country;
    private String language;

    /**
     * Constructor requires all fields for initialization.
     * It uses the super keyword to pass the name and account number 
     * to the parent Division class constructor.
     */
    public InternationalDivision(String divisionName, String accountNumber, String country, String language) {
        super(divisionName, accountNumber); // Initialize parent fields
        this.country = country;             // Initialize local fields
        this.language = language;
    }

    /**
     * Overrides the abstract display method from the Division class.
     * Prints all the specific details of the international division.
     */
    @Override
    public void display() {
        System.out.println("International Division: " + this.divisionName);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Country: " + this.country);
        System.out.println("Language: " + this.language);
        System.out.println(); // Adds a blank line for readability
    }
}