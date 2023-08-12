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
            // If the current node is null
            if (root == null)
                return 0;

            // Create Queue
            Queue<Node> que = new LinkedList<>();

            // Enqueue the root node
            que.add(root);

            // Level is used to track
            // the current level
            int level = 0;

            // To store the sum of nodes
            // at the Kth level
            int sum = 0;

            // flag is used to break out of
            // the loop after the sum of all
            // the nodes at Nth level is found
            int flag = 0;

            // Iterate the queue till its not empty
            while (!que.isEmpty()) {

                // Calculate the number of nodes
                // in the current level
                int size = que.size();

                // Process each node of the current
                // level and enqueue their left
                // and right child to the queue
                while (size-- > 0) {
                    Node ptr = que.peek();
                    que.remove();

                    // If the current level matches the
                    // required level then calculate the
                    // sum of all the nodes at that level
                    if (level == target) {

                        // Flag initialized to 1
                        // indicates that sum of the
                        // required level is calculated
                        flag = 1;

                        // Calculating the sum of the nodes
                        sum += ptr.data;
                    } else {

                        // Traverse to the left child
                        if (ptr.left != null)
                            que.add(ptr.left);

                        // Traverse to the right child
                        if (ptr.right != null)
                            que.add(ptr.right);
                    }
                }

                // Increment the variable level
                // by 1 for each level
                level++;

                // Break out from the loop after the sum
                // of nodes at K level is found
                if (flag == 1)
                    break;
            }
            return sum;
        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(tree.sumAtKlength(root, 1));
    }
}
