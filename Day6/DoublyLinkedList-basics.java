public class DoublyLinkedList{
	
	private ListNode head;
	private ListNode tail;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		private ListNode previous;
		
		public ListNode(int data) {
			this.data=data;
		}
	}
	
	public DoublyLinkedList() {
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public int length() {
		return length;
	}
	
	public void displayForward() {
		if(head==null) return;
		
		ListNode current=head;
		System.out.println("Forward");
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("null");
	}
	
	
	public void displayBackward() {
		if(head==null) return;
		
		ListNode current=tail;
		System.out.println("Backward");
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.previous;
		}
		System.out.println("null");
	}
	
	public void insertFirst(int value) {
		ListNode newNode=new ListNode(value);
		if(head==null) {
			tail=newNode;
		}
		else {
			head.previous=newNode;
		}
		newNode.next=head;
		head=newNode;
		length++;
	}
	
	public void insertEnd(int value) {
		ListNode newNode=new ListNode(value);
		if(head==null) tail=newNode;
		else tail.next=newNode;
		newNode.previous=tail;
		tail=newNode;
		length++;
	}
	
	public void insertAtposition(int value,int position) {
		ListNode newNode=new ListNode (value);
		ListNode current=head;
		while(position-- >2) {
			current=current.next;
		}
		ListNode temp=current.next;
		current.next=newNode;
		newNode.next=temp;
		temp.previous=newNode;
		newNode.previous=current;
	}
	
	public void deleteFirst() {
		ListNode current=head;
		ListNode temp=current.next;
		temp.previous=null;
		current.next=null;
		head=temp;
		length--;
	}
	
	public void deleteLast() {
		ListNode current=tail;
		ListNode temp=current.previous;
		temp.next=null;
		current.previous=null;
		tail=temp;
		length--;
	}
	
	public void deleteAtposition(int position) {
		ListNode current=head;
		while(position-->2) {
			current=current.next;
		}
		ListNode temp=current.next.next;
		current.next=temp;
		temp.previous=current;
		length--;
	}
	
	public static void main(String[] args) {
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.insertFirst(5);
		dll.insertFirst(4);
		dll.insertFirst(3);
		dll.insertFirst(2);
		dll.insertFirst(1);
		dll.insertEnd(6);
		dll.insertAtposition(10,4);
		
		dll.deleteFirst();
		dll.deleteLast();
		
		dll.deleteAtposition(3);
		
		dll.displayForward();
		dll.displayBackward();
	}
	
}
