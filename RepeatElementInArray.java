
public class RepeatElementInArray {

	public static void main(String[] args) {
		int arr1[] = {2,3,4,5,6,1,2,3}; 
		int temp[] = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			if(temp[arr1[i]]==1) {
				System.out.println(arr1[i]);
			}else {
				temp[arr1[i]]++;
			}
			
		}

	}

}
