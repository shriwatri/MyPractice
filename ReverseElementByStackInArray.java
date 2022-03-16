import java.util.Arrays;
import java.util.Stack;

public class ReverseElementByStackInArray {

	public static void main(String[] args) {
		Stack stack = new Stack();
		int array[] = {2,5,3,4,8,4,3};
		System.out.println("Existing array:"+Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			stack.push(array[i]);
		}
		
		for (int i = 0; i < array.length; i++) {
			array[i]=(int) stack.pop();
		}
		
		System.out.println("Array after pop:"+Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
