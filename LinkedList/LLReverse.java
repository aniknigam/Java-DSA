package LinkedList;

public class LLReverse {

    Node head; // Reference to the first node (head) of the linked list
    private int size; // Variable to keep track of the size of the linked list

    LLReverse() {
        this.size = 0; // Constructor to initialize the size to 0 when a new LinkedList is created
    }

    // Node class represents each element (node) of the linked list
    class Node {
        String data; // Data stored in the node
        Node next; // Reference to the next node in the list

        Node(String data) {
            this.data = data;
            this.next = null; // By default, the new node points to null (indicating the end of the list)
            size++; // Increase the size of the linked list whenever a new node is created
        }
    }

    // Add a new node with the given data to the beginning of the linked list
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode; // If the list is empty, make the new node the head of the list
            return;
        }

        newNode.next = head; // Link the new node to the current head
        head = newNode; // Update the head to point to the new node
    }

    // Add a new node with the given data to the end of the linked list
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If the list is empty, make the new node the head of the list
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next; // Traverse the list to find the last node
        }

        currNode.next = newNode; // Link the new node to the last node's "next" reference
    }

    // Print the elements of the linked list
    public void printLinkedList() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node currNode = head;

            while (currNode != null) {
                System.out.print(currNode.data + "  -->  "); // Print the data in the current node
                currNode = currNode.next; // Move to the next node
            }
            System.out.println("NULL");
        }
    }

    // Delete the first node (head) of the linked list
    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        size--;
        head = head.next; // Update the head to the next node, effectively removing the first node
    }

    // Delete the last node of the linked list
    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;

        size--;

        if (head.next == null) {
            head = null; // If the list has only one node, set head to null, making the list empty
            return;
        }

        while (lastNode.next != null) {
            lastNode = lastNode.next; // Traverse the list to find the last node
            secondLast = secondLast.next; // Keep track of the second last node
        }

        secondLast.next = null; // Set the next reference of the second last node to null to remove the last
                                // node
    }

    // Get the size of the linked list
    public int getSize() {
        return size;
    }

    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node curNode = head.next;

        while (curNode != null) {
            Node nextNode = curNode.next;
            curNode.next = prevNode;

            // update

            prevNode = curNode;
            curNode = nextNode;
        }

        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {
        // Test the LinkedList implementation
        LLReverse list = new LLReverse();
        list.addFirst("a");
        list.addLast("list");
        list.printLinkedList();
        list.addFirst("is");
        list.addFirst("this");
        list.printLinkedList();
        list.deleteFirst();
        list.printLinkedList();
        list.deleteLast();
        list.printLinkedList();
        System.out.println(list.getSize());
        list.addLast("hello");
        list.addLast("world");
        list.printLinkedList();
        System.out.println(list.getSize());
        list.reverseList();

    }
}
