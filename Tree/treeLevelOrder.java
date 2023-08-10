package Tree;

import java.util.*;

public class treeLevelOrder {
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

        public Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public void levelOrder(Node root) {
            // create a queue from collection framework
            Queue<Node> q = new LinkedList<>();
            // add root into the queue
            q.add(root);
            // after adding root add null
            q.add(null);

            // run the loop until the queue is empty
            while (!q.isEmpty()) {
                // romove the Node in the queue and store it in currNode
                Node currNode = q.remove();
                // if currNode is null then print the line
                if (currNode == null) {
                    System.out.println();
                    // add null again if q is not empty
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    // if currNode is not null then print the data
                    System.out.print(currNode.data);
                    // add left and right Node
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.levelOrder(root);
    }
}
