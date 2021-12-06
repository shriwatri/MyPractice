
public class CountOddAndEvenDigits {

	public static void main(String[] args) {
		int num = 67456;
		int evenCount = 0;
		int oddCount = 0;
		
		while(num > 0) {
			int rem = num % 10;
			if(rem%2 == 0) {
				evenCount++;
				
			}else {
				oddCount++;
			}
			
			num/=10;
		}
		System.out.println("Count of even number: "+evenCount + " ,Count of odd number: "+oddCount);

	}

}
