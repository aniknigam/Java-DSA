package LinkedList;

public class doublyLinkedList {

    Node head;
    Node tail;
    int size;

    // Constructor to initialize an empty doubly linked list
    doublyLinkedList() {
        this.size = 0;
    }

    // Inner class representing a node in the doubly linked list
    class Node {
        int data;
        Node next;
        Node prev;

        // Constructor to create a new node with the given data
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
            size++; // Increment the size of the list whenever a new node is created.
        }
    }

    // Method to get the current size of the doubly linked list
    public int size() {
        return size;
    }

    // Method to add a new node with the given data to the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            // If the list is empty, set both head and tail to the new node
            head = newNode;
            tail = newNode;
        } else {
            // Otherwise, adjust pointers to add the new node at the beginning
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Method to add a new node with the given data to the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            // If the list is empty, set both head and tail to the new node
            head = newNode;
            tail = newNode;
        } else {
            // Otherwise, adjust pointers to add the new node at the end
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Method to delete the first node in the list
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (head == tail) {
            // If there is only one node in the list, set both head and tail to null
            head = null;
            tail = null;
        } else {
            // Otherwise, adjust pointers to remove the first node
            head = head.next;
            head.prev = null;
        }
        size--; // Decrement the size of the list after deletion.
    }

    // Method to delete the last node in the list
    public void deleteLast() {
        if (head == null || tail == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }
        if (head == tail) {
            // If there is only one node in the list, set both head and tail to null
            head = null;
            tail = null;
        } else {
            // Otherwise, adjust pointers to remove the last node
            tail = tail.prev;
            tail.next = null;
        }
        size--; // Decrement the size of the list after deletion.
    }

    // Method to print the elements of the list from the head to tail
    public void printLinkedList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // Method to print the elements of the list from the tail to head
    public void printbackwark() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node curNode = tail;
        while (curNode != null) {
            System.out.print(curNode.data + " --> ");
            curNode = curNode.prev;
        }
        System.out.println("NULL");
    }

    // Main method to test the doublyLinkedList class
    public static void main(String[] args) {
        doublyLinkedList list = new doublyLinkedList();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addFirst(0);
        list.printLinkedList();
        list.deleteFirst();
        list.deleteLast();
        list.printLinkedList();
        list.printbackwark();
        System.out.println("Size of the list: " + list.size());
    }
}
