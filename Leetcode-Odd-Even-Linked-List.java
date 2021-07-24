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
    public ListNode addTail(ListNode head,int val){
        ListNode newNode=new ListNode(val);
        if(head==null){
            return newNode;
        }
        ListNode current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
        newNode.next=null;
        return head;
    }
    public ListNode oddEvenList(ListNode head) {
        // if(head==null)
        ListNode result1=null;
        ListNode result2=null;
        ListNode current=head;
        boolean b=true;
        while(current!=null){
            if(b){
                result1=addTail(result1,current.val);
                b=false;
            }
            else if(!b){
                result2=addTail(result2,current.val);
                b=true;
            }
            current=current.next;
        }
        ListNode temp=result1;
        if(temp==null) return result1;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=result2;
        return result1;
    }
}
