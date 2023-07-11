import java.util.Scanner;

public class powerof2 {
    public static boolean isPowerOfTwo(int number) {
        if (number == 0)
            return false;

        while (number != 1) {
            if (number % 2 != 0)
                return false;
            number /= 2;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to test: ");
        int number = sc.nextInt();

        if (isPowerOfTwo(number))
            System.out.printf(number + " is a power of two");
        else
            System.out.printf(number + " is not a power of two");
        sc.close();
    }

}
