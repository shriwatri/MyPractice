import java.util.Arrays;

public class EndZeroElementsInArray {

	public static void main(String[] args) {
		int arr[] = {10,0,20,30,0,0,7,9,3};
		int newArr[] =new int[arr.length];
		
		rearrange(arr,newArr);
		print(newArr);

	}

	private static void print(int[] newArr) {
		for (int i : newArr) {
			System.out.println(i);
		}
		System.out.println("Fingal result: "+Arrays.toString(newArr));
		
	}

	private static void rearrange(int[] arr, int[] newArr) {
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				newArr[j]=arr[i];
				j++;
			}
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {
				newArr[j]=arr[i];
				j++;
			}
			
		}
		
		
		
	}

}
