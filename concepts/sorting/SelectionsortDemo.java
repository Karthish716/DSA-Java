package sample2;

import java.util.Arrays;

public class SelectionsortDemo {

	public static void main(String[] args) {
	      
		int[] arr= {12,4,11,14,17,12};
   
        //SelectionSort.InsertionSort(arr);    
     
		 SelectionSort.BubbleSort(arr);
		
		System.out.println(Arrays.toString(arr));
}
}