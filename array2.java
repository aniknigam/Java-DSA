//Initializing an array and taking the value of array from the user.
import java.util.Scanner;

public class array2 {
    public static void main(String[] args){
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //size will be the no of elements of array
        System.out.println("Enter the values of array");
        int[] numbers = new int[size];
        
       
        //this loop will take the values from the user till size
        for(int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        
        //this loop  will print the values of array
        for(int i = 0; i<size; i++){
            System.out.println("the value at index " + i + " 3is: " + numbers[i]);
        }
         sc.close();
    }
}
