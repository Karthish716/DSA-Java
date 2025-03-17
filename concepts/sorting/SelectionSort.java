package sample2;

public class SelectionSort {

	
	      public static void selectarray(int arr[]) {
	    	  for(int i=0;i<arr.length;i++) {

	    		  int minindex=i;
	    		  for(int j=i;j<arr.length;j++) {
	    			  if(arr[j]<arr[minindex]) {
	    			
	    				  minindex=j;
	
	    				  
	    			  }
	    		  }
	    		  int temp=arr[i];
	    		  arr[i]=arr[minindex];
	    		  arr[minindex]=temp;
	    	  }
	      }
	      
	      
	      public static void BubbleSort(int[] arr) {
	    	  for(int i=1;i<arr.length;i++) {
	    		  boolean swapped=false;
	    		  for(int j=0;j<arr.length-i;j++) {
	    			  if(arr[j]>arr[j+1]) {
	    				  swapped=true;
	    				  int temp=arr[j];
	    				  arr[j]=arr[j+1];
	    				  arr[j+1]=temp;
	    			  }
	    		  }
	    		  if(!swapped) {
	    			  break;
	    		  }
	    	  }
	      }
	      
	      
	      public static void InsertionSort(int[] arr) {
	    	  for(int i=1;i<arr.length;i++) {
	    		  for(int j=i;j>0;j--) {
	    			  if(arr[j]<arr[j-1]) {
	    				  int temp = arr[j];
	    				  arr[j]=arr[j-1];
	    				  arr[j-1]=temp;
	    			  }
	    			  else {
	    				   break;
	    			  }
	    		  }
	    	  }
	      }
	      
}
