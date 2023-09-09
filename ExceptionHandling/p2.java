package ExceptionHandling;

public class p2 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int index = 10; // Index out of bounds

        try {
            int value = numbers[index];
            System.out.println("Value at index " + index + " is: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
        }
        System.out.println("program is running after the applying try and catch");
    }
}
