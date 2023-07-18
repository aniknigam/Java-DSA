package recursion;

public class recursionP12 {
    // Recursive function to print all subsequences of a string
    public static void subSequences(String str, int index, String newString) {
        // Base case: If we have reached the end of the string
        if (index == str.length()) {
            System.out.println(newString); // Print the current subsequence
            return; // Exit the current recursive call
        }

        char newChar = str.charAt(index); // Get the character at the current index

        // Recursive call 1: Include the current character in the new subsequence
        subSequences(str, index + 1, newString + newChar);

        // Recursive call 2: Exclude the current character from the new subsequence
        subSequences(str, index + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subSequences(str, 0, ""); // Start the recursion from index 0 with an empty newString
    }
}
