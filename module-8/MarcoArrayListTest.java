/**
 *
 * Marco Rodriguez
 * Assignment 8.2
 * 07/10/2026
 */
import java.util.ArrayList;
import java.util.Scanner;

public class MarcoArrayListTest {

    /**
     * Finds and returns the largest value in the provided ArrayList.
     * If the list is empty, returns 0.
     * * @param list An ArrayList of Integer objects
     * @return The maximum Integer value, or 0 if empty
     */
    public static Integer max(ArrayList<Integer> list) {
        // If the ArrayList is empty, return 0
        if (list == null || list.isEmpty()) {
            return 0;
        }

        // Initialize the tracking variable with the very first item in the collection
        int maxValue = list.get(0);

        // Iterate through the collection to locate the largest value
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > maxValue) {
                maxValue = list.get(i);
            }
        }

        return maxValue;
    }

    // Test program to demonstrate complete functionality
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> userNumbers = new ArrayList<>();

        System.out.println("=========================================================");
        System.out.println("            mRodriguez ARRAYLIST MAXIMUM TEST            ");
        System.out.println("=========================================================");
        
        System.out.println("Enter integers one by one (enter 0 to stop and evaluate):");

        while (true) {
            System.out.print("Enter integer: ");
            // Validate that the user is actually typing an integer to prevent crashes
            if (input.hasNextInt()) {
                int number = input.nextInt();
                userNumbers.add(number);

                // Stop collecting when the value 0 is input and appended
                if (number == 0) {
                    break;
                }
            } else {
                System.out.println("Invalid entry. Please input a whole number integer.");
                input.next(); // Clear out the invalid data stream
            }
        }

        System.out.println("\n---------------------------------------------------------");
        System.out.println("ArrayList content submitted to max() method: " + userNumbers);

        // Execute the method and hold the response return value
        Integer largestValue = max(userNumbers);

        // Display the results clearly to the user
        System.out.println("The largest value returned by the method is: " + largestValue);
        System.out.println("=========================================================");

        // Additional testing constraint: Verifying the edge case rule for empty submissions
        System.out.println("\nExecuting additional edge-case testing...");
        ArrayList<Integer> emptyTestList = new ArrayList<>();
        System.out.println("Submitting an explicitly empty list... Result: " + max(emptyTestList));
        System.out.println("=========================================================");
        
        input.close();
    }
}
