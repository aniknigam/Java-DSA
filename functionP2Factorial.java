import java.util.*;

public class functionP2Factorial {

    // creating a function
    public static void findFactorial(int input) {

        // if the user input the negative value
        if (input < 0) {
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;
        for (int i = input; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of the " + input + " is: " + factorial);

        return;

    }

    public static void main(String[] args) {
        System.out.println("Enter a number to find the factorial.");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        findFactorial(input);
        sc.close();

    }
}
