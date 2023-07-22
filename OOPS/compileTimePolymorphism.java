package OOPS;

class Calculation {

    // Method to add two integers and print the result
    public void add() {
        int a = 2, b = 4;
        int c = a + b;
        System.out.println(c);
    }

    // Method to add two integers passed as arguments and print the result
    public void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    // Method to add two integers and a double, and return the sum
    public double add(int a, int b, double c) {
        double d = a + b + c;
        return d;
    }

}

public class compileTimePolymorphism {
    public static void main(String[] args) {
        // Create an instance of the Calculation class
        Calculation cal = new Calculation();

        // Call the first add() method to add 2 and 4 and print the result
        cal.add();

        // Call the second add() method with two integers (48 and 384) and print the
        // result
        cal.add(48, 384);

        // Call the third add() method with two integers (23 and 74) and a double
        // (483.84),
        // and store the returned result in the 'result' variable
        double result = cal.add(23, 74, 483.84);

        // Print the result returned from the third add() method
        System.out.println(result);
    }
}
