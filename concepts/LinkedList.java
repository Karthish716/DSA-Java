package sample;

import java.util.Iterator;
public class LinkedList<T> implements Iterable<T>{ 
	Node1 head;
	  
	  class Node1{
			T data;
			Node1 next;
		Node1(T val){
			this.data=val;
		}
	  }
	  
    LinkedList(){
    	head= null;
    	
    }
    
    public void insertatbigin(T val){
    	Node1 newnode = new Node1(val);
      if(head == null) {
            head=newnode;
      } 
      else {
    	  newnode.next=head;
    	  head = newnode;
      }
         
    }
    
    public void display() {
    	Node1 temp = head;
    	while(temp!=null) {
    		System.out.print(temp.data+"  ");
    		temp = temp.next;
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
           temp.next=newnode;
    	
    }
    
    public void deleteatpos(int pos) {
    	if(head==null) {
    		throw new IndexOutOfBoundsException("Invalid pos"+pos);
    	}
    	if(pos==0) {
    		head=head.next;
    		return;
    	}
       Node1 temp=head;
       Node1 prev=null;
       for(int i=1;i<=pos;i++) {
    	   prev = temp;
    	   temp=temp.next;
    	   
       }
       prev.next=temp.next;    	   
    }

 public void reverse() {
	 Node1 prev = null;
	 Node1 current= head;
	 Node1 next = head.next;
	 while(current!=null) {
		 next=current.next;
		 current.next=prev;
		 prev = current;
		 current = next;
		 current=next;
		 
	 }
	 head=prev;
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

