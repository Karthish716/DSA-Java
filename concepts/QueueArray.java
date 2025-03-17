package sample;

public class QueueArray {
         static final int MAX_SIZE=30;
         int arr[] = new int[MAX_SIZE];
         int front,rear;
         
         QueueArray(){
        	 front=-1;
        	 rear=-1;
         }
	   
        public void Enqueue(int val){
        	 if(rear==MAX_SIZE-1) {
        		 throw new IndexOutOfBoundsException("Stack over flow");
        	 }
        		 if(front==-1)
        		 {
        			 front++;
        	 }
        	 
        	 arr[++rear]=val;
        	 
         }
        
        
        public int Dequeue() {
        	if(front==-1 || front>rear) {
        		throw new IndexOutOfBoundsException("Array is empty");
        	}
        	return arr[front++];
        	
        }
         
         
}
