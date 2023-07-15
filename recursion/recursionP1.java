// Print numbers from 5 to 1 with the help of recursion
package recursion;

public class recursionP1 {
    public static void printNumbers(int n) {
        // BASE CASE - recrsion function will print numbers till this condition
        if (n == 0) {
            return;
        }
        // printing the number
        System.out.println(n);

        // recursion function
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printNumbers(n);
    }

}
