
//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.Scanner;
public class functionP11 {
    public static boolean isEligible(int age) {
        if (age > 18) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter your age to check if you are eligible to vote or not.");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(isEligible(age));
        sc.close();
    }
    
}
