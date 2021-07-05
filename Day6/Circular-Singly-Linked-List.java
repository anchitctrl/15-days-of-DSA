package circularsll;

public class circularsll {
	private ListNode last;
	private int length;
	
	private class ListNode {
		private ListNode next;
		private int data;
		
		public ListNode(int data) {
			this.data=data;
		}
	}
	
	public circularsll() {
		last=null;
		length=0;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public void display() {
		ListNode first=last.next;
		while(first!=last) {
			System.out.print(first.data+"-->");
			first=first.next;
		}
		System.out.println(first.data);
	}
	
	public void insertFirst(int value) {
		ListNode newNode=new ListNode(value);
		ListNode first=last.next;
		last.next=newNode;
		newNode.next=first;
	}
	
	public void insertLast(int value) {
		ListNode newNode=new ListNode(value);
		ListNode first=last.next;
		last.next=newNode;
		newNode.next=first;
		last=newNode;
	}
	
	public void removefirst() {
		ListNode first=last.next.next;
		last.next=first;
	}
	
	public void demo() {
		ListNode first=new ListNode(1);
		ListNode second=new ListNode(2);
		ListNode third=new ListNode(3);
		ListNode fourth=new ListNode(4);
		
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=first;
		
		last=fourth;
		display();
		
		insertFirst(10);
		display();
		
		insertLast(98);
		display();
		
		removefirst();
		display();
	}
	
	public static void main(String[] args) {
		circularsll Obj=new circularsll();
		Obj.demo();
	}
	
}
