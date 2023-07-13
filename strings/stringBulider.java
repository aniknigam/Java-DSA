import java.util.*;

public class stringBulider {
    public static void main(String[] args) {
        // declaring StringBuilder

        StringBuilder name = new StringBuilder("Aniket Nigam");
        System.out.println(name);

        // charAt in StringBuilder

        System.out.println(name.charAt(7));

        // setCharAt - by this method we can replace the character at a particular index

        name.setCharAt(8, 'N');

        System.out.println(name);

        // insert- by this method we can add a new character in the string

        name.insert(3, 'Z');

        System.out.println(name);

        // delete - by this method we can delete the character in the string and to do
        // that we need to pass the index

        name.delete(0, 3);

        System.out.println(name);

        // append - by this method we can add a new character at the last

        StringBuilder sb = new StringBuilder("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");

        System.out.println(sb);

    }
}
