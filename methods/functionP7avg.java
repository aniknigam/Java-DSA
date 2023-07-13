
//1. Enter 3 numbers from the user & make a function to print their average.
import java.util.*;

class functionP7avg {

    // creating function for finding the average
    public static int avg(int a, int b, int c) {
        int add = a + b + c;
        int average = add / 3;
        System.out.println("Average of " + a + ", " + b + ", " + c + " is: " + average);

        return 1;
    }

    // main function
    // this function is executed first
    public static void main(String[] args) {
        System.out.println("Enter the three numbers to print the average.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        avg(a, b, c);

        sc.close();
    }
}