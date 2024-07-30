//Top View of Binary Tree

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static class Info{
        int pos;
        Node currNode;
        public Info(int pos, Node currNode){
            this.pos=pos;
            this.currNode=currNode;
        }
    }
    static ArrayList<Integer> topView(Node root) {
        // add your code
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<Info> queue=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();
        int min=0,max=0;
        
        queue.add(new Info(min,root));
        queue.add(null);
        
        while(!queue.isEmpty()){
            Info inf=queue.remove();
            if(inf==null){
                if(queue.isEmpty()){
                    break;
                }
                else{
                    queue.add(null);
                }
            }
            else{
                if(!map.containsKey(inf.pos)){
                    map.put(inf.pos,inf.currNode);
                }
                
                if(inf.currNode.left!=null){
                    queue.add(new Info(inf.pos-1,inf.currNode.left));
                    min=Math.min(inf.pos-1,min);
                }
                 if(inf.currNode.right!=null){
                    queue.add(new Info(inf.pos+1,inf.currNode.right));
                    max=Math.max(inf.pos+1,max);
                }
            }
        }
        for(int i=min;i<=max;i++){
            list.add(map.get(i).data);
        }
        return list;
        
    }
}
