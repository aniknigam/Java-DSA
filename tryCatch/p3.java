package tryCatch;

public class p3 {
    public static void main(String[] args) {
        String input = "123abc"; // This string cannot be converted to an integer

        try {
            int number = Integer.parseInt(input);
            System.out.println("The parsed integer is: " + number);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("program running after try and catch");
    }

}
