package sample2;

public class LinearSearch {

	          public static int find(int[]arr,int target) {
	        	       
	        	  for(int i=0;i<arr.length;i++)               
	        		  if(arr[i]==target)
	        			  return i;
	        	
	        	  return -1;
	          }
	          
	          
	          public static boolean contains(int[]arr,int target) {
       	       
	        	  for(int i=0;i<arr.length;i++)
	        		  if(arr[i]==target)
	        			  return true;
	        	
	        	  return false;
	          }
	                      
	          public static int findstr(String str,char target) {
	        	   for(int i=0;i<str.length();i++) {
	        		   if(str.charAt(i)==target) {
	        			  return i; 
	        		   }
	        	   }
	        	  return -1;
	        	  
	        	 
	          }
	          
	          public static int[] findtwo(int[][] arr,int target) {
	        	  for(int i=0;i<arr.length;i++) {
	        		  for(int j=0;j<arr[i].length;j++) {
	        			  if(arr[i][j]==target) {
	        				  return new int[] {i,j};
	        			  }
	        		  }
	        	  }
	        	  return new int[] {-1,-1};
	          }
	          
	          
	          
}
