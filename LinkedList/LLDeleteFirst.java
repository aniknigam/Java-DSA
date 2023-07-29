//WAP to perform delete first  operation in a linked list

package LinkedList;

public class LLDeleteFirst {
    // Why this head is declared outside of the Class Node{} ?

    // Declaring the head variable outside the Node class means that
    // it will have a broader scope, making it accessible from the context
    // where the linked list is being created or used. This allows you to
    // interact with the linked list as a whole rather than being limited
    // to individual nodes within the class.

    Node head;// Node head; variable is reference that allows you to access the first element
              // of the linked list
    /*
     * 
     * By declaring head as Node type, you ensure that head can store
     * references(memory address) to
     * objects of the Node class, enabling you to manipulate and traverse the linked
     * list effectively.
     * 
     * If you were to declare head as some other type, it wouldn't be able to store
     * references to nodes, and you wouldn't be able to build and work with the
     * linked list
     * correctly.
     * 
     */

    // Node class representing individual elements in the linked list
    class Node {
        String data;
        Node next; // it represent reference to the next node

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a new node at the beginning of the linked list
    void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            // If the list is empty, make the new node the head and end the method
            head = newNode;
            return;
        }

        // Set the next reference of the new Node to the current head
        // Before: newNode (data: "X", next: null) head -> "A" -> "B"
        // After: newNode (data: "X", next: "A") head -> "A" -> "B"

        newNode.next = head;

        // Update the head to the new Node, making it the first node in the list
        // Before: newNode (data: "X", next: "A") head -> "A" -> "B"
        // After: newNode (data: "X", next: "A") head -> "X" -> "A" -> "B"

        head = newNode;
    }

    // Method to add a new node at the end of the linked list
    void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            // If the list is empty, make the new node the head and end the method
            head = newNode;
            return;
        }

        // Node curNode = head; --> If the list is not empty, the method creates a new
        // reference
        // variable curNode and sets it to the head node. This variable will be used to
        // traverse the linked list to find the last node.

        Node curNode = head;

        // while (curNode.next != null) { ... }: This while loop is used to traverse the
        // linked list
        // until we find the last node. The loop continues as long as the next reference
        // of the current
        // node (curNode.next) is not null, which means there is a subsequent node.

        while (curNode.next != null) {

            // Let's illustrate this with a simple example. Suppose we have the following
            // linked list: "A" -> "B" -> "C" -> null.

            // The process in the loop would look like this:

            // Iteration 1: curNode points to the "A" node, and since curNode.next is not
            // null ("A" has a next node "B"), we move to the next node by setting curNode =
            // curNode.next.

            // Iteration 2: curNode points to the "B" node, and since curNode.next is not
            // null ("B" has a next node "C"), we move to the next node by setting curNode =
            // curNode.next.

            // Iteration 3: curNode points to the "C" node, and since curNode.next is null,
            // the loop terminates as we have reached the last node in the linked list.
            curNode = curNode.next;
        }

        // Link the new Node to the last Node in the list
        curNode.next = newNode;
    }

    // Method to print the elements of the linked list
    void printLinkedList() {
        if (head == null) {
            System.out.print("list is empty");
        } else {
            Node curNode = head;
            while (curNode != null) {
                // Print the data of the current node and move to the next node
                System.out.print(curNode.data + " --> ");
                curNode = curNode.next;
            }
            System.out.println("NULL");
        }
    }

    // Method for deleting the first element of the linked list
    void deleteFirst() {
        // Corner case: If the list is empty, there is nothing to delete
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        // Update the head to point to the next node, effectively removing the first
        // node
        head = head.next;
    }

    public static void main(String[] args) {
        LLDeleteFirst list = new LLDeleteFirst();

        // Adding elements to the linked list
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("a");
        list.addLast("list");

        // Display the linked list
        System.out.print("Linked list elements: ");
        list.printLinkedList();
        // output: this --> is --> a --> list --> NULL

        // Deleting the first element from the linked list
        list.deleteFirst();

        // Display the updated linked list
        System.out.print("Linked list after deleting first element: ");
        list.printLinkedList();
        // output: is --> a --> list --> NULL
    }
}
