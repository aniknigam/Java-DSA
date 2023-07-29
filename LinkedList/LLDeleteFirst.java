//WAP to perform delete first  operation in a linked list

package LinkedList;

public class LLDeleteFirst {
    Node head;

    // Node class representing individual elements in the linked list
    class Node {
        String data;
        Node next;

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
        newNode.next = head;

        // Update the head to the new Node, making it the first node in the list
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

        Node curNode = head;

        while (curNode.next != null) {
            // Traverse the list to find the last node
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
