import java.util.Scanner;
public class area_and_cir_circle {
    public static void main(String[] args){
        System.out.println("Enter the radius of the circle:");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println("The area of the circle is " + 3.14*radius*radius);
        System.out.println("The circumference of the circle is " + 2*3.14*radius);
        sc.close();
    } 
}
