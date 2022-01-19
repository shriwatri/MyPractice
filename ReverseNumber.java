
public class ReverseNumber {

	public static void main(String[] args) {
		Integer number = 123;
		String numberString = String.valueOf(number);
		String reverseStr ="";
		int numberLenght = numberString.length()-1;
		for (int i = numberLenght; i >= 0; i--) {
			reverseStr=reverseStr+numberString.charAt(i);
		}
		System.out.println("Reverse String=>"+Integer.valueOf(reverseStr));

	}

}
