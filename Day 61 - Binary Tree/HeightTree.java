public class HeightTree{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHt=height(root.left);
        int rightHt=height(root.right);
        return Math.max(leftHt,rightHt)+1;
    }
    
    public static void main(String[] args) {
        Node nodes=new Node(1);
        nodes.left=new Node(2);
        nodes.right=new Node(3);
        nodes.right.left=new Node(5);
        nodes.right.right=new Node(4);
        nodes.right.right.right=new Node(6);
        System.out.println(HeightTree.height(nodes));
    }
}
