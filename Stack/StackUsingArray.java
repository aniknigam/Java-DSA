package Stack;

class Stack {
    int[] a;
    int top;
    int capacity;
    int size = 0;

    public Stack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be a positive integer.");
        }
        this.capacity = capacity;
        top = -1;
        a = new int[capacity];
    }

    public void push(int data) {
        if (top == capacity - 1) {
            throw new IllegalStateException("Stack Overflow");
        }
        size++;
        top++;
        a[top] = data;
    }

    public int pop() {
        if (top == -1) {
            throw new IllegalStateException("Stack Underflow");
        }
        int result = a[top];
        top--;
        size--;
        return result;
    }

    public int peek() {
        if (top == -1) {
            throw new IllegalStateException("Stack Underflow");
        }
        return a[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return size;
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        try {
            Stack s = new Stack(4);
            s.push(1);
            s.push(2);
            s.push(3);
            System.out.println("size of the stack is " + s.size());
            System.out.println("popped element is " + s.pop());
            System.out.println("size of the stack is " + s.size());
            System.out.println("popped element is " + s.pop());
            System.out.println("popped element is " + s.pop());
            System.out.println("popped element is " + s.pop());
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);

            while (!s.isEmpty()) {
                System.out.println(s.peek());
                s.pop();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
