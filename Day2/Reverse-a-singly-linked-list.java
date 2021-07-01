//method to reverse a Singly Linked List
	public ListNode reverseList() {
		if(head==null) {
			return head;
		} 
		ListNode current=head;
		ListNode previous=null;
		ListNode next=null;
		while(current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		return previous;
		
	}
