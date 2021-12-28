import java.util.Scanner;

public class FirstLastDigitSum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number.");
		int num = scn.nextInt();
		//Last Digit we will use % modular operator
		int lastDigit = num%10;
		int firstDigit =num;
		while(firstDigit >= 10) {
			firstDigit/=10;
		}
		System.out.println("First Digit: "+firstDigit);
		System.out.println("Last Digit: "+lastDigit);
		System.out.println("Sum:"+(firstDigit+lastDigit));

	}

}
