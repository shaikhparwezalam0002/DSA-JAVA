
import java.util.LinkedList;
import java.util.Queue;
public class BTree
{
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
    
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
        public static void PreOrder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            inOrder(root.left);
            inOrder(root.right);
        }
        public static void inOrder(Node root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

        public static void postOrder(Node root){
            if(root==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelOrder(Node root){
            if(root==null){
                    return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode=q.remove();
                
                if(currNode==null){
                    System.out.println("");
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }
        public static int heightTree(Node root){
            if(root==null){
                return 0;
            }
            int lh=heightTree(root.left);
            int rh=heightTree(root.right);
            int mh=Math.max(lh,rh);
            return mh+1;
        }
        public static int count(Node root){
            if(root==null){
                return 0;
            }
            int lc=count(root.left);
            int rc=count(root.right);
            int c=lc+rc+1;
            return c;
        }
        public static int sum(Node root){
            if(root==null){
                return 0;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
           int sum=0;
            while(!q.isEmpty()){
                Node currNode=q.remove();
                sum+=currNode.data;
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
            return sum;
        }
        //approach -2 
        static int sum=0;
        public static int sumTree(Node root){
            if(root==null){
                return 0;
            }
            int lsum=sumTree(root.left);
            int rsum=sumTree(root.right);
            sum=lsum+rsum+root.data;
            return sum;
        }
    }
	public static void main(String[] args) {
	    int[] tree={2,4,3,-1,-1,8,-1,-1,5,7,-1,-1,-1};
	    Node root=BinaryTree.buildTree(tree);
        BinaryTree.PreOrder(root);
        System.out.println("");
        BinaryTree.inOrder(root);
        System.out.println("");
        BinaryTree.postOrder(root);
	    //System.out.print(root.data);
        System.out.println("");
        BinaryTree.levelOrder(root);
        //System.out.println("");
        int height=BinaryTree.heightTree(root);
        System.out.println(height);
        System.out.println(BinaryTree.count(root));
        System.out.println(BinaryTree.sum(root));
        System.out.println("Binary tree sum "+BinaryTree.sumTree(root));
	}
}
