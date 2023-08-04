package tryCatch;

public class ThrowConcept {
    public static int divideNumbers(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        System.out.println("print this if throw condition is passes and error is not there");
        return a / b;

    }

    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException ae) {
            // getMessage() is a method provided by the Throwable class in Java. This method
            // is used to obtain the error message associated with an exception.
            System.out.println("Error: " + ae.getMessage());
        }
        System.out.println("program is running after that");
    }
}
