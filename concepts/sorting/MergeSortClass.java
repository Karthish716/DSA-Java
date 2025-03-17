package sample2;

import java.util.Arrays;

public class MergeSortClass {
	public static int[] mergeSort(int[] arr) {
		if (arr.length==1) 
			return arr;
		
		int mid = arr.length/2;
		
		int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
		int[] right= mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
		
		return merge(left,right);
		
	}	
	
	  public static int[] merge(int[] first,int[] second) {
	        	   
	         int[] joined= new int[first.length+second.length];
	          int i=0,j=0,k=0;
	       	 while(i<first.length && j<second.length) {
	     		 if(first[i]<second[j]) {
	       			 joined[k++]=first[i++];
	        		 }
	        		 else {
	        			 joined[k++]=second[j++];
	        		 } 
	        	    }
	        	 
	        	 while(i<first.length) {
	        	    	joined[k++]=first[i++];
	        	    }
	        	    while(j<second.length) 
	        	    {
	        	    	joined[k++]=second[j++];
	        	    }
	        	    return joined;
	        	   
	           }
	  
	  public static void mergeSortinPlace(int[] arr,int start,int end) {
			if (end-start==1) 
				return;
			
			int mid = (start+end)/2;
			
	         mergeSortinPlace(arr,start,mid);
	         mergeSortinPlace(arr,mid,end);
			
	         mergeinplace(arr,start,mid,end);
		}	
		
	  
	  public static void mergeinplace(int[] arr,int s,int m,int e) {
   	   
	         int[] joined= new int[e-s];
	          int i=s,j=m,k=0;
	       	 while(i<m && j<e){
	     		 if(arr[i]<arr[j]) {
	       			 joined[k++]=arr[i++];
	        		 }
	        		 else {
	        			 joined[k++]=arr[j++];
	        		 } 
	        	    }
	        	 
	        	 while(i<m) {
	        	    	joined[k++]=arr[i++];
	        	    }
	        	    while(j<e) 
	        	    {
	        	    	joined[k++]=arr[j++];
	        	    }
	        	 
	        	    
	        	    for(k=0;k<joined.length;k++) {
	        	    	arr[s+k]=joined[k];
	        	    }
	        	   
	           }
	  
	  
	  
	  
	
}
