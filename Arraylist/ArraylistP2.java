package Arraylist;

import java.util.*;

public class ArraylistP2 {
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

        // Initialize variables to store the maximum and minimum values
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Loop through the ArrayList to find the maximum and minimum values
        for (int num : numbers) {
            if (num > max) {
                max = num; // Update max if the current number is greater
            }
            if (num < min) {
                min = num; // Update min if the current number is smaller
            }
        }

        // Print the maximum and minimum values
        System.out.println("Maximum value is: " + max);
        System.out.println("Minimum value is: " + min);

    }
}
