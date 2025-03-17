package sample;

public class StackusingLinkedList<T> {
       Node top; 
	class Node{
		T data;
		 Node next;
	Node(T val){
		this.data=val;
             
	}
	}
	StackusingLinkedList(){
		top=null;
	}
	
	public void push(T val){
		Node newnode = new Node(val);
		  
		newnode.next=top;
		top=newnode;
	       	
	}
	
	public T pop() {
		if(top==null)
		{
			throw new IndexOutOfBoundsException("Invalid pos");	
		}
		T temp=top.data;
		top = top.next;
		return temp;
	}
	public boolean Empty(){
		return top==null;
	}
	
	public T peek() {
		return top.data;
	}
	
	public void display() {
	       
		Node temp= top;
			while(top!=null) {
				
				System.out.println(temp.data);
				temp=temp.next;		
				if(temp==null)
				{
					throw new IndexOutOfBoundsException("Invalid pos");
				}
			}
		
	}
	
	
}
