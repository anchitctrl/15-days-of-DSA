/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int length(ListNode head){
        int count=0;
        if(head==null) return 0;
        ListNode current=head;
        while(current!=null){
            current=current.next;
            count++;
        }
        return count;
    }
    public ListNode move(ListNode head, int x){
        ListNode current=head;
        while(x>0){
            current=current.next;
            x--;
        }
        head=current;
        return head;
    }
    public ListNode demo(ListNode head1,ListNode head2){
        ListNode current1=head1;
        ListNode current2=head2;
        while(current1!=current2 && current1!=null && current2!=null){
            current1=current1.next;
            current2=current2.next;
        }
        if(current1==null) return null;
        return current1;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=length(headA);
        int lenB=length(headB);
        int diff=0;
        ListNode result=null;
        if(lenA>lenB){
            diff=lenA-lenB;
            headA=move(headA,diff);
            result=demo(headA,headB);
        }
        else if(lenB>lenA){
            diff=lenB-lenA;
            headB=move(headB,diff);
            result=demo(headB,headA);
        }
        else{
            result=demo(headA,headB);
        }
        return result;
    }
}
