// WAP to find the first and last occurence of element in a String
package recursion;

public class recrusionP8 {
    // to keep them static and constant we have made them public static
    public static int first = -1;
    public static int last = -1;

    public static void findOccurence(String str, int index, char element) {
        if (index == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currentChar = str.charAt(index);
        if (currentChar == element) {

            // for the first time first is exactly eqaul to -1 after that its value changes
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }

        findOccurence(str, index + 1, element);
    }

    public static void main(String[] args) {
        String str = "fd;ha;sddaasda;fj asdo;fa;;;a";
        findOccurence(str, 0, 'a');
    }

}
