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
    public int length(ListNode head){
        if(head==null) return 0;
        ListNode current=head;
        int count=0;
        while(current!=null){
            current=current.next;
            count++;
        }
        return count;
    }
    
    public ListNode removeHead(ListNode head){
        ListNode current=head.next;
        head.next=null;
        head=current;
        return head;
    }
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int temp=length(head)-n;
        if(length(head)==1){
            return null;
        }
        ListNode current=head;
        if(temp==0){
            return removeHead(head);
        }
        while(temp-- >1){
            current=current.next;
        }
        current.next=current.next.next;
        return head;
    }
}
