package advRecursion;

public class advanceP3 {

    // Function to find the number of ways to place tiles of size 1Xm on a floor of
    // size nXm
    public static int placeTile(int n, int m) {

        // base case: If the floor size is equal to the tile size (n == m), there are 2
        // ways to place the tile.
        if (n == m) {
            return 2;
        }

        if (n > m) {
            return 2;
        }

        // If the floor size is less than the tile size, there is only one way to place
        // the tile (vertically).
        if (n < m) {
            return 1;
        }

        // Calculate the number of ways to place the tiles vertically by reducing the
        // floor length by the tile length (m).
        int vertical = placeTile(n - m, m);

        // Calculate the number of ways to place the tiles horizontally by reducing the
        // floor length by 1.
        int horizontal = placeTile(n - 1, m);

        // The total number of ways is the sum of the ways to place tiles vertically and
        // horizontally.
        int totalways = vertical + horizontal;

        return totalways;
    }

    public static void main(String[] args) {
        int n = 4; // Floor length
        int m = 2; // Tile length
        int ways = placeTile(n, m); // Call the function to find the number of ways to place the tiles
        System.out.println(ways); // Print the result
    }
}
