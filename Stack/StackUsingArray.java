package Stack;

class Stack {
    int[] a; // Array to store the elements of the stack
    int top; // Index of the top element in the stack
    int capacity; // Maximum capacity of the stack
    int size = 0; // Current number of elements in the stack

    // Constructor to create a stack with a given capacity
    public Stack(int capacity) {
        if (capacity <= 0) {
            // This prevents the creation of a stack with an invalid capacity and helps
            // catch programming errors early on during development.
            throw new IllegalArgumentException("Capacity must be a positive integer.");
        }
        this.capacity = capacity;
        top = -1; // Initialize the top index to -1, as the stack is initially empty
        a = new int[capacity]; // Create an array with the specified capacity to hold the elements
    }

    // Method to push an element onto the stack
    public void push(int data) {
        if (top == capacity - 1) {
            // This prevents the creation of a stack with an invalid capacity and helps
            // catch programming errors early on during development.
            throw new IllegalStateException("Stack Overflow"); // Check if the stack is full before pushing
        }
        size++; // Increase the size of the stack
        top++; // Move the top index to the next position
        a[top] = data; // Store the new element at the top of the stack
    }

    // Method to pop the top element from the stack
    public int pop() {
        if (top == -1) {
            // This prevents the creation of a stack with an invalid capacity and helps
            // catch programming errors early on during development.

            throw new IllegalStateException("Stack Underflow"); // Check if the stack is empty before popping
        }
        int result = a[top]; // Get the top element from the stack
        top--; // Move the top index down to the previous position
        size--; // Decrease the size of the stack
        return result; // Return the popped element
    }

    // Method to peek at the top element of the stack without removing it
    public int peek() {
        if (top == -1) {
            // This prevents the creation of a stack with an invalid capacity and helps
            // catch programming errors early on during development.

            throw new IllegalStateException("Stack Underflow"); // Check if the stack is empty before peeking
        }
        return a[top]; // Return the top element of the stack
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1; // If the top index is -1, the stack is empty
    }

    // Method to get the current size of the stack
    public int size() {
        return size; // Return the current number of elements in the stack
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        try {
            // Create a stack with a capacity of 4
            Stack s = new Stack(4);

            // Push elements into the stack
            s.push(1);
            s.push(2);
            s.push(3);

            // Print the current size of the stack
            System.out.println("size of the stack is " + s.size());

            // Pop an element from the stack and print the value
            System.out.println("popped element is " + s.pop());

            // Print the updated size of the stack
            System.out.println("size of the stack is " + s.size());

            // Pop more elements from the stack and print their values
            System.out.println("popped element is " + s.pop());
            System.out.println("popped element is " + s.pop());

            // Attempt to pop from an empty stack (will throw an exception)
            System.out.println("popped element is " + s.pop());

            // Push more elements into the stack
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);

            // Pop and print all elements in the stack until it becomes empty
            while (!s.isEmpty()) {
                System.out.println(s.peek());
                s.pop();
            }
        } catch (IllegalArgumentException e) {
            // Catch and handle an exception if the capacity is invalid
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalStateException e) {
            // Catch and handle an exception if there is a stack overflow or underflow
            System.out.println("Error: " + e.getMessage());
        }
    }
}