//WAP to implement queue with the help of two stacks

package Queue;

import java.util.*;

public class QueueP1 {
    static class Queue {
        // we have to declare two stacks

        // stack1
        Stack<Integer> s1 = new Stack<>();
        // stack2
        Stack<Integer> s2 = new Stack<>();

        // initializing isEmpty funtion- so if s1 and s2 both are empty that means out
        // queue is empty
        public boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }

        public void add(int data) {
            // push elements of s1 in s2 till s1 is not empty
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // push data in s1
            s1.push(data);

            // push elements of s2 in s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.pop();
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.peek();

        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
