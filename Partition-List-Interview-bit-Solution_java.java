public class Solution {
    public ListNode partition(ListNode A, int B) {
        ListNode current=A;
        ListNode l1=new ListNode(0);
        ListNode head1=l1;
        ListNode l2=new ListNode(0);
        ListNode head2=l2;
        while(current!=null){
            ListNode newNode=new ListNode(current.val);
            if(current.val<B){
                l1.next=newNode;
                l1=l1.next;
            }
            else{
                l2.next=newNode;
                l2=l2.next;
            }
            current=current.next;
        }
        l1.next=head2.next;
        return head1.next;
    }
}
