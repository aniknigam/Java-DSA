import java.util.*;
public class functionP5EvenOdd {
     public static int evenOdd(int input){
        if(input % 2 == 0){
            System.out.println("the number is a even number");
        } else{
            System.out.println("the number is odd number");
        }
        return 1;
     }
     public static void main(String[] args){
        System.out.println("enter a number to check even or odd");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        evenOdd(input);
        sc.close();
     }
}
