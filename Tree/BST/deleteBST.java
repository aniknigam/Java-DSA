package Tree.BST;

public class deleteBST {
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

    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        }

        else if (root.data < val) {
            root.right = delete(root.right, val);
        }

        else {// root.data == val

            // case 1
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2
            if (root.left == null) {
                return root.right;
            }

            else if (root.right == null) {
                return root.left;
            }

            // case 3
            else {
                // find inorder successor
                Node IS = InroderSuccessor(root.right);
                root.data = IS.data; // update the value of root to inorder successor
                root.right = delete(root.right, val);// delete the left most in right subtree
            }
        }

        return root;
    }

    // by this method we get the left most Node of right subtree
    public static Node InroderSuccessor(Node root) {
        // this root is root.right
        while (root != null) {
            root = root.left;
        }
        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        preorder(root.left);
        System.out.print(root.data + " ");
        preorder(root.right);
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        preorder(root);
        System.out.println();
        delete(root, 6);
        preorder(root);
        System.out.println();
        delete(root, 5);
        preorder(root);
        System.out.println();

        // output after each deletion
        // 1 3 4 5 6 8 10 11 14
        // 1 3 4 5 8 10 11 14
        // 1 3 4 8 10 11 14

    }
}
