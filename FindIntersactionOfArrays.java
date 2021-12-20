import java.util.Arrays;
import java.util.HashSet;

public class FindIntersactionOfArrays {

	public static void main(String[] args) {
		int arr1[]= {1,2,4,5,6};
		int arr2[]= {2,4,7,6,8,9};
		System.out.println("Array1"+Arrays.toString(arr1));
		System.out.println("Array2"+Arrays.toString(arr2));
		printIntersection(arr1,arr2);
		

	}

	private static void printIntersection(int[] arr1, int[] arr2) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0; i <arr1.length;i++) {
			hs.add(arr1[i]);
		}
		
		System.out.println("Intesections elements are:");
		
		for(int i=0; i < arr2.length; i++) {
			if(hs.contains(arr2[i])) {
				System.out.println(arr2[i]);
			}
		}
		
	}

}
