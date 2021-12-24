import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[] = {10,20,30,60,80,100};
		System.out.println("Array before reverse applied: " + Arrays.toString(arr));
		int low=0, high = arr.length-1;
		while(low<high){
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
			
		}
		System.out.println("Arrays after reverse applied and used Arrays.toString method to display arrays element:"+Arrays.toString(arr));
		System.out.println("Arrays element display by forEach:");
		for (int i : arr) {
			System.out.print(i+",");
			
		}
		
	}

}
