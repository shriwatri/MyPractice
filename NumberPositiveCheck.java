import java.util.Scanner;

public class NumberPositiveCheck {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number to check +ve or -ve: ");
		Integer number = scn.nextInt();
		if(number>0) {
			System.out.println(number+" Number is +ve.");
		}else {
			System.out.println(number+" Number is -ve.");
		}

	}

}
