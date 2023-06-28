import java.util.*;
public class functionP3 {
  
    public static int product(int a, int b){
        int multiply;
        multiply = a * b;
        System.out.println(multiply);
        
        return 1;
    }
    public static void main(String[] args){
        System.out.println("Enter the value of a and b to find the product: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("a");
        int a = sc.nextInt();
        System.out.println("b ");
        int b = sc.nextInt();
        product(a,b);
        sc.close();
    }
}
