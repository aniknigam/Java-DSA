package LinkedList;

public class LLReverseRecursion {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;

        }

        currNode.next = newNode;
    }

    public void printLinkedList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        } else {
            Node currNode = head;
            while (currNode != null) {
                System.out.print(currNode.data + "-->");
                currNode = currNode.next;
            }
            System.out.println("NULL    ");
        }
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty.");
        }
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("list is empty");
        }

        Node secondLast = head;
        Node last = head.next;

        if (head.next == null) {
            head = null;
            return;
        }

        while (last.next != null) {
            secondLast = secondLast.next;
            last = last.next;
        }
        secondLast.next = null;
    }

    public Node reverseListRecursion(Node head) {
        // Base case: If the list is empty or has only one node, return the head itself.
        if (head == null || head.next == null) {
            return head;
        }

        // Recursive call: Reverse the rest of the list (from the second node onwards).
        Node newNode = reverseListRecursion(head.next);

        // Reversing the current node:
        // Step 1: Change the direction of the pointers.
        // ex - 2->3
        // to 3->2

        head.next.next = head;

        // Step 2: Set the current node's next pointer to null to make it the new tail.
        // break the point from 2->3 and only contain 3->2
        head.next = null;

        // Return the new head of the reversed list (which was the last node in the
        // original list).
        return newNode;
    }

    public static void main(String[] args) {
        LLReverseRecursion list = new LLReverseRecursion();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(5);
        list.addLast(7);
        list.printLinkedList();
        list.deleteFirst();
        list.deleteLast();
        list.printLinkedList();
        list.addFirst(19);
        list.addFirst(12);
        list.addFirst(15);
        list.printLinkedList();
        list.head = list.reverseListRecursion(list.head);
        list.printLinkedList();

    }
}
