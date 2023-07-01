//Find the maximum & minimum number in an array of integers

        /*
        
        Integer.MIN_VALUE is a constant with a value of -2,147,483,648,
        which is 2^31 (negative 2 raised to the power of 31). 
        It represents the smallest possible value that can be stored in a 32-bit signed integer.

        Integer.MAX_VALUE, on the other hand, is a constant with a value of 2,147,483,647,
        which is 2^31 - 1 (positive 2 raised to the power of 31 minus 1).
        It represents the largest possible value that can be stored in a 32-bit signed integer.

        
        */

import java.util.Scanner;

public class arrayMaxMinNum {
    public static void main(String args[]) {

        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int number[] = new int[size];
        System.out.println("Enter the values of the array:");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (number[i] < min) {
                min = number[i];
            }
            if (number[i] > max) {
                max = number[i];
            }
        }

        sc.close();

        System.out.println("Largest Value is: " + max);
        System.out.println("Smallest Value is: " + min);
    }
}
