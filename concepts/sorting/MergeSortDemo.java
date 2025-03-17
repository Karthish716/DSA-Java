package sample2;

import java.util.Arrays;

public class MergeSortDemo {

	public static void main(String[] args) {
        
		int[] arr= {4,7,2,9,3,1,6};
	     MergeSortClass.mergeSortinPlace(arr, 0,5);
         System.out.println(Arrays.toString(arr));
	}

}
