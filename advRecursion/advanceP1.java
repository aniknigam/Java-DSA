//WAP to print the permutation of the given string
//output will be n! where n is no. of character

package advRecursion;

public class advanceP1 {

    public static void printPermutation(String str, String permutation) {
        // base case
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        // loop that will iterate all the character
        for (int i = 0; i < str.length(); i++) {
            // this will find the current character
            char currentChar = str.charAt(i);
            // if its "abc" and i is at a then
            // "abc" = bc
            String newStr = str.substring(0, i) + str.substring(i + 1);
            // recursion calling
            printPermutation(newStr, permutation + currentChar);

        }
    }

    public static void main(String[] args) {
        String str = "aniket";

        printPermutation(str, "");
    }
}