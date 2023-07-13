import java.util.Scanner;

public class problemL4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        int input;
        do {
            System.out.print("How many marks have you got?: ");
            marks = sc.nextInt();
            if (marks >= 90) {
                System.out.println("This is Good");
            } else if (marks >= 60 && marks <= 90) {
                System.out.println("This is also Good");
            } else if (marks >= 0 && marks <= 59) {
                System.out.println("This is Good as well");
            } else {
                System.out.println("Invalid");
            }
            System.out.println("To continue press [1] and to stop press[0]");
            input = sc.nextInt();
        } while (input == 1);
        sc.close();
    }
}
