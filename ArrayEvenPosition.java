
public class ArrayEvenPosition {

	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9};
		for(int i=2; i < arr.length; i+=2) {
			System.out.print("Index: "+ i);
			System.out.println(" Value: "+ arr[i]);
		}

	}

}
