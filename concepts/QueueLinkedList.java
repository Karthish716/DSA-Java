package sample;

public class QueueLinkedList {
	
	Node front,rear;
        class Node{
        	int data;
             Node next;        	
        	
        Node(int val){
        	this.data=val;
        }
        }
        QueueLinkedList(){
          front =null;
          rear=null;
        }
        
        
        public void Enqueue(int val) {
        	Node newnode = new Node(val);
        	if(front==null)
        	{
        	front = newnode;
            rear=newnode;
        	}
        	else {
        		rear.next=newnode;
        		rear=newnode;
        	}
        }
        public int Dequeue() {
        	if(front==null) {
        		throw new IndexOutOfBoundsException("Array is empty");
        	}
        	int temp=front.data;
        	front = front.next;
        	if(front==null)
             rear=null;
        	return temp;
        	
        }
	public boolean isEmpty() {
		return front==null;
	}
        
     public int elementatFront() {
    	 if(front==null) {
    		 throw new IndexOutOfBoundsException("Queue is Empty");
    	 }
    	 return front.data;
     }
}
