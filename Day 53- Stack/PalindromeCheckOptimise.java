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
        ListNode mid=findMid(head);
        ListNode rev=reverseNode(mid);
        while(rev!=null){
		    if(head.val!=rev.val){
		        return false;
		    }
		    head=head.next;
		    rev=rev.next;
		}
		return true;
    }
    public ListNode findMid(ListNode head) {
           ListNode slow=head;
           ListNode fast=head;
           while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next; 
           }
        return slow;
    }
    public ListNode reverseNode(ListNode slow){
        ListNode prev=null;
        while(slow!=null){
            ListNode next=slow.next;
                slow.next=prev;
                prev=slow;
                slow=next;
           }
           return prev;
    }
}
