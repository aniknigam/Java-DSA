//Write a program to count the number of 1’s in a binary representation of the number

public class bitManipulationP3 {
    public static void main(String[] args) {
        int n = 9;
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1; // n= n>>1
        }
        System.out.print(count);
    }
}
