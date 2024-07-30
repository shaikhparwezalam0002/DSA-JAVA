//2583. Kth Largest Sum in a Binary Tree - leetcode
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root==null){
            return (long)-1;
        }

        Queue<TreeNode> list=new LinkedList<>();
        HashMap<Integer,Long> s=new HashMap<>();
        list.add(root);
        list.add(null);
        int count=0;
        long add=0;
        while(!list.isEmpty()){
            TreeNode curr=list.remove();
            if(curr==null){
                if(list.isEmpty()){
                    break;
                }
                else{
                    count++;
                    add=0;
                    list.add(null);
                }
            }
            else{
                add=add+curr.val;
                s.put(count,add);
                if(curr.left!=null){
                    list.add(curr.left);
                }
                if(curr.right!=null){
                    list.add(curr.right);
                }
            }

        }

        Long[] ll=new Long[s.size()];
        for(int i=0;i<s.size();i++){
            ll[i]=s.get(i);
        }
        Arrays.sort(ll,Collections.reverseOrder());
        if(k>ll.length){
            return -1;
        }else{
            return ll[k-1];
        }
    }
}
