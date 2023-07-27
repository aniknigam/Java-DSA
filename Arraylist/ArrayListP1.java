//Take an arraylist of names as input from the user and print them on the screen.
package Arraylist;

// Importing required classes from the Java standard library
import java.util.ArrayList;
import java.util.Scanner;

// Creating a class named ArrayListP1
public class ArrayListP1 {
    public static void main(String[] args) {
        // Creating a new Scanner object to read user input from the console
        Scanner sc = new Scanner(System.in);

        // Creating an ArrayList to store names. Initial capacity is set to 5.
        ArrayList<String> names = new ArrayList<>(5);

        // Prompting the user to enter names
        System.out.println("Enter the names");

        // Continuously read names from the user until an empty name is entered
        while (true) {
            // Reading the name entered by the user
            String name = sc.nextLine();

            // Checking if the entered name is empty (user pressed Enter without typing
            // anything)
            if (name.equals("")) {
                // If the name is empty, exit the loop
                break;
            }

            // Adding the entered name to the ArrayList 'names'
            names.add(name);
        }
        sc.close();
        // Printing the names entered by the user
        System.out.println("Output of the names are");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
