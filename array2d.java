//WAP to print a 2D array that takes the input from the user and print the output

import java.util.*;

public class array2d {
    public static void main(String[] args) {
        System.out.println("Enter the size of the 2D array");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns you want");
        int col = sc.nextInt();

        // initializing the size of the array
        int[][] matrix = new int[row][col];

        // taking the input from the user
        // input for rows
        System.out.println("Enter the values");
        for (int i = 0; i < row; i++) {
            // input for cols
            for (int j = 0; j < col; j++) {
                // taking the values here
                matrix[i][j] = sc.nextInt();
            }
        }

        // printing the output
        System.out.println("The output is");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
