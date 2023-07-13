import java.util.Scanner;

public class arraySpiralOrder {
    public static void main(String[] args) {
        System.out.println("Enter the size of matrix");
        Scanner sc = new Scanner(System.in);

        // rows
        System.out.println("Enter the number of rows you want");
        int n = sc.nextInt();

        // cols
        System.out.println("Enter the number of columns you want");
        int m = sc.nextInt();

        // array initialization
        int[][] matrix = new int[n][m];

        System.out.println("Enter the values");

        // loop for taking the value from the user
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The output is");
        // printing the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("The spiral order of Matrix is:");

        // these are the index of the rows and columns
        // starting of the row
        int rowStart = 0;
        // ending 0f the row
        int rowEnd = n - 1;
        // starting of the column
        int colStart = 0;
        // ending of the column
        int colEnd = m - 1;

        // while loop...means..till this condition is not satisfied this loop will be
        // working
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // for printing the first row
            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            // rowStart++ so that it start from the next line for the next loop
            rowStart++;

            // for printing the last column
            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }
            // colEnd-- so for the next column is begin from one less than the last
            colEnd--;

            for (int col = colEnd; col >= colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;

            for (int row = rowEnd; row >= rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;
        }
    }
}
