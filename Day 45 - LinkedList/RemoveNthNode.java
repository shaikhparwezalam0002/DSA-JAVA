//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
//19. Remove Nth Node From End of List
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        ListNode curr=head;
        int c=0;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        int sz=c-n;
        if(sz==0){
            return head.next;
        }
        for(int i=1;i<sz;i++){
            head=head.next;
        }
        head.next=head.next.next;
        return curr;
    }
}//shaikh Parwez Alam
