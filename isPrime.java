import java.util.*;

public class isPrime {
    public static void main(String[] args) {

        // this is the first way to check

        // Scanner sc = new Scanner(System.in);
        // int input, counter = 0;
        // System.out.print("Enter the number to check if it is prime or not:");
        // input = sc.nextInt();
        // for( int i=1; i<=input; i++){
        // if(input % i == 0){
        // counter++;
        // }
        // }
        // if(counter == 2){
        // System.out.println(input + " is a prime number");
        // } else{
        // System.out.println(input + " is not a prime number");
        // }
        // sc.close();
    

        // this is the second way to check

        Scanner sc = new Scanner(System.in);
        int input;
        boolean isPrime = true;
        System.out.print("Enter the number to check weather it is prime or not:");
        input = sc.nextInt();
        for (int i = 2; i <= input / 2; i++) {
            if (input % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            if (input == 1) {
                System.out.println(input + " is neither a prime number nor composit number");
            } else {
                System.out.println(input + " is a prime number");
            }
        } else {
            System.out.println(input + " is not a prime number");
        }

        sc.close();

    }
}
