import java.util.Scanner;

public class arrayTransposeMatrix {
    public static void main(String[] args) {
        System.out.println("Enter the size of the matrix");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows you want");
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns you want");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];


        System.out.println("Enter the values");
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The transpose of the matrix is");

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
}
