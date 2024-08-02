/*
Kth Level of a Tree
preOrder Traversal

*/

public class KthLevel {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void kthLevel(Node root, int k, int level) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.err.print(root.data + " ");
        }

        kthLevel(root.left, k, level + 1);
        kthLevel(root.right, k, level + 1);
    }

    public static void main(String[] args) {
        Node newNode = new Node(1);
        newNode.left = new Node(2);
        newNode.right = new Node(3);
        newNode.left.left = new Node(4);
        newNode.left.right = new Node(5);
        newNode.right.left = new Node(6);
        newNode.right.right = new Node(7);
        // preOrder(newNode);
        kthLevel(newNode, 5, 1);
    }
}
