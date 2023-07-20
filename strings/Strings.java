import java.util.*;

public class Strings {
    public static void main(String[] args) {
        // string declaration
        String name = "Aniket ";
        String fullName = "Aniket Nigam ";
        String sentence = " My full name is Aniket Nigam ";

        System.out.println(name + fullName + sentence);

        // string input
        // System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        // //string is a token so sc.next() will only take single word
        // String tellName = sc.next();
        // System.out.println(tellName);

        // to take the full line as an input use sc.nextLine()
        System.out.println("Enter your address");
        String address = sc.nextLine();
        System.out.println(address);

        // concatenation

        String l = "Lucknow";
        String p = "Public";
        String s = "School";
        String lps = l + " " + p + " " + s;
        System.out.println(lps);

        // to get the length of the string

        System.out.println(lps.length());

        // charAt - it print the each character in differnt line

        for (int i = 0; i < lps.length(); i++) {
            System.out.println(lps.charAt(i));
        }

        // comparing two strings
        String name1 = "Tony";
        String name2 = "Zony";

        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // the below code can sometime gives wrong answer so when we are comparing two
        // strings we will use above code because that will give more accurate answer

        // if(name1 == name2){
        // System.out.println("Strings are equal");
        // } else{
        // System.out.println("Strings are not equal");
        // }

        // Substring - Taking out smalller part of bigger string is a substring.
        // substring(beginning index, ending index)

        String fullSentence = "I live in uttarpradesh, lucknow";

        String getTheSub = fullSentence.substring(4, fullSentence.length());
        System.out.println(getTheSub);

        String slice = fullSentence.substring(5, 19);
        System.out.println(slice);

        String hello = "aniket";
        String sub = hello.substring(2, 4);
        System.out.println(sub);
    }

}
