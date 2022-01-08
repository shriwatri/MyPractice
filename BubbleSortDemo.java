
public class BubbleSortDemo {

	public static void main(String[] args) {
		int a[]= {5,63,6,8,5,8,9,77,4};
		System.out.println("Array before sorting:");
		for(int i:a) {
			System.out.println(i);
		}
		bubbleSort(a);
		System.out.println("Array after sorting:");
		for(int i:a) {
			System.out.println(i);
		}

	}
	
	private static void bubbleSort(int[] intArray) {
		int temp=0;
		for(int i=0; i <=intArray.length;i++) {
			
			for (int j = 1; j < (intArray.length); j++) {
				if(intArray[j-1] > intArray[j]) {
					temp=intArray[j-1];
					intArray[j-1]=intArray[j];
					intArray[j]=temp;
				}
				
			}
		}
	}
	
	

}
