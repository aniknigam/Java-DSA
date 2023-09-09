package ExceptionHandling;

public class test {

    public static int divide(int a, int b) throws Exception {
        if (b < 0) {
            throw new Exception("invalid number");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            divide(1, 0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
