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
		ArrayList<Integer> arr= new ArrayList<>();
		while(head!=null){
            arr.add(head.val);
			head=head.next;
		}
        boolean flag=true;
        int j=arr.size()-1;
        for(int i=0;i<arr.size()/2;i++){
            if(arr.get(i)==arr.get(j)){
                flag=true;
                j--;
            }
            else{
                flag=false;
                break;
            }
        }
        return flag;
    }
}
