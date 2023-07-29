// This code will perform three function
//1. It will add elements at the beginning of the linked list
//2. It will add elements at the last of the linked list
//3. It will print the list.

// Define a LinkedList class with a Node as an inner class
package LinkedList;

class LL {
    Node head; // Declare the head of the LinkedList

    // Node class to represent each element in the LinkedList
    class Node {
        String data; // Data stored in the Node
        Node next; // Reference to the next Node in the LinkedList

        // Constructor to create a new Node with given data
        Node(String data) {
            this.data = data;
            this.next = null; // Initialize the next reference to null
        }
    }

    // Method to add data to the beginning of the LinkedList
    public void addFirst(String data) {
        Node newNode = new Node(data); // Create a new Node with the given data
        if (head == null) { // If the LinkedList is empty, set the new Node as the head
            head = newNode;
            return;
        }
        newNode.next = head; // Set the next reference of the new Node to the current head...newNode is
                             // pointing to the head
        head = newNode; // Update the head to the new Node
    }

    // Method to add data to the end of the LinkedList
    public void addLast(String data) {
        Node newNode = new Node(data); // Create a new Node with the given data
        if (head == null) { // If the LinkedList is empty, set the new Node as the head
            head = newNode;
            return;
        }

        Node currNode = head; // Start from the head of the LinkedList
        while (currNode.next != null) { // Traverse to the last Node in the LinkedList
            currNode = currNode.next;
        }
        currNode.next = newNode; // Set the next reference of the last Node to the new Node
    }

    // Method to print the LinkedList
    public void printLinkedList() {
        if (head == null) { // If the LinkedList is empty, print a message and return
            System.out.println("Linked List is empty.");
            return;
        }
        Node currNode = head; // Start from the head of the LinkedList
        while (currNode != null) { // Traverse the LinkedList until the end
            System.out.print(currNode.data + " --> "); // Print the data of the current Node
            currNode = currNode.next; // Move to the next Node
        }
        System.out.println("NULL"); // Print "NULL" to indicate the end of the LinkedList
    }

    public static void main(String[] args) {
        LL list = new LL(); // Create a new LinkedList object
        list.addFirst("a"); // Add "a" to the beginning of the LinkedList
        list.addFirst("is"); // Add "is" to the beginning of the LinkedList
        list.printLinkedList(); // Print the current state of the LinkedList

        list.addFirst("this"); // Add "this" to the beginning of the LinkedList
        list.addLast("list"); // Add "list" to the end of the LinkedList
        list.printLinkedList(); // Print the current state of the LinkedList

        // The output will be: this --> is --> a --> list --> NULL
    }
}
