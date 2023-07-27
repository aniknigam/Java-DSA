//Take an array of numbers as input and check if it is an array sorted in ascending order.
package Arraylist;

import java.util.*;

public class ArrayListP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Ask the user to enter the number of elements they want to input
        System.out.println("Enter the number of elements you want.");
        int n = sc.nextInt();

        // Prompt the user to enter the numbers
        System.out.println("Enter numbers");

        // Read n integers from the user and add them to the ArrayList
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            numbers.add(number);
        }

        // Initialize a boolean variable to keep track if the array is sorted
        boolean isSorted = true;

        // Check if the array is sorted in ascending order
        for (int i = 0; i < n - 1; i++) {
            if (numbers.get(i) > numbers.get(i + 1)) {
                // If an element is greater than the next one, set isSorted to false and break
                // the loop
                isSorted = false;
                break;
            }
        }

        // Print the result based on whether the array is sorted or not
        if (isSorted) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is not sorted in ascending order.");
        }
    }
}
