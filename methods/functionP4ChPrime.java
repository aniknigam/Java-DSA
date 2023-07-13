import java.util.*;

public class functionP4ChPrime {

    public static int checkFactorial(int input) {
        if (input == 1) {
            System.out.println("Not a prime number");
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                count++;
            }
        }
        if(count == 2){
            System.out.println("the number is a prime number");
        } else{
            System.out.println("the numer is not a prime number");
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to check if it is prime or not.");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        checkFactorial(input);

        sc.close();
    }
}
