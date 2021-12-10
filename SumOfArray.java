
public class SumOfArray {

	public static void main(String[] args) {
		int a[] = {5,2,7,9,6};
		int sum = 0;
		
		/*
		int length =a.length;
		for(int i=0; i < length-1;i++) {
			sum+=a[i];
			
		}
		
		*/
		
		//Enhanced for loop
		for(int value :a) {
			sum+=value;
			
		}
		System.out.println("Sum of array is: "+sum);

	}

}
