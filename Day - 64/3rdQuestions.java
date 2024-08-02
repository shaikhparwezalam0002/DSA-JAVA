/*
Minimum Distance between 2 Nodes
Kth Ancestor of Node
Transform to Sum Tree
*/

import java.util.ArrayList;

public class MinDisNode {
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

    static int idx = -1;

    public static Node createRoot(int[] arr) {

        idx++;
        if (arr[idx] == -1) {
            return null;
        }
        Node node = new Node(arr[idx]);
        node.left = createRoot(arr);
        node.right = createRoot(arr);
        return node;
    }

    public static void calMinDis(Node root, int n1, int n2) {
        ArrayList<Node> list1 = new ArrayList<>();
        ArrayList<Node> list2 = new ArrayList<>();
        int n1Count = getLca(root, n1);
        int n2Count = getLca(root, n2);
        System.out.println(n1Count + n2Count);
        return;
    }

    static int count = 0;

    public static int getLca(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int leftDist = getLca(root.left, n);
        int rightDist = getLca(root.right, n);
        if (leftDist == -1 && rightDist == -1) {
            return leftDist;
        } else if (leftDist == -1) {
            return rightDist + 1;
        } else {
            return leftDist + 1;
        }

    }

    public static int KthAncestor(Node root, int node, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == node) {
            return 0;
        }
        int foundLeft = KthAncestor(root.left, node, k);
        int foundRight = KthAncestor(root.right, node, k);
        if (foundLeft == -1 && foundRight == -1) {
            return -1;
        }
        int max = Math.max(foundLeft, foundRight);
        if (max + 1 == k) {
            System.out.println(root.data);
            // return 0;
        }
        return max + 1;
    }

    public static int sumSubTree(Node root) {
        if (root == null) {
            return 0;
        }
        int left = sumSubTree(root.left);
        int right = sumSubTree(root.right);
        int data = root.data;
        int newLeft = (root.left != null) ? root.left.data : 0;
        int newRight = (root.right != null) ? root.right.data : 0;
        root.data = newLeft + left + newRight + right;
        return data;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = createRoot(arr);
        // calMinDis(root, 5, 6);
        // KthAncestor(root, 5, 1);
        sumSubTree(root);
        preOrder(root);
    }
}
