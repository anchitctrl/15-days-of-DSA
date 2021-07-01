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
	
	//method to find the length of Singly Linked List
	public void length() {
		int len=0;
		ListNode current=head;
		while(current!=null) {
			current=current.next;
			len++;
		}
		System.out.println(len);
	}
	
	//method to insert a value at the beginning of the Linked List
	public void insertAtbeginning(int value) {
		ListNode begin=new ListNode(value);
		ListNode current=head;
		begin.next=current;
		head=begin;
		printsll();
	}
	
	public static void main(String[] args) {
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.head=new ListNode(10);
		ListNode first=new ListNode(9);
		ListNode second=new ListNode(8);
		ListNode third=new ListNode(7);
		ListNode fourth=new ListNode(6);
		ListNode fifth=new ListNode(5);
		
		//connection between them
		sll.head.next=first;
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		
		sll.printsll();
		sll.length();
		sll.insertAtbeginning(11);
		sll.insertAtend(4);

	}

}
