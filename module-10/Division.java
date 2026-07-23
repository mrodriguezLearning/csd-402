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
 * The Division class is an abstract base class that provides the 
 * blueprint for all division types within the company.
 * It cannot be instantiated directly.
 */
public abstract class Division {
    // Protected fields allow subclasses to access these variables directly.
    protected String divisionName;
    protected String accountNumber;

    /**
     * Constructor that requires values for both fields.
     * This will be called by the subclasses to initialize the shared data.
     */
    public Division(String divisionName, String accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    /**
     * Abstract method that must be defined by any concrete subclass.
     * It will handle printing the division details to the screen.
     */
    public abstract void display();
}