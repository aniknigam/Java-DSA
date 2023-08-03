package Stack;

import java.util.ArrayList;

public class StackArrayListImp {
    // class for creating a stack
    static class Stack {
        // defining ArrayList for stack
        static ArrayList<Integer> list = new ArrayList<>();

        // checking if the stack is empty, if it is it will return ture
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // method to push the element in stack
        public static void push(int data) {
            list.add(data);
        }

        // method to pop the element
        public static int pop() {
            // check if the list is empty
            if (isEmpty()) {
                System.out.println("list is empty");
                return -1;
            }
            // for poping the element we first need to get the top element of the stack
            // step to get top element from the list
            // 1. use get function
            // 2. give the index- list.size() - 1 will give the index of the top element
            int top = list.get(list.size() - 1);

            // now we will remove the top element by remove(index) method
            list.remove(list.size() - 1);

            // now we will return the top element because after poping the element we need
            // to return it also

            return top;
        }

        // method for peek
        public static int peek() {
            // check if the list is empty
            if (isEmpty()) {
                System.out.println("list is empty");
                return -1;
            }

            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println("peek:" + st.peek());
        System.out.println("pop:" + st.pop());
        System.out.println("elements left");

        while (!st.isEmpty()) {
            System.out.println("elements:" + st.peek());
            st.pop();
        }
    }
}
