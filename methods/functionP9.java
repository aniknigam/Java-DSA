
// Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.Scanner;

public class functionP9 {

    public static int getGreater(int a, int b) {
        if (a > b) {

            return a;
        } else {

            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter two number two get the greatest.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getGreater(a, b));
        sc.close();
    }
}