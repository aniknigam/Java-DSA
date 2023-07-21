package advRecursion;

public class advanceP2 {

    // Recursive method to count the total number of paths from (i, j) to (n, m) in
    // a matrix.
    // The matrix size is (n x m), and we can only move either in the right
    // direction or downward direction.
    public static int countPaths(int i, int j, int n, int m) {
        // Base case 1: If current position is out of bounds, return 0 (no valid path).
        if (i == n || j == m) {
            return 0;
        }

        // Base case 2: If the current position is the destination (n-1, m-1), return 1
        // (a valid path is found).
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // Recursive case:
        // Calculate the total number of paths by moving downward (incrementing the row
        // index) and in the right direction (incrementing the column index).
        int downWard = countPaths(i + 1, j, n, m); // Calculate the number of paths when moving downward.
        int rightDirection = countPaths(i, j + 1, n, m); // Calculate the number of paths when moving in the right
                                                         // direction.

        // Return the total number of paths by summing up the paths obtained from moving
        // downward and in the right direction.
        return downWard + rightDirection;
    }

    public static void main(String[] args) {
        int n = 3; // Total number of rows in the matrix.
        int m = 3; // Total number of columns in the matrix.

        // Call the countPaths method with the starting position (0, 0) in the matrix.
        int totalPaths = countPaths(0, 0, n, m);

        // Print the total number of paths from the starting point to the ending point
        // in the matrix.
        System.out.println("Total number of paths: " + totalPaths);
    }
}
