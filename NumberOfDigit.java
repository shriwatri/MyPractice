
public class NumberOfDigit {

	public static void main(String[] args) {
		int num = 1234569876;
		int count = 0;
		
		while(num > 0) {
			num/=10;
			count++;
		}
		System.out.println("Number of digit is: "+ count);
	}

}
