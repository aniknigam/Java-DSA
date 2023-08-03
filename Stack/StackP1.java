// WAP to add an element at the bottom of the stack
package Stack;

import java.util.*;

public class StackP1 {

    // This method pushes an element to the bottom of a stack using recursion.

    public static void pushAtBottom(int data, Stack<Integer> s) {
        // If the stack is empty, directly push the data and return.
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        // If the stack is not empty, we need to recursively push the element to the
        // bottom.

        // Step 1: Pop the top element from the stack and store it in 'top'.
        int top = s.pop();
        // Step 2: Recursively call the method with the same data to push and the
        // modified stack (without the top element).
        pushAtBottom(data, s);
        // Step 3: After reaching the bottom of the stack (when the base case is
        // reached),
        // push the 'top' element back onto the stack.
        s.push(top);
        // The recursion will unwind now, and each popped element will be pushed back on
        // top of the new element,
        // effectively placing the 'data' element at the bottom of the stack.
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);

        pushAtBottom(4, s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

// another approach
// int a = s.pop();
// int b = s.pop();
// int c = s.pop();

// s.push(4);
// s.push(c);
// s.push(b);
// s.push(a);
