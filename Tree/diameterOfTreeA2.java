package Tree;

public class diameterOfTreeA2 {
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

        // The treeInfo class is a simple a container to hold two pieces of information:
        // the height of a subtree and the diameter of a subtree.
        static class treeInfo {
            int ht;
            int dia;

            treeInfo(int ht, int dia) {
                this.ht = ht;
                this.dia = dia;
            }
        }

        // The diameter function takes a Node as input and returns a treeInfo object
        // containing the height and
        // diameter of the subtree rooted at that node.
        public treeInfo diameter(Node root) {
            if (root == null) {
                return new treeInfo(0, 0);
            }

            // takeout the detail of left and right
            treeInfo left = diameter(root.left);
            treeInfo right = diameter(root.right);

            int myheight = Math.max(left.ht, right.ht) + 1; // +1 is the root node addition

            int diam1 = left.dia;
            int diam2 = right.dia;
            int diam3 = left.ht + right.ht + 1;

            int mydiameter = Math.max(Math.max(diam1, diam2), diam3);

            treeInfo myInfo = new treeInfo(myheight, mydiameter);
            return myInfo;
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(tree.diameter(root).dia);

    }
}
