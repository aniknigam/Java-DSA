// Programm to implement pre order in a tree 
// Pre order = Root , Left Node, Right Node
package Tree;

public class treePreOrder {
    // Node class
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

    // method to return root node
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

        // method for preorder
        // time complexity - O(n)
        public void preorder(Node root) {
            if (root == null) {// this means -1
                return;
            }
            System.out.print(root.data + "  ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("data  at root node is ->" + root.data);
        System.out.println("Pre Order Sequence");
        tree.preorder(root);

    }
}
