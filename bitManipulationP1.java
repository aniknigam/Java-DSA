// Write a program to find if a number is a power of 2 or not.

import java.util.*;

public class bitManipulationP1 {

    public static boolean isPowerOfTwo(int number){
        return ((number > 0) &&  (number & (number -1 )) == 0);
     
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(isPowerOfTwo(number)){
            System.out.println(number + " is a power of 2.");
        } else {
            System.out.println(number + " is not a power of 2.");
        }
    }
}


