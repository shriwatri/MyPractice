import java.util.Scanner;

public class ReverseNumberDemo1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number.");
		int number = scn.nextInt();
		int reverse=0;
		
		while(number!=0) {
			int digit=number%10;
			reverse=reverse*10+digit;
			number=number/10;
			
		}
		System.out.println("Reverse number is:"+reverse);

	}

}
