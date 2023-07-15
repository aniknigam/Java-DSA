//print numbers from 1 to 5 with the help of recursion function
package recursion;

public class recursionP2 {

    public static void printNumbers(int n) {
        // base condition
        if (n == 6) {
            return;
        }
        System.out.println(n);
        // recursion function
        printNumbers(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        printNumbers(n); // n = 1

    }
}
