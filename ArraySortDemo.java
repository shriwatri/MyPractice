import java.util.Arrays;

public class ArraySortDemo {

	public static void main(String[] args) {
		int[] intArr = {5,9,1,2,4,10,8,7};
		System.out.println("Array before sorting: "+ Arrays.toString(intArr));
		Arrays.sort(intArr);
		System.out.println("Array After sorting: "+ Arrays.toString(intArr));

	}

}
