class MyLinkedList {

    private ListNode head;
    public static class ListNode{
        private int val;
        private ListNode next;
        
        public ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    
    public int length(ListNode head){
        if(head==null) return 0;
        ListNode current=head;
        int count=0;
        while(current!=null){
            current=current.next;
            count++;
        }
        return count;
        
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index>=length(head)) return -1;
        ListNode current=head;
        while(index >0){
            current=current.next;
            index--;
        }
        return current.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode newNode=new ListNode(val);
        newNode.next=head;
        head=newNode;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        if(head==null){
            addAtHead(val);
            return;
        }
        ListNode newNode=new ListNode(val);
        ListNode current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
        newNode.next=null;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index>length(head)) return;
        if(index==0){
            addAtHead(val);
            return;
        }
        ListNode newNode=new ListNode(val);
        ListNode current=head;
        while(index >1){
            current=current.next;
            index--;
        }
        ListNode previous=current.next;
        current.next=newNode;
        newNode.next=previous;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index>=length(head)) return;
        ListNode current=head;
        while(index >1){
            current=current.next;
            index--;
        }
        if(index==0 && current.next==null){
            head=null;
            return;
        }
        else if(index==0){
            current=current.next;
            head.next=null;
            head=current;
        }
        current.next=current.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
