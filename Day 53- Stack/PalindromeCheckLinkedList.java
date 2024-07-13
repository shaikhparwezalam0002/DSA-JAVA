//https://leetcode.com/problems/palindrome-linked-list/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack=new Stack<>();
        ListNode temp=head;

        while(temp!=null){
            stack.push(temp.val);
            temp=temp.next;
        }
        while(head!=null && !stack.isEmpty()){
            if(head.val!= stack.peek()){
                return false;
            }
            head=head.next;
            stack.pop();
        }
        return true;
    }

}
