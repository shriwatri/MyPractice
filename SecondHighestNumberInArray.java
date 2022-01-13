import java.util.Arrays;
import java.util.Scanner;

public class SecondHighestNumberInArray {

	public static void main(String[] args) {
		int array[] = {1,20,6,5,3,9,18,20,34,22};
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter which highest element you wants in array"+Arrays.toString(array));
		int position= scn.nextInt();
		Arrays.sort(array);
		System.out.println("Yours sorted arrays");
		System.out.println(Arrays.toString(array));
		System.out.println(position+" highest element in array: "+array[array.length-position]);

	}

}
