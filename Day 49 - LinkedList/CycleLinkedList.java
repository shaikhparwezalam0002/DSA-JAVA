//141. Linked List Cycle
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode s=head;
        ListNode f=head;

        while(f!=null && f.next !=null){
            s=s.next;
            f=f.next.next;
            if(f==s){
                return true;
            }
        }
        return false;
    }
}
