//WAP to print all the combination of the string "ABC"
package Backtracking;

public class allcombo {

    // method to find all the combination of letters
    public static void printcombo(String str, String comb, int idx) {
        if (str.length() == 0) {
            System.out.println(comb);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);// We are not including the ith char in this
            // newStr from 0 to i doesn't include i and i+1 doesn't inclue i
            printcombo(newStr, comb + currChar, idx + 1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printcombo(str, "", 0);
    }
}
