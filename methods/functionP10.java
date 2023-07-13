//Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.Scanner;
import java.lang.Math;
public class functionP10 {
    public static double getCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle to get the circumference.");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        System.out.println(getCircumference(radius));
        sc.close();
    }
}
