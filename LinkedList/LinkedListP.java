//wap to check if the linked list is palindrome or not and return true if it is palindromic
package LinkedList;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    // Method to find the middle node of the list
    // This is hare and turtle approach where hare moves two steps and turtle moves
    // one step
    // and when the hare reaches the end, we will return the position of the turtle
    // at that point
    // Fast = hare
    // Slow is turtle
    public ListNode getMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    // Method to reverse the linked list
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            // update
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // By hare & turtle approach
        ListNode firstHalfEnd = getMiddle(head);
        ListNode secondHalfStart = reverse(firstHalfEnd.next);
        ListNode firstHalfStart = head;

        while (secondHalfStart != null) {
            if (secondHalfStart.val != firstHalfStart.val) {
                return false;
            }
            secondHalfStart = secondHalfStart.next;
            firstHalfStart = firstHalfStart.next;
        }

        return true;
    }
}

// Testing the code
public class LinkedListP {
    public static void main(String[] args) {
        // Create a sample linked list
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(node1)); // Output: true (Palindrome)
    }
}
