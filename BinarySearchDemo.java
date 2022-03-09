
public class BinarySearchDemo {

	public static void main(String[] args) {
		int arr[] = {10,30,50,80,100,110};
		int searchElement = 110;
		int index = binarySearch(arr,0,(arr.length-1),searchElement);
		System.out.println("Element found at index: "+index);

	}

	private static int binarySearch(int[] arr, int low, int high, int searchElement) {
		if(high >=low) {
			int mid = low +((high-low)/2);
			if(arr[mid]==searchElement)
				return mid;
			if(searchElement  > arr[mid]) {
				//search the element in the right hand side
				return binarySearch(arr, mid+1, high, searchElement);
			}
			if(searchElement  < arr[mid]) {
				//search the element in the left hand side
				return binarySearch(arr, low, mid-1, searchElement);
			}
			
		}
		return -1;
	}

}
