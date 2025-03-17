package sample3;




public class Linkedlist1<T> {

	node head;
	
	class node {
		
		T data;
		node next;
		node(T val){
			data=val;
			next=null;
		}
		   
	}
	Linkedlist1(){
		head=null;
		
	}
	
	public void insertatbig(T val){
		node newnode = new node(val);
		
		if(head==null) {
			head=newnode;
		}
		else {
			newnode.next=head;
			head=newnode;
			
		}
	}
	
	public void display() {
		node temp=head;
		while(temp !=null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
			
		}
	}
	
	public void insertatpos(int pos, T val) {
		
		if(pos==0) {
		     insertatbig(val);
		     return;
		}
		node newnode = new node(val);
		node temp = head;
		for(int i=1;i<pos;i++) {
			temp = temp.next;
			
			if(temp==null) {
				throw new IllegalArgumentException("Invalid pos " + pos);
			}
			
		}
		newnode.next=temp.next;
		temp.next= newnode;
	}
	
	public void deletatpos(int pos) {
		if(head == null) {
			throw new IndexOutOfBoundsException("Invalid pos ");
			}
           
		if(pos==0) {
			head = head.next;
		}
		
		node temp= head;
		node prev = null;
		for(int i =1;i<=pos;i++)
		{
			prev = temp;
			temp = temp.next;
			}
		prev.next=temp.next;
		
		}
	
	
	
	
	public void reverselist() {
	  node prev = null;
	  node current = head;
	  node next = head.next;
	  
	  while(current !=null) {
		  next=current.next;
		  current.next=prev;
		  prev = current;
		  current = next;
	  }
	  head=prev;
	  
	}
	
}
