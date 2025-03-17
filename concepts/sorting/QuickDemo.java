package sample2;

import java.util.Arrays;

public class QuickDemo {

	public static void main(String[] args) {
		
		int[] arr= {5,8,4,3,7,6,2,5};
		QuickSortClass.QuickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
