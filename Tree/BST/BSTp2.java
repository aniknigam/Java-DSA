package Tree.BST;

import java.util.*;

public class BSTp2 {
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

    public static Node insert(Node root, int val) {
        // if root is null then we simply create Node for value
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // update root.left by recursive call
            root.left = insert(root.left, val);
        } else {
            // root.data < val
            // update root.right by recursive call
            root.right = insert(root.right, val);
        }
        // return the root
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i));
        }
        System.out.println();
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {

        if (root == null) {
            // if root is null we simply return
            return;
        }
        // add root data in a path
        path.add(root.data);

        // if we reached the leaf node then we print the path
        if (root.left == null && root.right == null) {
            printPath(path);
        } else { // when we have not yet reached the leaf node
            // add for left sub tree
            printRoot2Leaf(root.left, path);

            printRoot2Leaf(root.right, path);
        }

        // Now remove the last node
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        printRoot2Leaf(root, new ArrayList<>());
    }
}
