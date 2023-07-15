//Write a program to print Fibonacci series of n terms where n is input by user 

import java.util.*;

public class functionP15FibonacciSeries {

    public static int FibonacciSeries(int n) {
        int a = 0;
        int b = 1;
        int temp;
        System.out.print(a + " " + b);
        for (int i = 2; i <= n; i++) {

            temp = a + b;
            System.out.print(" " + temp);
            a = b;
            b = temp;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("Enter the value of n to get the series till n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FibonacciSeries(n);
        sc.close();
    }
}