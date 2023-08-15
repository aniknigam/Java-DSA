// wrte a program to print the number in a given range.

package Tree.BST;

public class BSTp1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

        public static Node insert(Node root, int val) {
            if (root == null) {
                root = new Node(val);
                return root;
            }

            if (root.data > val) {
                root.left = insert(root.left, val);
            } else {
                root.right = insert(root.right, val);
            }

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

        public static void printInRange(Node root, int X, int Y) {
            if (root == null) {
                return;
            }
            // this means root lies between X and Y
            if (root.data >= X && root.data <= Y) {
                printInRange(root.left, X, Y);
                System.out.print(root.data + " ");
                printInRange(root.right, X, Y);
            } else if (root.data >= Y) {// when the range is found in left sub tree
                printInRange(root.left, X, Y);
            } else {// when the range is found in right sub tree
                printInRange(root.right, X, Y);
            }
        }

        public static void main(String[] args) {
            int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
            Node root = null;
            for (int i = 0; i < values.length; i++) {
                root = insert(root, values[i]);
            }
            inorder(root);
            System.out.println();

            printInRange(root, 5, 11);
            // output
            // 5 6 8 10 11
        }
    }
}
