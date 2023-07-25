//print all the subset of the set of n natural numbers

package advRecursion;

import java.util.ArrayList;

public class advanceP5 {

    // Function to print the elements of a subset.
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    // Recursive function to find all subsets of the set of n natural numbers.
    public static void findSubset(int n, ArrayList<Integer> subset) {
        // Base case: When n reaches 0, we have found a subset, so we print it.
        if (n == 0) {
            printSubset(subset);
            return;
        }

        // Include the current number 'n' in the subset and recursively find subsets
        // with n-1 elements.
        subset.add(n);
        findSubset(n - 1, subset);

        // Exclude the current number 'n' from the subset and recursively find subsets
        // with n-1 elements.
        subset.remove(subset.size() - 1);
        findSubset(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;

        // Create an empty ArrayList to store the subsets.
        ArrayList<Integer> subset = new ArrayList<>();

        // Start finding and printing all subsets of n natural numbers.
        findSubset(n, subset);
    }
}
