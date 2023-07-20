package recursion;

public class recursionKeypadP {

    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printKeyComb(String str, int index, String combination) {
        // base case
        if (index == str.length()) {
            System.out.println(combination);
            return;
        }

        // we are obtaining the current character
        char currentChar = str.charAt(index);

        // for ex 2-0 = 2 so we will get def
        String mapping = keypad[currentChar - '0'];

        // for ex - now we will iterate def
        for (int i = 0; i < mapping.length(); i++) {
            printKeyComb(str, index + 1, combination + mapping.charAt(i));
        }

    }

    public static void main(String args[]) {
        String keys = "64";
        printKeyComb(keys, 0, "");
    }
}
