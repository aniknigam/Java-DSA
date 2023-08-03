package Stack;

import java.util.Stack;

public class StackCollectionFramework {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        System.out.println(s1.peek());
        System.out.println("Printing all elements of stack");
        while (!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
