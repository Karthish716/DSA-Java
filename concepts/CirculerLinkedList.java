package sample;

public class CirculerLinkedList<T> {
    
	Node last;
	class Node{
		T data;
		Node next;
	    
		Node(T val){
			this.data=val;
			next=null;
		}
		

	}
	CirculerLinkedList(){
		last=null;
	}
	
	public void insertatbigin(T val) {
		Node newnode = new Node(val);
		if(last==null) {
			newnode.next=newnode;
		      last=newnode;
		}
		else {
			newnode.next = last.next;
			last.next=newnode;
			
		}
	}
	
	public void insertatend(T val) {
		Node newnode = new Node(val);
		if(last==null) {
			newnode.next=newnode;
		      last=newnode;
		}
		else {
			newnode.next = last.next;
			last.next=newnode;
			last=newnode;
		}
	}
	
	public void dsisplay() {
		
		if(last==null) {
			return;
		}
		Node temp=last.next;
		do {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}while(temp!=last.next);
	}
	public T DeleteAtBegin() {
		if(last==null) {
			throw new IndexOutOfBoundsException("Invalid pos");
			
		}
		T temp=last.next.data;
			if(last.next==last) {
				last=null;
			}
			else {
				last.next=last.next.next;
			}
	return temp;
	}
	
	
	public void deteleAtEnd(){
		if(last==null) {
			throw new IndexOutOfBoundsException("Invalid pos");
			
		}
		if(last.next==last) {
			last=null;
		}
		else {
			Node temp=last.next;
			while(temp.next!=last) {
				temp=temp.next;
			}
		  temp.next=last.next;
		  temp=last;
		}
		
}
}

/*
 * delete valu("hello")
 * insertafter("vihnesh")
 * size()
 * contains()
 * doubly circuler linked list
 * 
 *
 */

