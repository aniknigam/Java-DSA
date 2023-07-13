import java.util.*;
public class functionP6Table {
    public static int table(int input){
        int n = 10;
        for(int i = 1; i<=n; i++){
            System.out.println( input + " x " + i + " = " + input*i);
        }

        return 1;
    }
    public static void main(String[] args){
        System.out.println("Enter a number to get the table");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        table(input);
        sc.close();
    }
}
