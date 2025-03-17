package sample;

import java.util.Iterator;


public class DoublyLinkedList<T> implements Iterable<T>{
	
	  Node1 head;
	  Node1 tail;
	  class Node1{
			T data;
		    Node1 prev; 
			Node1 next;
		Node1(T val){
			this.data=val;
		}
	  }
	 
    DoublyLinkedList(){
    	head= null;
    	tail =null;
    	
    }
    
    public void insertatbigin(T val){
    	Node1 newnode = new Node1(val);
     	  newnode.next=head;
      if(head == null) {
      
            tail=newnode;
      } 
      else {
    	  head.prev=newnode;
 
    	 
      }
      head = newnode;
    }
   
    public void display() {
        if(head == null)
     	   System.out.println("This list is empty");
    	Node1 temp = head;
    	while(temp!=null) {
    		System.out.print(temp.data+"  ");
    		temp = temp.next;
    	}
    }
    
    public void displayRev() {
           if(head == null)
        	   System.out.println("This list is empty");
    	Node1 temp = tail;
    	while(temp!=null) {
    		System.out.print(temp.data+"  ");
    		temp = temp.prev;
    	}
    }
   
    public void insertatpos(int pos,T val) {
    	
    	if(pos==0)
    	{
    		insertatbigin(val);
    	     return;
    	}
    	Node1 newnode = new Node1(val);
           Node1 temp = head;
           for(int i=1;i<pos;i++) {
        	   temp=temp.next;
       if(temp==null) {
    	   throw new IllegalArgumentException("Invalid pos"+pos);
       }
           }
           newnode.next=temp.next;
           newnode.prev=temp;
        if(temp==tail)
        {
        	tail=newnode;
        }
        	else {
           temp.next.prev=newnode;
           temp.next=newnode;
           }
    }

    public void deleteatpos(int pos) {
    	if(head==null) {
    		throw new IndexOutOfBoundsException("Invalid pos"+pos);
    	}
    	if(pos==0) {
    		head=head.next;
    		if(head==null)
    			tail=null;
    		head.prev=null;
    		return;
    	}
       Node1 temp=head;
       Node1 prev=null;
       for(int i=1;i<=pos;i++) {
    	   prev = temp;
    	   temp=temp.next;
    	   if(temp==null) {
    		   throw new IndexOutOfBoundsException("Invalid pos"+pos);
    	   }
    	   
       }
       prev.next=temp.next;  
       if(temp.next==null)
    	   tail=prev;
       else
       temp.next.prev=prev;
    }


@Override
public Iterator<T> iterator() {
	
	
	return new Iterator<T>() {
		 Node1 temp = head;
		 public boolean hasNext() {
			 return temp!=null;
			 
		 }
		 public T next() {
			 T val = temp.data;
			 temp =temp.next;
			 return val;
		 }
	 };
}



}



/*
 * loop - o(n)
 * no loop- o(1)
 *deleteAtend
 *delete at begin
 *search
 */
