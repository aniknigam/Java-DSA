//In this program we will create a Node of the Binary Tree and write a function to get the Root Node of the tree.
package Tree;

public class treeRootAndNode {
    // Node class for tree
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
        // we will traverse to whole tree with this index whose initial value is -1
        int index = -1;

        // this method will take all our nodes as a parameter and return our root node
        public Node buildTree(int nodes[]) {
            // as soon as we will call the function index will be updated
            index++;
            if (nodes[index] == -1) {
                // -1 represent null node
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void main(String[] args) {

        // these are the nodes of the tree that is given in pre order sequence
        // preorder = Root, Left, Right
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        // create an object of Binary Tree
        BinaryTree tree = new BinaryTree();
        // we will call buildTree function and pass all the node and store it in root
        // node
        Node root = tree.buildTree(nodes);

        System.out.println(root.data);
    }
}
