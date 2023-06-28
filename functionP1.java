import java.util.*;
public class functionP1 {

//    declaring functiion
      public static int multiply(int a, int b){
        return a*b;
      }
      public static void main(String[] args){
        //Scanner class
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the value of a and b.");
          System.out.print("a:");
        //asking for value of a
          int a = sc.nextInt();
          System.out.print("b:");
        //asking for value of b
          int b = sc.nextInt();
        //calling function
          int result = multiply(a,b);
          System.out.println("Multiplication of a and b is: 20");
        //printing result of the function
          System.out.println(result);
          sc.close();
      }
}
