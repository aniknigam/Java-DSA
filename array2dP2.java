//take a matrix as input from the user. Search for a given number x and print the indices at which it occurs

import java.util.Scanner;

public class array2dP2 {
    public static void main(String[] args) {
      System.out.println("Enter the size of the 2d array");     
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of rows you want");
      int rows = sc.nextInt();

      System.out.println("Enter the number of columns you want");
      int cols = sc.nextInt();

      //initializing the matrix
      System.out.println("Enter the values");
      int[][] matrix = new int[rows][cols];

      //input
      //rows
      for(int i = 0; i<rows; i++){
        //cols
        for(int j = 0; j<cols; j++){
            //taking inputs
            matrix[i][j] = sc.nextInt();
        }
      }

      //Taking input of the number for which we want to find the index.
       System.out.println("Enter the value of x to find its index number:");
       int x = sc.nextInt();

        for(int i = 0; i<rows; i++){
     
        for(int j = 0; j<cols; j++){
            if(matrix[i][j] == x){
                System.out.println("Index at which the x is found is: " + i + " , " + j);
            }
        }
      }
      sc.nextInt();
    }
}
