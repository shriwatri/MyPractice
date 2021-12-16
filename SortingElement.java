import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortingElement {

	public static void main(String[] args) {
		//Approach 1
		int a[] ={20,30,50,10,45,5,4,3,29,1};
		/*
		System.out.println("Array before sorting: "+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Array after Arrays.parallelSort(a) sorting: "+Arrays.toString(a));
		*/
		
		//Approach 2
		/*
		System.out.println("Array before sorting: "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array after Arrays.sort(a) sorting: "+Arrays.toString(a));
		*/
		
		//Reverse descending order
		Integer b[] ={20,30,50,10,45,5,4,3,29,1};
		System.out.println("Array before sorting: "+Arrays.toString(b));
		Arrays.sort(b, Collections.reverseOrder());
		System.out.println("Array after Arrays.sort(b, Collections.reverseOrder()) sorting: "+Arrays.toString(b));
		

	}

}
