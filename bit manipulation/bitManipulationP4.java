import java.util.Scanner;

public class bitManipulationP4 {

    public static String toBinary(int decimal) {
        StringBuilder binary = new StringBuilder();

        // if the decimal value is 0 it will return 0
        if (decimal == 0) {
            binary.append("0");
        } else {
            // while loop will process till the decimal value is greater than 0
            while (decimal > 0) {
                // we are taking out the remainder
                int remainder = decimal % 2;

                // by insert method of StringBuilder we are adding the remainder value at the
                // beginning of the string
                binary.insert(0, remainder);

                // by dividing the decimal value we are updating the decimal value
                decimal /= 2;
            }
        }
        // binary.toString() will convert to string
        return binary.toString();
    }

    // we are taking string parameter here
    public static int toBinary(String binary) {
        // initial value of decimal is 0 and the we will add values
        int decimal = 0;
        // because we are traversing it from left to to right it will go - 2^0, 2^1, 2^2
        // etc...
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = binary.charAt(i) - '0';
            decimal += digit * Math.pow(2, power);
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number to convert into binary");

        // Decimal to binary
        int decimalNumber = sc.nextInt();
        System.out.println("Decimal number = " + decimalNumber);
        System.out.println("To binary number = " + toBinary(decimalNumber));

        // binary to decimal
        System.out.println("Enter a binary number to convert into decimal");
        String binaryNumber = sc.next();
        System.out.println("Binary Number = " + binaryNumber);
        System.out.println("Decimal Number = " + toBinary(binaryNumber));

        sc.close();
    }
}

// refer this for line no. 37.

/*
 * 
 * In Java, characters are represented using Unicode values. The characters '0'
 * to '9' have consecutive Unicode values,
 * which means that their numeric values are directly related to their Unicode
 * representation.
 * 
 * By subtracting the character '0' from another character representing a digit,
 * we can obtain the corresponding integer
 * value of that digit.
 * 
 * For example, let's consider the character '7'. The Unicode value of '7' is
 * 55. When we subtract the Unicode value of
 * '0', which is 48, from the Unicode value of '7', we get 7. This conversion
 * happens implicitly because the subtraction
 * operation involves numeric values.
 * 
 */
