import java.util.Arrays;
import java.util.Collections;

public class ArraysSortDemo {

	public static void main(String[] args) {
		String strArray[] = {"one","Two","Three","Four"};
		System.out.println("Before sorting");
		System.out.println("=======================");
		System.out.println("------------------------------");
		for (String str: strArray) {
			System.out.println(str);
		}
		Arrays.sort(strArray);
		System.out.println("=======================");
		System.out.println("------------------------------");
		System.out.println("After sorting");
		for (String str: strArray) {
			System.out.println(str);
		}
		Arrays.sort(strArray, Collections.reverseOrder());
		System.out.println("=======================");
		System.out.println("After sorting as reverse order");
		System.out.println("------------------------------");
		for (String str: strArray) {
			System.out.println(str);
		}

	}

}
