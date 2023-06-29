//Write a function that calculates the Greatest Common Divisor of 2 numbers. 

import java.util.Scanner;

public class functionP14 {
    // creating the function to get the gcd
    public static int gcd(int a, int b) {
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                System.out.println(result);
                break;
            }
            result--;
        }
        return 1;
    }

    // creating the main function that will take the input from the user
    public static void main(String[] args) {
        System.out.println("Enter the value of a and b to get the GCD");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = sc.nextInt();
        System.out.print("Enter the value of b:");
        int b = sc.nextInt();
        gcd(a, b);
        sc.close();

    }
}
