import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementInArray {

	public static void main(String[] args) {
		int arr[] = {10,20,20,30,40,40,70,50,20,30};
		bruteforce(arr);
		extraMemory(arr);
		
	}

	private static void extraMemory(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(set.contains(arr[i])) {
				System.out.println("Duplicate elements while adding set: "+arr[i]);
			}else {
				set.add(arr[i]);
			}
			
		}
		System.out.println("Unique elements in arraay are: "+ set);
		
	}

	private static void bruteforce(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate Element:"+arr[i]);
					
				}
			}
			
		}
		
	}

}
