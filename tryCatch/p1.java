package tryCatch;

public class p1 {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;

        try {
            // technically we cannot divide any number with 0 it will show error
            int c = a / b;
            System.out.println("The result is " + c);
        } catch (Exception e) {
            System.out.println("we failed to divide because:" + e);
        }
        System.out.println("end of the program");

        // if we directly run the code the error will show and the line end of the
        // program line will not run but by try and catch it will run
        // int c = a / b;
        // System.out.println(c);
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at tryCatch.p1.main(p1.java:7)
    }
}
