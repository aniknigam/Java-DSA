//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.*;
public class functionP13 {

    public static int getValue(int a, int b){
        int result = 1;
        for(int i =1; i<=b; i++){
            result = result*a;           
        }
        System.out.println(result);
        return 1;
    }
    public static void main(String[] args){
        System.out.println("Enter the value of a and b to get the a to the power b.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = sc.nextInt();
        System.out.print("Enter the value of b:");
        int b = sc.nextInt();
        getValue(a,b);
        sc.close();
    }
}
