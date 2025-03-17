package sample2;
import java.util.*;
public class LinearSearchDemo {

	public static void main(String[] args) {
	      
		
		int[] arr={1,2,5,7,5,5,9,4};
		System.out.println(LinearSearch.find(arr, 5));
		System.out.println(LinearSearch.contains(arr, 89));
	
	int[][] twodim= {
			{2,7,4},
			{4,9,23,19},
			{34,65,78}
	};
                int[] result=LinearSearch.findtwo(twodim, 54);
	      System.out.println(Arrays.toString(result));
	}
	
	
	

}
