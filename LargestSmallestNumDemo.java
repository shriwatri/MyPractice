
public class LargestSmallestNumDemo {

	public static void main(String[] args) {
		int[] intArray = new int[] {10,5,20,3,60,80,4,6,100,5,8,9};
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for(int number:intArray) {
			if(number > largest) {
				largest=number;
			}
		}
		System.out.println("Largest number is "+largest);
		
		for(int number:intArray) {
			if(number < smallest) {
				smallest=number;
			}
		}
		System.out.println("Smallest number is "+smallest);

	}

}
