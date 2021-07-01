public void length() {
		int len=0;
		ListNode current=head;
		while(current!=null) {
			current=current.next;
			len++;
		}
		System.out.println(len);
	}
