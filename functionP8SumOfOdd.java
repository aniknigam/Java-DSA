//Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class functionP8SumOfOdd {

    public static void main(String[] args) {
        System.out.println("Enter a number to get the sum of odd number.");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        // calling function
        sumOfOdd(input);
        sc.close();
    }

    // creating function
    public static int sumOfOdd(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i += 2) {
            sum = sum + i;
        }
        System.out.println(sum);
        return 1;
    }

    // this is the main function this will be executed first.

}
