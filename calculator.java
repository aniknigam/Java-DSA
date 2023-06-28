import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operation = sc.nextInt();
        int perform;

        /*
         * these numbers are assigned to these opertors
         * + -> 1
         * - -> 2
         * -> 3
         * / -> 4
         * % -> 5
         * 
         */
        // with the help of if else if
        // if (operation == 1) {
        // perform = a + b;
        // System.out.println(perform);
        // } else if (operation == 2) {
        // perform = a - b;
        // System.out.println(perform);
        // } else if (operation == 3) {
        // perform = a * b;
        // System.out.println(perform);
        // } else if (operation == 4) {
        // perform = a / b;
        // System.out.println(perform);
        // } else if (operation == 5) {
        // perform = a % b;
        // System.out.println(perform);
        // } else {
        // System.out.println("invalid operator");
        // }
        // sc.close();

        // with the help of switch case

        switch (operation) {
            case 1:
                perform = a + b;
                System.out.println(perform);
                break;

            case 2:
                perform = a - b;
                System.out.println(perform);

            case 3:
                perform = a * b;
                System.out.println(perform);
                break;

            case 4:
                if (b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    perform = a / b;
                    System.out.println(perform);
                }
                break;

            case 5:
                if (b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    perform = a % b;
                    System.out.println(perform);
                }
                break;

            default:
                System.out.println("Invalid division");

        }

        sc.close();

    }
}
