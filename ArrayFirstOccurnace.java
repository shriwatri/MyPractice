
public class ArrayFirstOccurnace {

	public static void main(String[] args) {
		//Creation of array
		Integer arr[] = {1,2,3,10,4,5,22,5,8,5};
		
		//Loop the element from the first element
		for(int i=0;i<arr.length;i++) {
			//Loop the element from the second element
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
				System.out.println(arr[i]);
				return;
				}
				
			}
			
		}

	}

}
