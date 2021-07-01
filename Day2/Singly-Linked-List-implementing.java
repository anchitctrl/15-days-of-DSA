import java.util.Scanner;

public class SinglyLinkedList {
	
	//initializing Singly Linked List
	private ListNode head;
	
	private static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	//method to print all the values of Singly Linked List
	public void printsll() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.head=new ListNode(10);
		ListNode first=new ListNode(9);
		ListNode second=new ListNode(8);
		ListNode third=new ListNode(7);
		ListNode fourth=new ListNode(6);
		
		//connection between them
		sll.head.next=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		
		sll.printsll();

	}

}
