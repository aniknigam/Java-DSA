//WAP to remove the duplicate character from the string with the help of recursion

package recursion;

public class recursionP11 {

    public static boolean[] map = new boolean[26];
    // 'a' - 'a' = 0
    // 'b' - 'a' = 1
    // 'c' - 'a' = 2
    // 'z' - 'a' = 25
    // we are creating boolean type because we are storing true or false
    // true means we have got that character
    // false means we have not yet got that character

    public static void removeDuplicate(String str, int index, String newString) {
        // base case
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        // Checking the first character:

        // currentChar = 'a' (character at index 0).
        // map['a' - 'a'] is map[0], which represents the first index of the map array.
        // Since map[0] is initially false, the code executes the following steps:
        // Appends 'a' to the newString, resulting in newString = "a".
        // Sets map[0] to true to indicate that 'a' has been encountered.
        char currentChar = str.charAt(index);
        // currentChar - 'a' will give us a interger value
        if (map[currentChar - 'a']) {
            removeDuplicate(str, index + 1, newString);
        } else {
            newString += currentChar;
            map[currentChar - 'a'] = true;
            removeDuplicate(str, index + 1, newString);

        }
    }

    public static void main(String[] args) {
        String str = "aniketnigam";
        removeDuplicate(str, 0, "");
    }
}
