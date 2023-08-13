package Tree;

import java.util.*;

public class treeProblem {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        int index = -1;

        public Node buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public int sumAtKlength(Node root, int target) {
            if (root == null)
                return 0;

            // Create a Queue to perform level-order traversal
            Queue<Node> que = new LinkedList<>();
            int level = 0; // Initialize the current level
            int sum = 0; // Initialize the sum of node values at the target level

            // Enqueue the root node to start traversal
            que.add(root);
            que.add(null); // Using null as a level arranging

            while (!que.isEmpty()) {
                Node curNode = que.peek(); // Get the front node from the queue
                que.remove(); // Dequeue the current node

                if (curNode != null) {
                    if (level == target) {
                        sum += curNode.data; // If the current level matches the target, add the node value to the sum
                    }

                    // Enqueue the left and right children of the current node, if they exist
                    if (curNode.left != null) {
                        que.add(curNode.left);
                    }
                    if (curNode.right != null) {
                        que.add(curNode.right);
                    }
                } else if (!que.isEmpty()) {
                    que.add(null); // Add a level delimiter to mark the end of the current level
                    level++; // Move to the next level
                }
            }

            return sum; // Return the sum of node values at the target level
        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(tree.sumAtKlength(root, 2));
    }
}
