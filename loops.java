import java.util.*;

public class loops {
    public static void main(String[] args) {

        // using for loop
        // for( int i = 0; i < 3; i=i+1){
        // System.out.println("Printing this with the help of loop");
        // }

        // for (int i = 0; i < 10; i = i + 1) {
        // System.out.print(i + " ");
        // }

        // using while loop

        int i = 1;
        while (i < 11) {
            System.out.println("hello world 10 times" + i);
            i = i + 1;
        }

        System.out.println("____________________-");
        System.out.println("doing same with the help of do while loop");

        int j = 1;
        do {
            System.out.println("hello world for the " + j + " time");
            j = j + 1;
        } while (j < 11);

        // int k = 12;
        // do {
        // System.out.println("Aniket is learning JAVA");
        // k = k + 1;
        // } while (k > 11);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get the table of that number:");
        int n = sc.nextInt();

        // int sum = 0;

        // for (i = 1; i <= n; i++) {
        // sum = sum + i;
        // }
        // System.out.println("The answer is: " + sum);

        // sc.close();
         sc.close();

        // loop for table of the number
        for (i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
       

       

    }
}
