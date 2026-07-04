/**
 *
 * @author marco Rodriguez
 * Assignment 7.2 UseFans
 * 
 * javac -d . *.java
 * 
 * java UseFans
 * 
 */
import java.util.ArrayList;
import java.util.Collection;
import fan.Fan; // Required because Fan lives inside the fan package directory

public class UseFans {

    // Method to display a single instance of a Fan without using toString()
    public static void displaySingleFan(Fan fanParam) {
        if (fanParam == null) {
            System.out.println("Error: Fan instance is null.");
            return;
        }
        
        System.out.print("Custom Display -> Status: ");
        if (fanParam.isOn()) {
            System.out.print("RUNNING | Speed Level: " + fanParam.getSpeed());
        } else {
            System.out.print("STOPPED");
        }
        System.out.println(" | Dimension Radius: " + fanParam.getRadius() + " | Blade Color: " + fanParam.getColor());
    }

    // Method to display a collection of Fan instances without using toString()
    public static void displayFanCollection(Collection<Fan> fanCollectionParam) {
        if (fanCollectionParam == null || fanCollectionParam.isEmpty()) {
            System.out.println("The fan collection is empty.");
            return;
        }

        int index = 1;
        for (Fan fanInstance : fanCollectionParam) {
            System.out.print(" Collection Item #" + index + " | ");
            // Delegating to the single display method to print details uniformly
            displaySingleFan(fanInstance);
            index++;
        }
    }

    // Test program to verify the collection and display functionality
    public static void main(String[] args) {
        System.out.println("==========================================================");
        System.out.println("                USEFANS COLLECTION TEST                   ");
        System.out.println("==========================================================");

        // Create a collection of Fan instances
        Collection<Fan> warehouseFans = new ArrayList<>();

        // Instantiate distinct fan states
        Fan industrialFan = new Fan(Fan.FAST, true, 18.5, "industrial grey");
        Fan defaultFan = new Fan();
        Fan officeFan = new Fan(Fan.SLOW, true, 8.0, "matte black");
        Fan floorFan = new Fan(Fan.STOPPED, false, 12.0, "yellow");

        // Add instances to our dynamic collection structure
        warehouseFans.add(industrialFan);
        warehouseFans.add(defaultFan);
        warehouseFans.add(officeFan);
        warehouseFans.add(floorFan);

        System.out.println("Testing display of entire collection:");
        displayFanCollection(warehouseFans);
        System.out.println("----------------------------------------------------------");

        System.out.println("Testing display of a single updated instance:");
        // Modify an existing collection element using mutators to show runtime updates
        floorFan.setOn(true);
        floorFan.setSpeed(Fan.MEDIUM);
        floorFan.setColor("bright green");
        
        displaySingleFan(floorFan);
        System.out.println("==========================================================");
    }
}