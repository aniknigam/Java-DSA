package recursion;

import java.util.Scanner;

public class towerOfHanoi {

    public static void towerOfHanoii(int n, String source, String helper, String destination) {
        // base case
        if (n == 1) {
            System.out.println(" move " + n + " from " + source + " to " + destination);
            return;
        }
        towerOfHanoii(n - 1, source, destination, helper);
        System.out.println(" move " + n + " from " + source + " to " + destination);
        towerOfHanoii(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoii(n, "A", "B", "C");
    }
}
