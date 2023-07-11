// Write a program to toggle a bit a position = “pos” in a number “n”.

import java.util.*;

public class toggleBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();

        int bitMask = 1 << pos;

        int toggledNumber = bitMask ^ n;

        System.out.print(toggledNumber);
        sc.close();

    }
}
