/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> nodesVisited = new HashSet<>();
        while (head != null) {
            if (!nodesVisited.add(head)){
                return head;
            } 
            head = head.next;
        }
        return null;
    }
}
