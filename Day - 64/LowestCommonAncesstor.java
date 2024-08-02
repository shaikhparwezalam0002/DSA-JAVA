/*
Lowest common Ancestor
*/

import java.util.ArrayList;

public class LowestCommonAncesstor {
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

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> list1 = new ArrayList<>();
        ArrayList<Node> list2 = new ArrayList<>();
        getPath(root, n1, list1);
        getPath(root, n2, list2);
        int max = -1;
        for (int i = 0; i < list1.size() && i < list2.size(); i++) {
            if (list1.get(i) == list2.get(i)) {
                max = i;
            }
        }
        return list1.get(max);
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> list) {
        if (root == null) {
            return false;
        }
        list.add(root);

        if (root.data == n) {
            return true;
        }

        boolean foundLeft = getPath(root.left, n, list);
        boolean foundRight = getPath(root.right, n, list);
        if (foundLeft || foundRight) {
            return true;
        }
        list.remove(list.size() - 1);
        return false;

    }

    public static Node lca2(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node foundLeft = lca2(root.left, n1, n2);
        Node foundRight = lca2(root.right, n1, n2);
        if (foundLeft == null) {
            return foundRight;
        }
        if (foundRight == null) {
            return foundLeft;
        }
        return root;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = createRoot(arr);
        // preOrder(root);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        // int x = lca(root, 5, 6).data;
        // System.err.println(x);
        System.out.println(lca2(root, 2, 3).data);
    }
}
