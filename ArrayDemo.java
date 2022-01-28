import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] numbers = new int[6];
		numbers[0]=10;
		numbers[1]=1;
		numbers[2]=2;
		numbers[3]=3;
		numbers[4]=4;
		numbers[5]=5;
		System.out.println("Otput by for loop");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("Otput by Arrays.toString(numbers)"+Arrays.toString(numbers));
		
		System.out.println("Otput by foreach");
		for (int i : numbers) {
			System.out.println(i);
		}
		

	}

}
