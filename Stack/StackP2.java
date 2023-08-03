// WAP to reverse a stack
package Stack;

import java.util.Stack;

public class StackP2 {

    // "This Java program uses recursion to reverse a stack. It includes two
    // functions: pushAtBottom and reverse. The pushAtBottom function is recursive
    // and is used to push an element to the bottom of the stack. On the other hand,
    // the reverse function recursively reverses the entire stack by popping
    // elements and then pushing them back using pushAtBottom

    public static void pushAtBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        reverse(s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();

        }

    }
}
