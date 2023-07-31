package LinkedList;

public class LLdeleteMiddle {

    Node head; // Reference to the head of the linked list
    private int size;

    LLdeleteMiddle() {
        this.size = 0;
    }

    // Inner class to define the structure of each node in the linked list
    class Node {
        String data; // Data stored in the node
        Node next; // Reference to the next node

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }

    }

    // Method to add a new node at the beginning of the linked list
    void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, the new node becomes the head
            return;
        }

        newNode.next = head; // Point the new node's next to the current head
        head = newNode; // Update the head to the new node
    }

    // Method to add a new node at the end of the linked list
    void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, the new node becomes the head
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next; // Traverse to the last node
        }

        currNode.next = newNode; // Append the new node at the end
    }

    // Method to print the elements of the linked list
    void printLinkedList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        } else {
            Node currNode = head;
            while (currNode != null) {
                System.out.print(currNode.data + "-->"); // Print the data of the current node
                currNode = currNode.next; // Move to the next node
            }

            System.out.println("Null");
        }
    }

    // Method to delete the first node of the linked list
    void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next; // Update the head to the second node
    }

    // Method to delete the last node of the linked list
    void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        // Start with two pointers, secondLast and last, both pointing to the head
        Node secondLast = head;
        Node last = head.next;

        size--;

        // If the linked list has only one node (head node), delete it (list becomes
        // empty)
        if (head.next == null) {
            head = null; // Set the head to null, effectively deleting the only node
            return;
        }

        // Traverse through the linked list until the last node is reached (last.next ==
        // null)
        while (last.next != null) {
            secondLast = secondLast.next; // Move the secondLast pointer one step forward
            last = last.next; // Move the last pointer one step forward
        }

        // At this point, 'last' will be pointing to the last node, and 'secondLast'
        // will be pointing to the second-to-last node.

        // Set the 'next' pointer of the second-to-last node to null, effectively
        // removing the last node from the list
        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    public void deleteMiddle(int index) {
        if (head == null) {
            System.out.println("linkedlist is empty");
            return;
        }
        size--;
        if (head.next == null || index == 0) {
            System.out.println("we have only one element so we are deleting that element.");
            head = null;
            return;
        }

        Node prevNode = head;
        Node deleteNode = prevNode.next;

        for (int i = 1; i <= index; i++) {
            if (i == index) {
                Node nextNode = deleteNode.next;
                deleteNode = null;
                prevNode.next = nextNode;
                break;
            }
        }

    }

    public static void main(String[] args) {
        LLdeleteMiddle list = new LLdeleteMiddle();
        list.addFirst("this");
        list.addLast("is");
        list.addLast("a list");
        list.printLinkedList();
        list.deleteFirst();
        list.printLinkedList();
        list.deleteLast();
        list.printLinkedList();
        list.deleteLast();
        list.printLinkedList();
        list.addFirst("I");
        list.addFirst("am");
        list.addFirst("deleting");
        list.addFirst("midddle");
        list.printLinkedList();
        list.deleteMiddle(1);
        list.printLinkedList();

    }
}
