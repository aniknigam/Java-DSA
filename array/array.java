public class array {
    public static void main(String[] args) {
        // initializing array methos 1
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 95;
        marks[2] = 92;

        int result = marks[2];
        System.out.println("the result is : " + result);

        // printing the value of marks at each index
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        System.out.println("  ");

        // printing the values with for loop

        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }

        // initializing an array with method 2

        int[] numbers = { 100, 198, 199 };

        // printing the value of array
        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);
        }
    }
}
