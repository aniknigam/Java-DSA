// Take an array of numbers as input and check if it is an array sorted in 
// ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//  {3, 4, 6, 2} is not sorted in ascending order

// ArrayIndexOutOfBoundsException
// The ArrayIndexOutOfBoundsException occurs when you try to access an element in an array using an index that is outside the valid range of indices for that array. In the given code, the issue could arise if the size of the array is entered incorrectly by the user.

// Let's analyze the code to understand how this exception can occur:


// int size = sc.nextInt();
// int numbers[] = new int[size];

import java.util.Scanner;

public class arrayFindAscending {
      public static void main(String args[]){
        System.out.println("Enter a value that will define the size of array");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int order[] = new int[size];
       

        //loop that will take the values of element from the user
        for (int i = 0; i<size; i++){
            order[i] = sc.nextInt();
        }
        //by this isAscending we are assuming that the array is in ascending order
        boolean isAscending = true;
        /*Subtracting 1 from numbers.length is necessary because we are comparing adjacent elements 
        in the loop. Since we access numbers[i+1] inside the loop, we don't need to include the 
        last element of the array in the iteration. If we didn't subtract 1, the loop would go
         beyond the last element, resulting in an ArrayIndexOutOfBoundsException when accessing numbers[i+1]. */
        for(int i = 0; i < order.length -1; i++){
            //this is the condition for descending order
            if(order[i] > order[i+1]){
                isAscending = false;
            }
        }

        if(isAscending){
            System.out.println("The array is sorted in ascending order");
        }else{
            System.out.println("The array is not sorted in ascending order.");
        }
        sc.close();


      }
}
