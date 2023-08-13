package Tree.BST;

public class insertBST {

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

    public static void main(String[] args) {
        // these values will become nodes of tree
        int values[] = { 5, 1, 3, 4, 2, 7 };

        // initially root will be null
        Node root = null;

        // loop that will take values one-one
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        // inorder- to check if the tree is BST or not
        inorder(root);

    }
}
