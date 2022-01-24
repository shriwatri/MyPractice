import java.util.Arrays;

public class DeleteElement {
	public static void main(String[] args) {
		int[] firstArray = {1,2,3,4,5};
		System.out.println("Original Array:"+ Arrays.toString(firstArray));
		int index=3;
		int[] secondArray = new int[firstArray.length-1];
		for (int i = 0,k=0; i < firstArray.length; i++) {
			if(i==index) {
				continue;
			}
			secondArray[k++]=firstArray[i];
			
		}
		System.out.println("New Array:"+ Arrays.toString(secondArray));
	}

}
