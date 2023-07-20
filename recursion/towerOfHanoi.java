package recursion;

import java.util.Scanner;

public class towerOfHanoi {

    /**
     * Recursive function to solve the Tower of Hanoi problem.
     * Moves disks from the source rod to the destination rod using the helper rod.
     *
     * n The number of disks to be moved
     * source The source rod
     * helper The helper rod
     * destination The destination rod
     */
    public static void towerOfHanoi(int n, String source, String helper, String destination) {
        // base case: if there is only one disk, move it directly from source to
        // destination
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
            return;
        }

        // move n-1 disks from source to helper using destination as the temporary rod
        towerOfHanoi(n - 1, source, destination, helper);
        // move the remaining disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        // move the n-1 disks from helper to destination using source as the temporary
        // rod
        towerOfHanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = sc.nextInt();
        towerOfHanoi(n, "A", "B", "C");
        sc.close();

    }
}
