//Diameter of the tree- it is the longest path between two nodes
//This is approach 1 and this approach has time complexity of O(n^2)

package Tree;

public class diameterOfTreeA1 {
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

        public int height(Node root) {
            if (root == null) {
                return 0;
            }

            int leftsubTree = height(root.left);
            int rightsubTree = height(root.right);
            int myheight = Math.max(leftsubTree, rightsubTree) + 1; // 1 is tha root node
            return myheight;
        }

        // time complexity - O(n^2)
        public int diameter(Node root) {
            if (root == null) {
                return 0;
            }

            int diam1 = diameter(root.left);
            int diam2 = diameter(root.right);
            // diam3 when the diameter of a tree goes through root node
            int diam3 = height(root.left) + height(root.right) + 1;

            return Math.max(diam1, Math.max(diam2, diam3));

        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println("The diameter of the tree is: " + tree.diameter(root));
    }
}
