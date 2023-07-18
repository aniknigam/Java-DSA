// WAP to rearrange the string and print all the x from the string at the end

package recursion;

public class recursionP10 {

    public static void moveAllx(String str, int index, int count, String newstr) {
        // base case
        if (index == str.length() - 1) {
            for (int i = 0; i <= count; i++) {
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(index);
        if (currChar == 'x') {
            count++;
            // recursion
            moveAllx(str, index + 1, count, newstr);
        } else {
            newstr += currChar;
            // recursion
            moveAllx(str, index + 1, count, newstr);
        }
    }

    public static void main(String[] args) {
        String str = "abcdefxghxixjxxxk";
        // calling method
        moveAllx(str, 0, 0, "");
    }
}
