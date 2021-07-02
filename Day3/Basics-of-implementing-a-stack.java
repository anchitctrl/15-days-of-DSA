import java.util.Scanner;
import java.util.EmptyStackException;

public class ImplementStack {
	
	private ListNode top;
	private int length;
	
	public class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public ImplementStack() {
		top=null;
		length=0;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public void push(int data) {
		ListNode temp=new ListNode(data);
		temp.next=top;
		top=temp;
		length++;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int result=top.data;
		top=top.next;
		length--;
		return result;
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	public static void main(String[] args) {
		ImplementStack stack=new ImplementStack();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			stack.push(sc.nextInt());
		}
		stack.pop();
		System.out.println(stack.peek());
	}
}
