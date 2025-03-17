package sample;

public class QueueArray2 {
	
	  static final int MAX_SIZE=30;
      int arr[] = new int[MAX_SIZE];
      int rear;
      
      QueueArray2(){
     	 rear=-1;
      }
	   
     public void Enqueue(int val){
     	 if(rear==MAX_SIZE-1) {
     		 throw new IndexOutOfBoundsException("Stack over flow");
     	 }
   
     	 arr[++rear]=val;
     	 
      }
     
     
     public int Dequeue() {
     	if(rear==-1) {
     		throw new IndexOutOfBoundsException("Array is empty");
     	}
     	int temp=arr[0];
     	for(int i=1;i<=rear;i++) {
     	
     		arr[i-1]=arr[i];
     	
     	}
     	rear--;
     	return temp;
     }

}
