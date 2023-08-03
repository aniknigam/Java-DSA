package Stack;

public class StackLL {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head;

        // method to check if the stack is empty or not
        public static boolean isEmpty() {
            // this means if head == null then retur ture.
            return head == null;
        }

        // method to push the element in the linked list at the top
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // method to pop the element from the linked list from the top and print the
        // element

        public static int pop() {
            if (isEmpty()) {
                // -1 is representing that the stack is empty
                return -1;
            }
            // take out the top element from the Stack
            int top = head.data;
            // deleting operation head = head.next;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        int removeTop = s.pop();
        System.out.println("the value we have removed is: " + removeTop);

        System.out.println("Now the peek element is:" + s.peek());

        // as soon as this while condition is ture stop the loop
        System.out.println("Printing all the values which are left");
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
