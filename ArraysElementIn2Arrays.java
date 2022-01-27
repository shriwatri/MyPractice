import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArraysElementIn2Arrays {

	public static void main(String[] args) {
		Integer[] arr1 = {1,2,3,9,8,7};
		Integer[] arr2 = {4,1,2,3,10,15};
		Integer[] arr3 = {5,1,2,3,4,10};
		System.out.println("Array1-->"+Arrays.toString(arr1));
		System.out.println("Array2-->"+Arrays.toString(arr2));
		System.out.println("Array3-->"+Arrays.toString(arr3));
		HashSet<Integer> h = new HashSet<Integer>();
		List<Integer> l1 = Arrays.asList(arr1);
		List<Integer> l2 = Arrays.asList(arr2);
		List<Integer> l3 = Arrays.asList(arr3);
		 h.addAll(l1);
		 h.addAll(l2);
		 h.addAll(l3);
		 System.out.println("All unique element in hashset->"+h);
		 List<Integer> finalList = new ArrayList<Integer>();
		for (Integer number : h) {
			if((l1.contains(number) && l2.contains(number)) || (l2.contains(number) && l3.contains(number))
					||  (l3.contains(number) && l1.contains(number))) {
				finalList.add(number);
				
			}
			
		}
		System.out.println("Element which belongs to atleast two array-->"+finalList);

	}

}
