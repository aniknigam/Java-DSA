// WAP to print all the unique subsequences of a String

package recursion;

import java.util.*;

public class recursionP13 {

    public static void UniqueSubsequences(String str, int index, String newString, HashSet<String> set) {

        // base case
        if (index == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currentChar = str.charAt(index);

        // to pickup the new character
        UniqueSubsequences(str, index + 1, newString + currentChar, set);

        // to not picup the newCharacter
        UniqueSubsequences(str, index + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        // hashset it declare because we want to print the unique subsequences
        HashSet<String> set = new HashSet<>();
        UniqueSubsequences(str, 0, "", set);
    }
}
