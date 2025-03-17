package sample3;



public class DoublyLinked {

	node head;
	node tail;
	class node{
		int data;
		node next;
        node prev;
      
        node(int val) {
        	data = val;
        	next = null;
            prev = null;
        }
	
	}
    DoublyLinked(){
     	head=null;
     	tail =null;
    }
	
	
	
	public void insertatbig(int val) {
		
		node newnode =new node(val);
		
		newnode.next = head;
		if(head==null) {
			tail = newnode;
			
		}
		else {
			head.prev=newnode;
			
		}
		
		head = newnode;
	}
	
	
	void displayd() {
		if(head==null) {
			System.out.println("List is is empty");
		}
		node temp=head;
		while(temp!=null) {
			System.out.print(" "+temp.data);
		     temp=temp.next;
		}	
		
	}
	
	void displayrev() {
		if(head==null) {
			System.out.println("List is is empty");
		}
		node temp=head;
		while(temp!=null) {
			System.out.print(" "+temp.data);
		     temp=temp.prev;
		}	
		
	}
	
	
	public void insertatpos(int pos, int val) {
		
		node temp;
		temp=head;
		if(head==null) {
			insertatbig(val);
			return;
		}
		node newnode =new node(val);
		for(int i=0;i<pos;i++) {
			
			temp=temp.next;
			
			if(temp==null) {
				throw new IllegalArgumentException("Invalid pos " + pos);
			}
		}
		newnode.next=temp.next;
		newnode.prev=temp;
		if(temp==tail) {
			tail=newnode;
		}
		
		temp.next.prev=newnode;
		temp.next=newnode;
	}
	
	
	

	
	
	
}
