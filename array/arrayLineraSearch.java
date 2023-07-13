//WAP to take an array as an input from the user. Search for a given number x print the index at which it occurs.
//Linear Search Problem
import java.util.Scanner;

public class arrayLineraSearch {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        
        //input is taking to define the size of arrays
        int size = sc.nextInt();
        int[] numbers = new int[size];
        
        //this loop will take the input from the user to input the values of array till size
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Enter a value to find its index number.");
        int x = sc.nextInt();
        //this loop is user to find the index no. x by travesring all the values.
        //numbers.length define the length of array from 0 to n we can also use size here.
        for(int i = 0; i<numbers.length; i++ ){
            if(numbers[i] == x){
                System.out.println( "x is found at index: " + i);
            }
        }
        sc.next();

    }
}
