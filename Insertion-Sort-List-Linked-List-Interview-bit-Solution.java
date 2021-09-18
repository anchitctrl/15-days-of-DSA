/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode A) {
        if(A==null) return A;
        ListNode result=new ListNode(0);
        ListNode res=result;
        ListNode current=A;
        ListNode next=null;
        // head = 4,2,1,3
        // result= 0---->4--->null
        while(current!=null){
            next=current.next;
            while(res.next!=null && res.next.val<current.val){
                res=res.next;
            }
            current.next=res.next;
            res.next=current;
            res=result;
            current=next;
        }
        return result.next;
    }
}
