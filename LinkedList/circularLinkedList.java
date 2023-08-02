package LinkedList;

public class circularLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a new node with data to the end of the circular linked list
    public void addLast(int data) {
        Node newNode = new Node(data); // Create a new node with the given data

        // Check if the list is empty (head is null)
        if (head == null) {
            head = newNode; // If the list is empty, make the new node the head of the circular list
            head.next = head; // Since there's only one node, it should point to itself forming a circular
                              // list

        } else {
            Node currNode = head; // Start from the head of the circular list

            // Traverse the circular list to find the last node (the node whose next points
            // to the head)
            while (currNode.next != head) {
                currNode = currNode.next;
            }

            currNode.next = newNode; // Set the next of the last node to the new node, making it the new last node
            newNode.next = head; // Set the next of the new node to the head, completing the circular link
        }
    }

    // Method to print the elements of the circular linked list
    public void printCircularLinkedList() {
        // Check if the list is empty (head is null)
        if (head == null) {
            System.out.println("List is empty"); // If the list is empty, print a message and return
        } else {
            Node currNode = head; // Start from the head of the circular linked list
            do {
                System.out.print(currNode.data + "  "); // Print the data of the current node
                currNode = currNode.next; // Move to the next node in the circular list
            } while (currNode != head); // Continue until we reach the head again, completing a full loop

            System.out.println(); // After printing all elements, move to the next line for readability
        }
    }

    public static void main(String[] args) {
        circularLinkedList list = new circularLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.printCircularLinkedList();
    }
}
